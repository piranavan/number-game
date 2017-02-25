package com.girish.jung.dao;

import com.girish.jung.model.Player;

/**
 * Created by girishjung on 2/25/17.
 */
public interface PlayerDao extends AbstractDao<Player> {

    public Player findByName(String firstName, String lastName);

    public boolean isPlayerExistsByName(String firstName, String lastName);
}
