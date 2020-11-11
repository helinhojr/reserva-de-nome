/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.teste.controller;

import com.teste.teste.modelo.Reserva;
import com.teste.teste.reposy.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author User
 */
@Controller
public class ReservaController {

    @Autowired
    ReservaRepository rr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String iniciar() {
        return "index";
    }
//    @RequestMapping(value = "/form", method = RequestMethod.GET)
//    public String inicia() {
//        return "form";
//    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView registar(Reserva reserva, String socios, MultipartFile[] ficheiros) {
        ModelAndView mv = new ModelAndView("index");
        boolean grav = true;
        rr.save(reserva);
        mv.addObject("grav", grav);
        mv.addObject("rs", true);
        mv.addObject("tipo", "Reserva");
        mv.addObject("verdade", false);
        return mv;
    }

    @RequestMapping(value = "/verificar", method = RequestMethod.POST)
    public ModelAndView verificar(String nome) {
        ModelAndView mv = new ModelAndView("index");

        boolean verdade = true;
        for (Reserva r : rr.findAll()) {
            if (r.getDenominacao().equalsIgnoreCase(nome)) {
                verdade = false;
                break;
            }
        }
        mv.addObject("verdade", verdade);
        mv.addObject("nome", nome);
        mv.addObject("ver", true);
        mv.addObject("tipo", "Ver");
        return mv;
    }
}
