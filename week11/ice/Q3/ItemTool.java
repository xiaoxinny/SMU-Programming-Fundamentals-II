
import java.util.*;
import java.util.stream.Collectors;

public class ItemTool {

    public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> items, double weight) {
        List<InventoryItem> result = items.stream().filter(i -> i.getWeight() < weight).collect(Collectors.toList());
        return result;
    }

    public static List<Magazine> getAllMagazines(InventoryItem[] items) {
        List<Magazine> magazines = Arrays.stream(items).filter(i -> i instanceof Magazine).map(i -> (Magazine) i).collect(Collectors.toList());
        return magazines;
    }

    public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category) {
        List<InventoryItem> result = Arrays.stream(items).filter(i -> !(i instanceof Book) && i.getCategory() == category).collect(Collectors.toList());
        return result;
    }

    public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(Map<String, InventoryItem> map, int numCpu) {
        Laptop[] laptops = map.values().stream().filter(i -> i instanceof Laptop && ((Laptop) i).getNumCpu() > numCpu)
                        .toArray(Laptop[]::new);

        return laptops;
    }
}
