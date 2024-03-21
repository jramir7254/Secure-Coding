import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;

/*
 * This class imitates a person who is creating a "database"
 * and adding different objects of type Person. The objects
 * will then be serialized into one file so the other class can
 * add the object to their "database."
 */

public class Serializer {
    public static void main(String[] args) {
        // Creating "database" and adding objects of type Person
        ArrayList<Person> database = new ArrayList<>();

        database.add(new Person("Bob Adams", 89));
        database.add(new Person("John Deer", 25));
        database.add(new Person("Le Bron", 16));

        printDatabase(database);

        serializeData(database, "people.ser");
    }

    
    public static void serializeData(ArrayList<Person> database, String fileName) {
        try {
            // Initialize a FileOutputStream to write the bytes into the file.
            FileOutputStream fow = new FileOutputStream(new File(fileName));
            // Initialize a ObjectOutputStream to serialize the objects in the "database".
            ObjectOutputStream oos = new ObjectOutputStream(fow);

            // Writes all the objects from the "database" into a single file
            for(Person p : database) {
                oos.writeObject(p);
            }

            oos.close();
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
