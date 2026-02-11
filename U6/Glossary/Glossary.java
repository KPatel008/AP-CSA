package U6.Glossary;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        Glossary gloss = new Glossary();
        gloss.foundOrInserted("hi");
        gloss.foundOrInserted("up");
        gloss.foundOrInserted("Down");
        for (int i = 0; i < entry.size(); i++) {
            System.out.println(i + ": " + entry.get(i).getWord());
        }
    }
} 
