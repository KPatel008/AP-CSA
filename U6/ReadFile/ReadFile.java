package U6.ReadFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
public static void main(String[] args) throws IOException
{
    File inputfile = new File("U6/ReadFile/wordpairs.txt");
    Scanner input = new Scanner(inputfile);
    
    String line;

    while (input.hasNext()){
        line = input.nextLine();
        String [] words = line.split(" ");
        int x = words[0].compareToIgnoreCase(words[1]);
        if (x <= 0){
            System.out.println(words[0] + " " + words[1]);
        }
        else{
            System.out.println(words[1] + " " + words[0]);
        }
    }
    input.close();
}
}