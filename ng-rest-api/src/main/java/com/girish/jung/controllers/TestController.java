package com.girish.jung.controllers;

import com.girish.jung.dao.GameDao;
import com.girish.jung.dao.impl.GameDaoImpl;
import com.girish.jung.model.Game;
import com.girish.jung.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@RestController
public class TestController {

    @Autowired
    GameService gameService;


    @RequestMapping(value="/status", method = RequestMethod.GET)
    public ResponseEntity getStatus() {
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ResponseEntity testAdd() {
        Game game = gameService.createNewGame();
        return ResponseEntity.ok("created");
    }

    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page - Admin Page!");
        model.setViewName("login");

        return model;
    }

    @RequestMapping(value = "/dba", method = RequestMethod.GET)
    public ModelAndView dbaPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page - Database Page!");
        model.setViewName("login");

        return model;
    }
}
