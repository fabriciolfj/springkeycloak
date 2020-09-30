package com.github.fabriciolfj.springoauth.controller;

import com.github.fabriciolfj.springoauth.response.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UsersController {

    @PostAuthorize("hasAuthority('ROLE_developer')")
    @GetMapping("/status/check")
    public String status() {
        log.info("Executou");
        return "Working...";
    }

    @PreAuthorize("hasAuthority('ROLE_developer') or #id == #jwt.subject")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        return "Delete user with id " + id + " and JWT subject " + jwt.getSubject();
    }

    @PostAuthorize("returnObject.userId == #jwt.subject") //o retorno do objeto deve ser igual ao subject do token
    @GetMapping(path = "/{id}")
    public User getUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        return new User("Fabricio", "Jacob","c9d84627-36b3-4324-93c0-c689ceba783b");
    }
}
