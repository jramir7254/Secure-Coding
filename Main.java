import java.io.*;

public class Main {
    public static void main(String[] args) {
  
    }


    public static void serialize(Object p, String fileName) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
            oos.writeObject(p);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static Object deserialize(String fileName) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Object) ois.readObject();
        }
        catch(Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
