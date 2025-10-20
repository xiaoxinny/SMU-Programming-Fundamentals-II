import java.util.*;

public class AcronymFinder {
    private HashMap<String, String> acronyms;

    public AcronymFinder() {
        acronyms = new HashMap<>();
        acronyms.put("XP", "Extreme Programming");
        acronyms.put("FDD", "Feature-Driven Development");
        acronyms.put("RUP", "Rational Unified Process");
    }

    public String lookup(String acronym) {
        return acronyms.get(acronym);
    }
}
