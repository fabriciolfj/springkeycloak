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
- Nivel de segurança na chamada do metodo: 
    - Secured(), 
  PreAuthorize -> Indicado para consulta, verifica depois que o método for chamado se o usuário possui permissão.
  PostAuthorize -> indicado para escrita, valida antes da chamada do método se o usuário possui a permissão
  Existem algumas expressões regulares que também podem ser utilizadas: @PreAuthorize("hasRole('ADMIN') or returnObject.userId == principal.userId")
