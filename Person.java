import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String privateInfo;

    public Person() {
        name = null;
        age = 0;
        privateInfo = "";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        privateInfo = "";
    }

    public void addPrivateInfo(String info) { 
        this.privateInfo += info + "\n"; 
    }

    //Getter and Setter for name
    public void setName(String newName) { this.name = newName; }

    public String getName() { return this.name; }

    //Getter and Setter for age
    public void setAge(int newAge) { this.age = newAge; }

    public int getAge() { return this.age; }

    //Getter for privateInfo
    public String getPrivateInfo() { return this.privateInfo; }

    public String toString() {
        return "Name: " + this.name + 
               "\nAge: " + this.age +
               "\nPrivae Info: " + this.privateInfo;
    }
}