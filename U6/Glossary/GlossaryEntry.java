package U6.Glossary;
import java.util.ArrayList;

public class GlossaryEntry {

	private String word;
	private ArrayList<Integer> numsList;

	public GlossaryEntry(String w) {
		word = w.toUpperCase();
		numsList = new ArrayList<Integer>();
	}

	public String getWord()
	{
		return word;
	}

	public String toString()
	{
		String s = word;
		for (Integer i: numsList)
		{
			s += " " + i;
		}
		return s;
	}

	public void add(int num)
	{
		//Integer i = new Integer(num);
		//check if num is already in the list
		if(!numsList.contains(num))
		{
			numsList.add(num);
		}
	}

	public static void main(String[] args) {
		GlossaryEntry ie = new GlossaryEntry("Hello");
		ie.add(5);
		ie.add(7);
		ie.add(5);
		ie.add(12);
		System.out.println(ie);
	}
}

