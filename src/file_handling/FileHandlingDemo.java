package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {


            FileOutputStream fileOutputStream = new FileOutputStream("FHDemo.txt");
            String str= "5) Write a program to display maximum among three numbers(use scanner class)";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);

            System.out.println("File is written successfully");
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("FHDemo.txt");
            int i=fileInputStream.read();
//            System.out.println((char)i);
            while (i > 0){
                System.out.print((char)i);
                i=fileInputStream.read();
            }




        }catch (IOException ioException){
            System.out.println(ioException);
        }


    }
}
