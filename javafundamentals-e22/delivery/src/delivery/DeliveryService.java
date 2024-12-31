package delivery;

import invoicing.model.Invoice;
import invoicing.services.InvoiceService;

import java.util.List;

public class DeliveryService {
    private InvoiceService invoiceServiceImpl = InvoiceService.build();
    /*
    * using the contract ensures that the implementation details are not exposed and achieves decoupling
    * the module info exposes only the interface and not the service impl package
    * */
    public List<Invoice> deliver(){
        List<Invoice> invoices = invoiceServiceImpl.generateInvoices();
        invoices.forEach(System.out::println);
        return invoices;
    }
}
