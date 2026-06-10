import java.io.*;

public class RandomAccessFileExample {

    public static void main(String[] args) {

        try {

            // Create a RandomAccessFile object in read-write mode
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");

            // Clear old content
            file.setLength(0);

            // Write initial data
            String data1 = "Hello";
            String data2 = "World";

            file.writeUTF(data1);
            file.writeUTF(data2);

            // Move file pointer to beginning
            file.seek(0);

            // Read data
            String readData1 = file.readUTF();
            String readData2 = file.readUTF();

            System.out.println("Data read from file:");
            System.out.println(readData1);
            System.out.println(readData2);

            // Move file pointer to end
            file.seek(file.length());

            // Append new data
            String newData = "Java!";
            file.writeUTF(newData);

            // Move pointer back to beginning
            file.seek(0);

            // Read all data again
            readData1 = file.readUTF();
            readData2 = file.readUTF();
            String readData3 = file.readUTF();

            System.out.println("\nData read from file after appending:");
            System.out.println(readData1);
            System.out.println(readData2);
            System.out.println(readData3);

            file.close();

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
