package exercise;

import java.lang.ref.Cleaner;
import java.time.LocalDate;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Client c1 = new Client();
        c1.setName("Bob");
        Client c2 = new Client();
        c2.setName("Alice");

        Ticket ticket1 = new Ticket();
        ticket1.setClient(c1);
        Ticket ticket2 = new Ticket();
        ticket2.setClient(c2);
        Ticket ticket3 = new Ticket();
        ticket3.setClient(c2);

        String name = "Bob";

        List<Ticket> list = List.of(ticket1,ticket2,ticket3);
        var res = list.stream()
                .anyMatch(t->t.getClient().getName().equals("Bob"));
        System.out.println(res);


    }
}
