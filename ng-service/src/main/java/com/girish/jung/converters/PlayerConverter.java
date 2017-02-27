package com.girish.jung.converters;

import com.girish.jung.dto.PlayerDto;
import com.girish.jung.model.Player;
import org.springframework.stereotype.Service;

/**
 * This class converts Player to PlayerDto and vice-versa
 * Created by girishjung on 2/26/17.
 */
@Service
public class PlayerConverter {

    public PlayerDto convertTo(Player player) {
        PlayerDto playerDto = new PlayerDto();
        playerDto.setId(player.getId());
        playerDto.setFirstName(player.getFirstName());
        playerDto.setLastName(player.getLastName());
        playerDto.setPassword(player.getPassword());
        playerDto.setPlayerType(PlayerDto.PlayerType.valueOf(player.getPlayerType().toString()));

        return playerDto;
    }

    public Player convertFrom(PlayerDto playerDto) {
        Player player = new Player();
        player.setId(playerDto.getId());
        player.setFirstName(playerDto.getFirstName());
        player.setLastName(playerDto.getLastName());
        player.setPassword(playerDto.getPassword());
        player.setPlayerType(Player.PlayerType.valueOf(playerDto.getPlayerType().toString()));

        return player;
    }
}
