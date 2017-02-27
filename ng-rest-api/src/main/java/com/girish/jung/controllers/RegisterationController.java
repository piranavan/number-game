package com.girish.jung.controllers;

import com.girish.jung.dto.PlayerDto;
import com.girish.jung.services.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterationController.class);

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getRegisterPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        model.addObject("player", new PlayerDto());
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("player") PlayerDto player, ModelAndView modelAndView) {

        if (playerService.isPlayerExistsByName(player.getFirstName(), player.getLastName())) {
            LOGGER.error("Failed to register. User already exists with name {} {}", player.getFirstName(), player.getLastName() );
            modelAndView.addObject("error", "User already present with same name");
            return modelAndView;
        }
        playerService.createPlayer(player);

        modelAndView.addObject("id", player.getId());
        return modelAndView;
    }
}
