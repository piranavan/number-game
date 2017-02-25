package com.girish.jung.controllers;

import com.girish.jung.dto.PlayerDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by girishjung on 2/25/17.
 */
@Controller("/register")
public class RegisterationController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getRegisterPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        model.addObject("player", new PlayerDto());
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("player") PlayerDto player) {
        System.out.println(player.getFirstName());
        return null;
    }
}
