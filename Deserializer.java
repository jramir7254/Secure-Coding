import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;

public class Deserializer {
    public static void main(String[] args) {
        ArrayList<Person> database = new ArrayList<>();
        printDatabase(database);
        deserializeData(database, "people.ser");
        printDatabase(database);

    }

    public static void deserializeData(ArrayList<Person> database, String fileName) {
        try {
            FileInputStream fis = new FileInputStream(new File(fileName));
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {
                while(true) {
                    Person p = (Person) ois.readObject();
                    database.add(p);
                }
            }
            catch(EOFException e) {
                System.out.println("Reached End of File");
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
