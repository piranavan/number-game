package com.girish.jung.services;

import com.girish.jung.dto.PlayerDto;

/**
 * Created by girishjung on 2/25/17.
 */
public interface PlayerService {

    public PlayerDto createPlayer(PlayerDto playerDto);

    public PlayerDto findPlayerByName(String firstName, String lastName);

    public boolean isPlayerExistsByName(String firstName, String lastName);
}
