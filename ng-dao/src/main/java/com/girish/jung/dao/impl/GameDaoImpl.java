package com.girish.jung.dao.impl;

import com.girish.jung.dao.AbstractDao;
import com.girish.jung.dao.GameDao;
import com.girish.jung.model.Game;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by girishjung on 25/02/2017.
 */
@Repository
public class GameDaoImpl extends AbstractDaoImpl<Game> implements GameDao {

}
