package com.girish.jung.dao.impl;

import com.girish.jung.dao.PlayerDao;
import com.girish.jung.model.Player;

import javax.persistence.EntityManager;

/**
 * Created by girishjung on 2/25/17.
 */
public class PlayerDaoImpl extends AbstractDaoImpl<Player> implements PlayerDao {

    public Player findByName(String firstName, String lastName) {

        return null;
    }

    public boolean isPlayerExistsByName(String firstName, String lastName) {

        return false;
    }

}
