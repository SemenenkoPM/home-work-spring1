package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.CoffeeHouse;
import ru.itsjava.service.CoffeeServiceImpl;

public class Main {

    public static void main(String[] args) {
//        new CoffeeServiceImpl().run();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.getBean(CoffeeHouse.class).printCoffeeByPrice();
    }
}
