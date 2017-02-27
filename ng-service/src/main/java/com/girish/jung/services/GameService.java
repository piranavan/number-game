package com.girish.jung.services;

import com.girish.jung.model.Game;

/**
 * Created by girishjung on 25/02/2017.
 */
public interface GameService {
    public void saveGame(Game game);

    public Game createNewGame();
}
