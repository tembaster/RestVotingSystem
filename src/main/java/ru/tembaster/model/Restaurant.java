package ru.tembaster.model;


import java.util.List;

public class Restaurant extends AbstractBaseEntity {

    private String name;
    private List<Dish> menu;
    private Integer votes;

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Dish dish;
        for (int i = 0; i < menu.size(); i++) {
            dish = menu.get(i);
            sb.append(dish.toString());
            if (i != menu.size() - 1) {
                sb.append("; ");
            }
        }
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "}: " +
                sb;
    }
}
