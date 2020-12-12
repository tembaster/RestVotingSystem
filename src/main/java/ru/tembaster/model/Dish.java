package ru.tembaster.model;


public class Dish extends AbstractBaseEntity {

    private String desc;
    private Integer price;
    private Restaurant restaurant;

    public Dish() {
    }

    public Dish(Integer id, String desc, Integer price) {
        super(id);
        this.desc = desc;
        this.price = price;
    }

    public Dish(String desc, Integer price) {
        this(null, desc, price);
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", restaurant=" + restaurant +
                '}';
    }
}
