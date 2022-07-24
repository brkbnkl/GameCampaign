package Adapters;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import WS.SSCKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {

        SSCKPSPublicSoap client = new SSCKPSPublicSoap();

        boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getDateOfBirth());

        if (result == true) {
            return true;
        }
        else {
            return false;
        }

    }
}
