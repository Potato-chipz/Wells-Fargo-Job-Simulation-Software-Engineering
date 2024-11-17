package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long protfolioId;

    @Column(nullable = false)
    private String CreationDate;

    protected Portfolio() {

    }

    public Portfolio(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public long getProtfolioId() {
        return protfolioId;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }
}
