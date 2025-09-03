package ticketing.entity;

import java.util.*;
import ticketing.entity.*;;

public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    public double calculatePrice() {
        double originalPrice = super.calculatePrice();
        double currentPrice = super.calculatePrice();
        for(int i=numDaysInAdvance; i>0; i--) {
            if(currentPrice > originalPrice/2) {
                currentPrice -= 0.50;
            } else {
                return originalPrice/2;
            }
        }
        return currentPrice;
    }
}
