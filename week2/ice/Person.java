// this is for Q7
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + this.firstName + " " + this.lastName + ", age=" + this.age + "]";
    }

}