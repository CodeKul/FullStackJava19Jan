package file_handling;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args){


        try(FileWriter fileWriter = new FileWriter("FHDemo2.txt")){
            fileWriter.write("Lorem ipsum, or lipsum as it is sometimes known, " +
                    "is dummy text used in laying out print, graphic or web designs. " +
                    "The passage is attributed to an unknown typesetter in the 15th century" +
                    " who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.");
            System.out.println("Written Successfully");

        }catch (IOException e){
            System.out.println(e);
        }

        try(FileReader fileReader = new FileReader("FHDemo2.txt")){
            int i =fileReader.read();
            System.out.println("i value==>"+i);
            while (i != -1){
                System.out.print((char)i);
                i= fileReader.read();
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
