package com.girish.jung.model.listener;

import com.girish.jung.model.BaseEntity;
import org.springframework.stereotype.Component;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

/**
 * Created by girishjung on 25/02/2017.
 */
public class TimestampEntityListener {
    @PrePersist
    void onCreate(Object entity) {
        if(entity instanceof BaseEntity) {
            BaseEntity eact = (BaseEntity)entity;
            if(eact.getCreatedAt() == null) {
                eact.setCreatedAt(Instant.now());
            }
            if(eact.getUpdatedAt() == null) {
                eact.setUpdatedAt(Instant.now());
            }

        }
    }

    @PreUpdate
    void onPersist(Object entity) {
        if(entity instanceof BaseEntity) {
            BaseEntity eact = (BaseEntity)entity;
            if(eact.getCreatedAt() == null) {
                eact.setCreatedAt(Instant.now());
            }
            if(eact.getUpdatedAt() == null) {
                eact.setUpdatedAt(Instant.now());
            }
        }
    }
}

