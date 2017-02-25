package com.girish.jung.model;

import com.girish.jung.model.listener.TimestampEntityListener;
import com.sun.xml.internal.rngom.parse.host.Base;

import javax.persistence.*;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@Entity
@EntityListeners({TimestampEntityListener.class})
@Table(name="GAME")
public class Game extends BaseEntity {
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
