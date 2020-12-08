package ru.tembaster.model;


import java.util.Set;

public class Restaurant {

    private Integer id;
    private String name;
    private Set<Dish> menu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Dish> getMenu() {
        return menu;
    }

    public void setMenu(Set<Dish> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
