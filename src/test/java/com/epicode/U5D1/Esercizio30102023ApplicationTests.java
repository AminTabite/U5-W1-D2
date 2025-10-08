package com.epicode.U5D1;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Pizza;
import com.epicode.U5D1.entities.Table;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Esercizio30102023ApplicationTests {



    @Autowired
    @Qualifier("table1")
   Table table1;

    @Autowired
    @Qualifier("table2")
    Table table2;


    @Test
    @DisplayName("controlla se ci sono almeno 2 tavoli")
    void Tableper2peopleminimun (){
        System.out.println("test 1");


        assertNotNull(table1, "Tavolo 1 presente");
        assertNotNull(table2, "Tavolo 2 presente");
        System.out.println("tavoli presenti");


        System.out.println("//////");



    }





    @Autowired
    @Qualifier("menu")
    Menu menu1;


    @Test
    @DisplayName("Conta delle pizze disponibili")
    void countPizzas(){

        System.out.println("TEST 2 ");
        assertEquals(4, menu1.getPizzaList().size() );
        System.out.println("il numero delle pizze e' " + menu1.getPizzaList().size());

    }




    }




