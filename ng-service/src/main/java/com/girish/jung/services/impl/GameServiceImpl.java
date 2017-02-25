package com.girish.jung.services.impl;

import com.girish.jung.dao.GameDao;
import com.girish.jung.model.Game;
import com.girish.jung.services.GameService;
import com.girish.jung.services.RandomNumberGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Service
@Transactional
public class GameServiceImpl implements GameService {

    @Autowired
    GameDao gameDao;

    @Autowired
    RandomNumberGeneratorService randomNumberGeneratorService;

    @Override
    public void saveGame(Game game) {
        gameDao.persist(game);
    }

    public Game createNewGame() {
        Game game = new Game();
        game.setStatus(Game.Status.ACTIVE);
        game.setAnswer(randomNumberGeneratorService.generateRandomNumber());

        gameDao.persist(game);

        return game;
    }

}
