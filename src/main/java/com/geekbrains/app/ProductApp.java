package com.geekbrains.app;

public class ProductApp {
    private long id;
    private String tittle;
    private int cost;

    public ProductApp(long id, String tittle, int cost) {
        this.id = id;
        this.tittle = tittle;
        this.cost = cost;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", cost=" + cost +
                '}';
    }

}


