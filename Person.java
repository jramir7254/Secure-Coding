import java.io.Serializable;

/*
 * Class that constructs a person objects with some info. BOTH the person that is 
 * serializing the data and the person deserializing the data have to have the same 
 * class name that implements the Serializable interface. BOTH people must also have 
 * the same class attributes with the same name, i.e., private String name, private 
 * int age. BOTH classes must also have the same constructors and methods with the 
 * same signature, i.e., same method names, same return type, same parameters. The 
 * inside of the methods CAN be different for both classes for example, one class can 
 * have the getName method return this.name and the other can return or do something else.
 */

// Class HAS to implement Serializable interface to allow it to be serialized.
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
               "\nPrivate Info: " + this.privateInfo;
    }
}