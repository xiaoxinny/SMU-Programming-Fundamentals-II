import java.util.*;

public class PhoneBook {
    private HashMap<String, String> entries;
    
    public PhoneBook() {
        entries = new HashMap<>();
        entries.put("John Doe", "+65 8478 293");
        entries.put("Jack Brown", "+62-6923843");
        entries.put("Sue Black", "+64-6384732");
    }

    public String lookup(String name) {
        return entries.get(name);
    }
}
