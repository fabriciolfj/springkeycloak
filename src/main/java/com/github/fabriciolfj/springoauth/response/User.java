package com.github.fabriciolfj.springoauth.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String nome;
    private String sobreNome;
    private String userId;
}
