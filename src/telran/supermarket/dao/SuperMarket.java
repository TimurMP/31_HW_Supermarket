package telran.supermarket.dao;

import telran.supermarket.model.Product;

public interface SuperMarket {

    boolean addProduct(Product product);

    Product removeProduct(long barCode);

    Product findByBarCode(long barCode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductWithExpDate();



    int skuQuantity();

    void printProducts();
    void printProducts(Iterable<Product> products);
}
