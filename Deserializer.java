import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;

/*
 * This class imitates a person who is receiving serialized
 * data, and deserializes it to store it into their "database."
 */

public class Deserializer {
    public static void main(String[] args) {
        // Create an empty "database" then call the deserialize method to deserialize the
        // objects in the file and adds them to this "database".
        ArrayList<Person> database = new ArrayList<>();
 
        deserializeData(database, "people.ser");

        printDatabase(database);
    }


    public static void deserializeData(ArrayList<Person> database, String fileName) {
        try {
            // Initialize a FileInputStream to read the raw bytes from the file
            FileInputStream fis = new FileInputStream(new File(fileName));
            // Initialize a FileOuputStream to deserialize the objects in the file
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                // Deserializes the objects one by one and adds them into to "database"
                // until it reaches the end of the file and throws the exception.
                while(true) {
                    Person p = (Person) ois.readObject();
                    database.add(p);
                }
            }
            catch(EOFException e) {
                System.out.println("End of file reached.");
            }

            ois.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }


    public static void printDatabase(ArrayList<Person> database) {
        for(Person p : database) {
            System.out.println(p + "\n");
        }
    }
}
