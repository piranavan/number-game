package com.girish.jung.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
@MappedSuperclass
public class BaseEntity {
    @Column(name="CREATED_AT")
    private Instant createdAt;

    @Column(name="UPDATED_AT")
    private Instant updatedAt;

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PrePersist
    void onCreate() {
        this.setCreatedAt(Instant.now());
        this.setUpdatedAt(Instant.now());
    }

    @PreUpdate
    void onPersist() {
        if(this.getCreatedAt() != null) {
            this.setCreatedAt(Instant.now());
        }
        this.setUpdatedAt(Instant.now());
    }
}
