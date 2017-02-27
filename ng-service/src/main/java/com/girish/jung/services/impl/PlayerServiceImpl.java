package com.girish.jung.services.impl;

import com.girish.jung.converters.PlayerConverter;
import com.girish.jung.dao.PlayerDao;
import com.girish.jung.dto.PlayerDto;
import com.girish.jung.model.Player;
import com.girish.jung.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by girishjung on 2/25/17.
 */
@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    @Autowired
    private PlayerConverter playerConverter;

    @Transactional
    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        Player player = playerConverter.convertFrom(playerDto);
        int id = playerDao.save(player);
        System.out.println(id + "   " + player.getId());
        return playerDto;
    }

    @Override
    public PlayerDto findPlayerByName(String firstName, String lastName){
        Player player = playerDao.findByName(firstName, lastName);
        return playerConverter.convertTo(player);
    }

    @Override
    public boolean isPlayerExistsByName(String firstName, String lastName) {
        return playerDao.isPlayerExistsByName(firstName, lastName);
    }
}
