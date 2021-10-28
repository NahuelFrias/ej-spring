package com.ejemplospring.ejspring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author leonahuel
 */
@Controller("")
@RequestMapping("")
public class PortalControlador {

    @GetMapping("/")
    public String index() {
        return "Index-ej.html";
    }

}
