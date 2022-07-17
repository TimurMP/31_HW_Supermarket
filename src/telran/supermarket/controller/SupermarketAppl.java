package telran.supermarket.controller;

import telran.supermarket.dao.SuperMarket;
import telran.supermarket.dao.SupermarketImpl;
import telran.supermarket.model.Product;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SupermarketAppl {

    public static void main(String[] args) {
        SuperMarket market;
        market = new SupermarketImpl();
        LocalDate date = LocalDate.of(2025, 5, 15);

        Product product1 = new Product(1234567, "Product1", "CAT1", "BRAND1", 1,date.plus(1, ChronoUnit.DAYS) );

        market.addProduct(product1);




    }
}
