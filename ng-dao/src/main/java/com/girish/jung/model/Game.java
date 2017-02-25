package com.girish.jung.model;

import javax.persistence.*;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Entity
@Table(name="GAME")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
