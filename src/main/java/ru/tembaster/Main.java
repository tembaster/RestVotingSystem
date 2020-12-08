package ru.tembaster;

import ru.tembaster.model.Dish;
import ru.tembaster.model.Restaurant;
import ru.tembaster.util.ConsoleHelper;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Чайхона №1");
        restaurant.setMenu(List.of(new Dish("Плов", 400), new Dish("Цезарь", 350)));
        ConsoleHelper.write(restaurant.toString() + ": " + restaurant.getMenu());
    }

}
