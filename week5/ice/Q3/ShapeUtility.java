import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        if (shapeList != null) {
            List<Octagon> octagons = shapeList.stream()
                .filter(s -> s instanceof Octagon)
                .map(s -> (Octagon) s)
                .collect(Collectors.toList());
            if (octagons.isEmpty()) return null;
            return Collections.max(octagons, Comparator.comparingDouble(Octagon::getArea));
        }
        return null;
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        if (shapeList != null) {
            return shapeList.stream()
                .filter(s -> !(s instanceof Rectangle))
                .collect(Collectors.toCollection(ArrayList::new));
        }
        return new ArrayList<Shape>();
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {
        if (shapeList != null) {
            return shapeList.stream()
                .filter(s -> s instanceof Square && s.getArea() >= minArea)
                .map(s -> (Square) s)
                .collect(Collectors.toCollection(ArrayList::new));
        }
        return new ArrayList<Square>();
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {
        if (shapeList != null) {
            return shapeList.stream()
                .filter(s -> s instanceof Rectangle && ((Rectangle) s).getLength() >= length)
                .collect(Collectors.toCollection(ArrayList::new));
        }
        return new ArrayList<Shape>();
    }
}
