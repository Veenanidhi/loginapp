package com.veena.login.Loginapp.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @Controller
    public class SecurityConfig {
        @GetMapping("/")
        public String home(){
            return "homepge";
        }

        @GetMapping("/login")
        public String showLoginForm(Model model){
            Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
            if(authentication==null||authentication instanceof AnonymousAuthenticationToken){
                return "login";
            }
            return "redirect:/";
        }


    }
}
