package ru.itsjava.service;

import java.util.Scanner;

public class CoffeeHouseImpl implements CoffeeHouse {
    private final CoffeeService coffeeService; // почему по ссылке интерфейса обращаемся

    public CoffeeHouseImpl(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @Override
    public void printCoffeeByPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("за какую стоимость кофе хочешь?");
        double price = scanner.nextDouble();
        System.out.println("Вот твой кофе " + coffeeService.getCoffeeByPrice(price));

    }
}
