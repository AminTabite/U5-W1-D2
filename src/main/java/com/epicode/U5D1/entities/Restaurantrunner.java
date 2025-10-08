package com.epicode.U5D1.entities;

import com.epicode.U5D1.U5D1Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class Restaurantrunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
        Menu m = (Menu) ctx.getBean("menu");

        Pizza pz = (Pizza) ctx.getBean("pizza_margherita");

        Topping tp = (Topping) ctx.getBean("toppings_tomato") ;
        Item wine = (Drink) ctx.getBean("wine") ;

        Table tb = (Table) ctx.getBean("table1");

        List<Item> listord = List.of(tp, wine);

        Order ord = new Order(001, StatoOrdine.PRONTO,
                pz, listord, 4, LocalTime.now(), tb);


        System.out.println(ord.toString());
        System.out.println(ord.getConto());

        m.printMenu();

        ctx.close();


    }
}
