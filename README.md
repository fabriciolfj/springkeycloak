# Spring Keycloak

###### Papel do keycloak
- Uso para validar e gerar token
- Alimentar o token com os scopes do client id (se o app cliente pode ou não acessar tal recurso).

###### Alguns conceitos
- Role: exemplos admin, user e etc.
- Authorities: visualizar relatório, editar pedido, criar usuário e etc.
- Padrão de criação de um Role: ROLE_ADMIN, ROLE_USER e etc.
- Uso de um role: hasRole("ADMIN"), hasAuthority("ROLE_ADMIN")
- Authority ficam armazenados em Collection<GrantedAuthority>
