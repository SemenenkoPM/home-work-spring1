package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

import java.util.Scanner;

public class CoffeeServiceImpl implements CoffeeService{

    Coffee cappuccino = new Coffee("Cappuccino", "100ml", 100);
    Coffee latte = new Coffee("Latte", "150ml", 150); // обьекты здесь должны быть?
    @Override
    public Coffee getCoffeeByPrice(double price) {
        if (cappuccino.getPrice() == price) { // как обратиться по другому к Coffee?
            return cappuccino;
        } else if(latte.getPrice() == price){
            return latte;
        } else return null;
    }

//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("за какую стоимость кофе хочешь?");
//        double price = scanner.nextDouble();
//        getCoffeeByPrice(price);
//
//    }
}
