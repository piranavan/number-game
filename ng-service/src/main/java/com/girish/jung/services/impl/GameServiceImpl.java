package com.girish.jung.services.impl;

import com.girish.jung.dao.GameDao;
import com.girish.jung.model.Game;
import com.girish.jung.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Service
@Transactional
public class GameServiceImpl implements GameService {

    @Autowired
    GameDao gameDao;

    @Override
    public void saveGame(Game game) {
        gameDao.persist(game);
    }
}
