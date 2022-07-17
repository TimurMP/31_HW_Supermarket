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
        if (product == null || findByBarCode(product.getBarCode())!= null) {
            return false;
        }
        products.add(product);
        return true;
    }

    @Override
    public Product removeProduct(long barCode) {
        Product victim = findByBarCode(barCode);
        if (victim!=null){
            products.remove(victim);
        }
        return victim;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
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
