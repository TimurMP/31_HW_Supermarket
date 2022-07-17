package telran.supermarket.controller;

import telran.supermarket.dao.SuperMarket;
import telran.supermarket.dao.SupermarketImpl;
import telran.supermarket.model.Product;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SupermarketAppl {

    public static void main(String[] args) {
        SuperMarket tivTaam;
        tivTaam = new SupermarketImpl();
        LocalDate date = LocalDate.of(2025, 5, 15);

        Product[] products;
        products = new Product[5];

        products[0] = new Product(1234567, "Product1", "CAT1", "BRAND1", 1,date.plus(1, ChronoUnit.DAYS) );
        products[1] = new Product(12345678, "Product2", "CAT3", "BRAND2", 1,date.plus(2, ChronoUnit.DAYS) );
        products[2] = new Product(12345679, "Product3", "CAT3", "BRAND3", 1,date.plus(3, ChronoUnit.DAYS) );
        products[3] = new Product(123456710, "Product4", "CAT4", "BRAND3", 1,date.plus(4, ChronoUnit.DAYS) );
        products[4] = new Product(123456711, "Product5", "CAT5", "BRAND3", 1,date.plus(5, ChronoUnit.DAYS) );


        for (int i = 0; i < products.length; i++) {
            tivTaam.addProduct(products[i]);
        }


        tivTaam.printProducts();
        System.out.print("\nAdding Null: ");
        System.out.println(tivTaam.addProduct(null));

        System.out.println("\nFind by Bar Code: " + tivTaam.findByBarCode(123456710));


        tivTaam.removeProduct(123456710);
        System.out.println("\nAfter removal: ");
        tivTaam.printProducts();

        System.out.println("\nAdding existing product: " + tivTaam.addProduct(products[2]));

//        System.out.println("\nfindByCategory: " + tivTaam.findByCategory("CAT3"));

        System.out.println("\nfindByCategory: ");
        tivTaam.printProducts(tivTaam.findByCategory("CAT3"));

        System.out.println("\nfindByBrand: ");
        tivTaam.printProducts(tivTaam.findByBrand("BRAND3"));









    }


}
