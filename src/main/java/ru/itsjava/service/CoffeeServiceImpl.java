package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

import java.util.Scanner;

public class CoffeeServiceImpl implements CoffeeService{

    Coffee cappuccino = new Coffee("Cappuccino", "100ml", 100);
    Coffee latte = new Coffee("Latte", "150ml", 150);
    @Override
    public void getCoffeeByPrice(double price) {
        if (cappuccino.getPrice() == price) {
            System.out.println(cappuccino);
        } else if(latte.getPrice() == price){
            System.out.println(latte);
        } else System.out.println("У нас нет кофе за такую цену");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("за какую стоимость кофе хочешь?");
        double price = scanner.nextDouble();
        getCoffeeByPrice(price);

    }
}
