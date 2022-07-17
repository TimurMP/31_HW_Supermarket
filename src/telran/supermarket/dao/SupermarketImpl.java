package telran.supermarket.dao;

import telran.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class SupermarketImpl implements SuperMarket {
    Collection<Product> products;

    public SupermarketImpl() {
//        this.products = products;
        products = new ArrayList<Product>();

    }

    @Override
    public boolean addProduct(Product product) {
        //TODO: add additional checks
        if (product == null || findByBarCode(product.getBarCode()) != null) {
            return false;
        }
        products.add(product);
        return true;
    }

    @Override
    public Product removeProduct(long barCode) {
        Product victim = findByBarCode(barCode);
        if (victim != null) {
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
//        LinkedList<Product> res = new LinkedList<>();
//        for (Product product : products) {
//            if (product.getCategory().equals(category)) {
//                res.add(product);
//            }
//
//        }
        return findProductByPredicate(product -> product.getCategory().equals(category));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {

        return findProductByPredicate(product -> product.getBrand().equals(brand));
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        LocalDate now = LocalDate.now();
        return findProductByPredicate(product -> product.getExpDate().isBefore(now));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void printProducts(Iterable<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }


    }

    private Iterable<Product> findProductByPredicate(Predicate<Product> predicate) {
        ArrayList<Product> res = new ArrayList<>();
        for (Product product : products) {
            if(predicate.test(product)) {
                res.add(product);
            }
        }
        return res;
    }

}
