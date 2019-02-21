package com.baeldung.keycloak;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebController {


    @GetMapping(path = "/")
    public String index() {
        return "external";
    }


    @GetMapping(path = "/logout")
    public void logout(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
         request.logout();
         response.sendRedirect("/");
    }


}
