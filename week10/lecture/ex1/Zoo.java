import java.util.*;

public class Zoo {
  private ArrayList<Animal> animals;

  public Zoo() {
    animals = new ArrayList<Animal>();
  }

  public void addAnimal(Animal e) {
    animals.add(e);
  }

  public double calculateAverageDonation() {
    double totalDonation = 0.0;

    for (Animal a: animals) {
      totalDonation += a.getDonation();
    }
    return totalDonation / animals.size();
  }

  public int calculateNumAnimalsInZoo(char category) {
    int count = 0;

    for (Animal a: animals) {
      if (a.getCategory() == category) {
        count++;
      }      
    }
    return count;
  }
}