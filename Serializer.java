import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;

public class Serializer {
    public static void main(String[] args) {
        ArrayList<Person> database = new ArrayList<>();

        database.add(new Person("Bob Adams", 89));
        database.add(new Person("John Deer", 25));
        database.add(new Person("Le Bron", 16));

        printDatebase(database);

        serializeData(database, "people.ser");

    }

    public static void serializeData(ArrayList<Person> database, String fileName) {
        try {
            FileOutputStream fow = new FileOutputStream(new File(fileName));
            ObjectOutputStream oos = new ObjectOutputStream(fow);

            for(Person p : database) {
                oos.writeObject(p);
            }

            oos.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void printDatebase(ArrayList<Person> database) {
        for(Person p : database) {
            System.out.println(p + "\n");
        }
    }
}
