package exercise;

import java.time.LocalDate;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        Client client = new Client();

        Ticket ticket1 = new Ticket();
        ticket1.setDate(LocalDate.of(2025,03,04));
        Ticket ticket2 = new Ticket();
        ticket2.setDate(LocalDate.of(2025,03,04));
        Ticket ticket3 = new Ticket();
        ticket3.setDate(LocalDate.of(2025,03,05));

        LocalDate date = LocalDate.of(2025,03,04);

        List<Ticket> list = List.of(ticket1,ticket2,ticket3);
        list.stream()
                .filter(t->t.getDate().isEqual(date))
                .forEach(System.out::println);


    }
}
