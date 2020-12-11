package ru.tembaster.model;

public class Dish extends AbstractNamedEntity {

    private String desc;
    private Integer price;

    public Dish() {
    }

    public Dish(String desc, Integer price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
