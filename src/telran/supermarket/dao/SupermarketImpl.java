package telran.supermarket.dao;

import telran.supermarket.model.Product;

import java.util.Collection;

public class SupermarketImpl implements SuperMarket {
    Collection<Product> products;


    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return 0;
    }
}
