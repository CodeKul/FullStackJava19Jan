package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderDemo {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        try {
            fileWriter = new FileWriter("FHDemo1.txt");
            fileWriter.write("Lorem ipsum, or lipsum as it is sometimes known, " +
                    "is dummy text used in laying out print, graphic or web designs. " +
                    "The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.");
            System.out.println("Written Successfully");

            File file = new File("FHDemo1.txt");
            fileReader = new FileReader(file);
            int i = fileReader.read();
            System.out.println("i value==>" + i);
            while (i != -1) {
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
