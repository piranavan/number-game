package com.girish.jung.controllers;

import com.girish.jung.dao.GameDao;
import com.girish.jung.dao.impl.GameDaoImpl;
import com.girish.jung.model.Game;
import com.girish.jung.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@RestController
public class TestController {

    @Autowired
    GameService gameService;

    @Autowired
    Environment environment;

    @RequestMapping(value="/status", method = RequestMethod.GET)
    public ResponseEntity getStatus() {
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ResponseEntity testAdd() {
        Game game = new Game();
        gameService.saveGame(game);
        return ResponseEntity.ok("Added");


    }
}
