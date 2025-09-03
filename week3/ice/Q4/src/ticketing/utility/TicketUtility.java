package ticketing.utility;

import java.util.*;
import ticketing.entity.*;;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        if (ticketList != null && ticketList.size() > 0) {
            double totalPrice = ticketList.stream().mapToDouble(Ticket::calculatePrice).sum();
            return totalPrice/ticketList.size();
        } else {
            return 0.0;
        }
    }
}
