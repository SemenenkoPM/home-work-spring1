package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

import java.util.List;
import java.util.NoSuchElementException;

public class CoffeeServiceImpl implements CoffeeService {

    private final List<Coffee> coffeeList = List.of(new Coffee("Cappuccino", "100ml", 100),
            new Coffee("Latte", "150ml", 150)); // по нормальному должно быть обращение к базе

    @Override
    public Coffee getCoffeeByPrice(double price) {

//        for (int i = 0; i < coffeeList.size(); i++) {
//            if (coffeeList.get(i).getPrice() == price) {
//                return coffeeList.get(i);
//            }
//        }

//        for (Coffee coffee: coffeeList) {
//            if(coffee.getPrice() == price)
//                return coffee;
//        }

       return coffeeList.stream()
               .filter(coffee -> coffee.getPrice() == price)
               .findFirst()
               .orElseThrow(NoSuchElementException::new);

       // Тест написать
//        throw new NoSuchElementException();
    }
}
//        if (cappuccino.getPrice() == price) { // как обратиться по другому к Coffee?, чтобы не обращаться к конкретному кофе?
//            return cappuccino;
//        } else if (latte.getPrice() == price) {
//            return latte;
//        } else return null;
//    }

//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("за какую стоимость кофе хочешь?");
//        double price = scanner.nextDouble();
//        getCoffeeByPrice(price);
//
//    }
//}
