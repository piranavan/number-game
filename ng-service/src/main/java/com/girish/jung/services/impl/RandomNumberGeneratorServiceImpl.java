package com.girish.jung.services.impl;

import com.girish.jung.services.RandomNumberGeneratorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Service
public class RandomNumberGeneratorServiceImpl implements RandomNumberGeneratorService {
    @Value("${max.game.answer}")
    private int maxGameAnswer;

    @Override
    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(maxGameAnswer+1);
    }
}
