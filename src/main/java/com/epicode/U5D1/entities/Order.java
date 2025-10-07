package com.epicode.U5D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@ToString

public class Order {

    private long id;
    private StatoOrdine state;
    private Pizza pizzarequest;
    private List<Item> contorno;
    private int nCoperti;
    private LocalTime orderTime;
    @Value(("${coperto}"))
    private double copertoprice;

    private  double conto;


    public Order(long id, StatoOrdine state, Pizza pizzarequest, List<Item> contorno, int nCoperti, LocalTime orderTime, double copertoprice, double conto) {
        this.id = id;
        this.state = state;
        this.pizzarequest = pizzarequest;
        this.contorno = contorno;
        this.nCoperti = nCoperti;
        this.orderTime = orderTime;
        this.copertoprice = copertoprice;
        this.conto = conto;
    }

    public double getConto() {

        double total = 0;
        for (Item i : contorno) {
            total = conto + i.getPrice();

            return total;
        }

      double sumconto =  (pizzarequest.getPrice() + total) + (copertoprice * nCoperti);


        return sumconto;


    }

}
