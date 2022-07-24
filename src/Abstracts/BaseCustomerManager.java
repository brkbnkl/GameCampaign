package Abstracts;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

    public void save(Customer customer) {
        System.out.println("Müşteri Eklendi: " + customer.getFirstName());
    }
}
