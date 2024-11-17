package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Sercurity {

    @Id
    @GeneratedValue()
    private long sercurityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int PurchasePrice;

    @Column(nullable = false)
    private String PurchaseDate;

    @Column(nullable = false)
    private int Quantity;

    protected Sercurity() {

    }

    public Sercurity(String name, String category, int purchasePrice, String PurchaseDate, int Quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.PurchasePrice = PurchasePrice;
        this.PurchaseDate = PurchaseDate;
        this.Quantity = Quantity;
    }

    public long getSercurityId() {

        return sercurityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public int getPurchasePrice() {

        return PurchasePrice;
    }

    public void setPurchasePrice(int PurchasePrice) {

        this.PurchasePrice = PurchasePrice;
    }

    public String getPurchaseDate() {

        return PurchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {

        this.PurchaseDate = PurchaseDate;
    }

    public int getQuantity() {

        return Quantity;
    }

    public void setQuantity(int Quantity) {

        this.Quantity = Quantity;
    }
}
