package ru.tembaster.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Dish> menu;

    @Column(name = "votes")
    private Integer votes;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name, Integer votes) {
        super(id, name);
        this.votes = votes;
    }

    public List<Dish> getMenu() {
        return menu;
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
