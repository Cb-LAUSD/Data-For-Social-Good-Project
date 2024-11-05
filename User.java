public class User {
    // Fields to store user data
    private int age;
    private int physicalFunctioning;
    private int mentalFunctioning;
    private String name;
    // No-argument constructor
    public User() {
        this.name = "";
        this.age = 0;
        this.physicalFunctioning = 0;
        this.mentalFunctioning = 0;
    }

    // Parameterized constructor
    public User(String name, int age, int physicalFunctioning, int mentalFunctioning) {
        this.name = name;
        this.age = age;
        this.physicalFunctioning = physicalFunctioning;
        this.mentalFunctioning = mentalFunctioning;
    }

    // Getter methods
    public String name(){
      return name;
    }
    public int getAge() {
        return age;
    }

    public int getPhysicalFunctioning() {

      return physicalFunctioning;
    }

    public int getMentalFunctioning() {
        return mentalFunctioning;
    }


    // toString method to provide information about the user
    public String toString() {
        return "User: " + name + "[Age = " + age + ", Physical Functioning = " + physicalFunctioning +
               ", Mental Functioning = " + mentalFunctioning + "]";
    }
}
