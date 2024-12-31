package main;

import delivery.DeliveryService;
import invoicing.model.Invoice;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        /*Modules are Much more than just collection of packages
         * it offers some functionality that helps in keep our app a bit more decoupled and maintainable
         * Each module is a jar file at the deployment level
         * provides better encapsulation
         * Till java 8 there was only a single monolith jar
         * but after it has been split in modules and each module is a jar in itself
         * helps keep functionality decoupled
         * access modifier public's meaning changes with modules
         * */
        DeliveryService deliveryServiceImpl = new DeliveryService();
        List<Invoice> invoiceList = deliveryServiceImpl.deliver();
    }
}