package com.baeldung.keycloak;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping(path = "/customers")
    public String customers(Principal principal) {

        return "Hello " + principal.getName()+"<br><br> "+"<a href='/index2.html'>Chat room </a> "+"<br><br> " + "<a href='/logout'>Logout</a>";

    }

}
