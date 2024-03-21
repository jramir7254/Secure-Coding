import java.io.*;
import java.util.Arrays;


// idek what i was doin here
/* 
public class Main {
    public static void main(String[] args) {
        byte[] serializedData = readSerializedDataFromFile("people.ser");
        System.out.println(Arrays.toString(serializedData));

        
        for(int j = 0; j < serializedData.length; j++) {
            byte b = serializedData[j];
            for (int i = 7; i >= 0; i--) {
                int bit = (b >> i) & 1;
                System.out.print(bit);
            }
        
            System.out.print(" ");
            //if(j % 10 == 0) System.out.println();
        }
    }

    private static byte[] readSerializedDataFromFile(String fileName) {
        // Read serialized data from the file into a byte array
        try (InputStream inputStream = new FileInputStream(fileName)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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
*/