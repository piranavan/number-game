package com.girish.jung.dao.impl;

import com.girish.jung.dao.AbstractDao;
import com.girish.jung.dao.GameDao;
import com.girish.jung.model.Game;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Repository
@Transactional
public class GameDaoImpl extends AbstractDao<Game> implements GameDao{

    @Override
    public void saveGame(Game game) {
        persist(game);
    }
}
