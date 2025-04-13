package exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Client client = new Client();

        Ticket ticket1 = new Ticket();
        ticket1.setDestination("India");
        Ticket ticket2 = new Ticket();
        ticket2.setDestination("India");
        Ticket ticket3 = new Ticket();
        ticket3.setDestination("Paris");

        String dest = "India";

        List<Ticket> list = List.of(ticket1,ticket2,ticket3);
        var result = list.stream()
                .filter(t->t.getDestination().equals(dest))
                .count();
        System.out.println(result);


    }
}
