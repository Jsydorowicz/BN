import java.util.Scanner;
import java.io.*;
public class Group_04_PE_06
//test number 2
{
	public static void main(String[]args) throws IOException
	{
		Scanner kb = new Scanner(System.in);
		String filename;
		int number = 0;
		int total = 0;
		String letter;
		char letterGuard;
		String currentLine;
		
		System.out.print("Enter the file name including extension: ");
		filename = kb.nextLine();
		
		System.out.print("Enter the letter you want to search for (If you enter more than one letter, it will just search for the first letter): ");
		letterGuard = kb.next().charAt(0);
		letter = Character.toString(letterGuard);
		letter = letter.toLowerCase();
		
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext())
		{
			currentLine = inputFile.nextLine();
			number = currentLine.length() - currentLine.replace(letter, "").length();
			
			if (number > 0)
			{
				total += number;
			}
			else
			{
			
			}
		}
		inputFile.close();
		System.out.println(total);
	}
}