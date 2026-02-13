package U6.Glossary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Glossary {
    private static ArrayList<GlossaryEntry> entry = new ArrayList<>();

    public int foundOrInserted(String s) {
        GlossaryEntry add = new GlossaryEntry(s.toUpperCase());
        if (entry.size() == 0) {
            entry.add(new GlossaryEntry(s.toUpperCase()));
            return 0;
        }
        for (int i = entry.size() - 1; i >= 0; i--) {
            int compare = add.getWord().compareTo(entry.get(i).getWord());
            if (compare == 0) {
                return i;
            } 
            if (compare > 0) {
                entry.add(i + 1, add);
                return i + 1;
            }
        }
        entry.add(0, add);
        return 0;
    }

    public void addWord(String word, int line) {
        int a = foundOrInserted(word);
        GlossaryEntry b = entry.get(a);
        b.add(line);
    }

    public void addAllWords(String words, int line) {
        String [] sep = words.split(" ");
        for (int i = 0; i < sep.length; i++) {
            if (sep[i].equals("")) continue;
            addWord(sep[i], line);
        }
    }

    public void printEntries() {
        for (GlossaryEntry i: entry) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("U6/Glossary/fish.txt");
        Scanner sc = new Scanner(file);
        Glossary gloss = new Glossary();
        int num = 1;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            gloss.addAllWords(line, num);
            num++;
        }
        sc.close();
        gloss.printEntries();
    }
} 

// A 12 14 15
// ARE 16
// BLACK 6
// BLUE 4 7
// CAR 14
// FISH 1 2 3 4 6 7 8 9 16
// HAS 11 14
// LITTLE 12 14
// LOT 15
// NEW 9
// OF 16
// OLD 8
// ONE 1 11 14
// RED 3
// SAY 15
// STAR 12
// THERE 16
// THIS 11 14
// TWO 2
// WHAT 15
