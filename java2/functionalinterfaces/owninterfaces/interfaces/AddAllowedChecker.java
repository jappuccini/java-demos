package java2.functionalinterfaces.owninterfaces.interfaces;

import java2.functionalinterfaces.owninterfaces.Customer;
import java2.functionalinterfaces.owninterfaces.Product;

@FunctionalInterface
public interface AddAllowedChecker {
    public boolean allowed(Product product, Customer customer);
}
