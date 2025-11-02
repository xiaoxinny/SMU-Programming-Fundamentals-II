
import java.util.*;

public class DVDUtility {

    public static DVD getMostExpensiveDVD(DVD[] array) {
        try {
            double max = Integer.MIN_VALUE;
            DVD dvd = null;
            for (DVD d : array) {
                if (d.getPrice() > max) {
                    dvd = d;
                    max = d.getPrice();
                }
            }

            return dvd;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public static List<DVD> getDVDWithGenre(DVD[] array, String genre) {
        List<DVD> result = new ArrayList<>();
        try {
            for (DVD d : array) {
                if (d.getGenre().equals(genre)) {
                    result.add(d);
                }
            }

            return result;
        } catch (NullPointerException e) {
            return result;
        }
    }

    public static List<DVD> getDVDWithPriceBetween(DVD[] array, int minPrice, int maxPrice) {
        List<DVD> result = new ArrayList<>();
        try {
            for (DVD d : array) {
                double price = d.getPrice();
                if (price > minPrice && price < maxPrice) {
                    result.add(d);
                }
            }

            return result;
        } catch (NullPointerException e) {
            return result;
        }
    }

    public static List<DVD> getUniqueDVDs(DVD[] array, DVD[] anotherArray) {
        if (array == null && anotherArray == null) {
            return new ArrayList<>();
        }
        if (array == null) {
            return new ArrayList<>(Arrays.asList(anotherArray));
        }
        if (anotherArray == null) {
            return new ArrayList<>(Arrays.asList(array));
        }

        List<DVD> unique = new ArrayList<>();

        for (DVD d1 : array) {
            boolean found = false;
            for (DVD d2 : anotherArray) {
                if (d1.getTitle().equals(d2.getTitle())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique.add(d1);
            }
        }

        for (DVD d2 : anotherArray) {
            boolean found = false;
            for (DVD d1 : array) {
                if (d1.getTitle().equals(d2.getTitle())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique.add(d2);
            }
        }

        return unique;
        // try {
        //     Set<DVD> set1 = new HashSet<>(Arrays.asList(array));
        //     Set<DVD> set2 = new HashSet<>(Arrays.asList(anotherArray));

        //     Set<DVD> result = new HashSet<>(set1);
        //     result.addAll(set2);
        //     Set<DVD> intersection = new HashSet<>(set1);
        //     intersection.retainAll(set2);
        //     result.removeAll(intersection);
        //     return new ArrayList<>(result);
        // } catch (NullPointerException e) {
        //     return null;
        // }
    }

    public static String[] getDVDTitlesInYear(DVD[] array, int year) {
        List<String> titles = new ArrayList<>();
        try {
            for (DVD d : array) {
                if (d.getYear() == year) {
                    titles.add(d.getTitle());
                }
            }

            String[] result = new String[titles.size()];

            return titles.toArray(result);
        } catch (NullPointerException e) {
            return new String[0];
        }
    }
}
