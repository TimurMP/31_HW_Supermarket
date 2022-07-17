package telran.supermarket.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {


    long barCode;
    String name;
    String category;
    String brand;
    double price;
    LocalDate expDate;

    public Product(long barCode, String name, String category, String brand, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.expDate = expDate;
    }


    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
