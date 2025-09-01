package exercise2;

import java.util.*;
import java.util.stream.Collectors;
import exercise1.Laptop;

public class LaptopSearcher {
    public ArrayList<Laptop> getNewWindowsBasedLongBatteryLifeTablet(ArrayList<Laptop> laptops) {
        return laptops.stream()
            .filter(l -> l.getManufacturedYear() > 2008 
                && l.getOperatingSystem().equals("Windows") 
                && l.getBatteryLife() > 5 
                && l.isTablet())
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
