package Concretes;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService {

    private ICustomerCheckService customerCheckService;

    public CustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Kayıt yapıldı: " + customer.getFirstName()+" "+customer.getLastName());
        }
        else {
            System.out.println("Kişi bilgileri uyuşmuyor");
        }
    }
}
