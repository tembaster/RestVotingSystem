package ru.tembaster.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "dishes")
public class Dish extends AbstractBaseEntity {

    @Column(name = "desc", nullable = false)
    @NotBlank
    private String desc;

    @Column(name = "price")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
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
