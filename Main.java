import java.io.*;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) throws Exception {
        Person p = new Person("john doe", 30);
        Person p2;

        FileOutputStream f = new FileOutputStream("test.txt");
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ObjectOutputStream o = new ObjectOutputStream(b);

        o.writeObject(p);

        byte[] b2 = b.toByteArray();
        
        for(int i = 35; i < b2.length; i++) {
            b2[i] += 2;
        }

        f.write(b2);
        f.close();
        // o.writeObject(p);

        FileInputStream f2 = new FileInputStream("test.txt");
        
        
        byte[] b5 = f2.readAllBytes();

        System.out.println(Arrays.toString(b5));

        for(int i = 35; i < b5.length; i++) {
            b5[i] -= 3;
        }

        System.out.println(Arrays.toString(b5));

        ByteArrayInputStream b3 = new ByteArrayInputStream(b5);

        ObjectInputStream o2 = new ObjectInputStream(b3);
        p2 = (Person)o2.readObject();

        System.out.println(p2);
    }
}
