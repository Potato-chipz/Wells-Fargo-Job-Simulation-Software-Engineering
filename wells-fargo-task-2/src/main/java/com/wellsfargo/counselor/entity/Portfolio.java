package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long protfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String CreationDate;

    protected Portfolio() {

    }

    public Portfolio(String CreationDate) {
        this.client = client;
        this.CreationDate = CreationDate;
    }

    public long getProtfolioId() {

        return protfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {

        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {

        this.CreationDate = CreationDate;
    }
}
