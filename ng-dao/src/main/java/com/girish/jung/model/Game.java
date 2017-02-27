package com.girish.jung.model;

import com.girish.jung.model.listener.TimestampEntityListener;
import com.sun.xml.internal.rngom.parse.host.Base;

import javax.persistence.*;

/**
 * Created by girishjung on 25/02/2017.
 */
@Entity
@EntityListeners({TimestampEntityListener.class})
@Table(name="GAME")
public class Game extends BaseEntity {

    @Column
    private Status status;

    @Column
    private int answer;

    @Column
    private String winner;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public static enum Status {
        ACTIVE,
        COMPLETED
    }

}
