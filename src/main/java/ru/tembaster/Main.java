package ru.tembaster;

import ru.tembaster.model.Dish;
import ru.tembaster.model.Restaurant;
import ru.tembaster.util.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Чайхона");
        Dish dish01 = new Dish("Плов", 400);
        Dish dish02 = new Dish("Цезарь", 350);
        Dish dish03 = new Dish("Шашлык из свинины", 500);
        Dish dish04 = new Dish("Шашлык из баранины", 450);
        Dish dish05 = new Dish("Шашлык из курицы", 250);
        Dish dish06 = new Dish("Чай с бергамотом", 100);
        restaurant.setMenu(List.of(dish01, dish02, dish03, dish04, dish05, dish06));
        ConsoleHelper.write(restaurant);
    }

}
