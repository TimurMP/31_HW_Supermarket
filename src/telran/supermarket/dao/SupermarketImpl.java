package telran.supermarket.dao;

import telran.supermarket.model.Product;

import java.util.ArrayList;
import java.util.Collection;

public class SupermarketImpl implements SuperMarket {
    Collection<Product> products;

    public SupermarketImpl() {
//        this.products = products;
        products = new ArrayList<Product>();

    }

    @Override
    public boolean addProduct(Product product) {
        //TODO: add additional checks
        if (product==null ){
            return false;
        }
        products.add(product);
        return true;
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

    @Override
    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }


    }
}
