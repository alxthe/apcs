import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

 public class WordSearchRunner {
	public static void wsMain(String file) throws FileNotFoundException
   //file = fileName
	{
		// instantiate Scanner object to read in from file
    System.out.println("Starting main");
		Scanner scan = new Scanner(new File(file));
    int rowLength = scan.nextInt();
    int columnLength = scan.nextInt();
    scan.nextLine();
    scan.nextLine();
    WordSearch crossword = new WordSearch(rowLength, columnLength);
		// read in rows
		// read in columns
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		// loop through the rows in the file
			// loop through the columns in the file
				// read in value from file using local variable
				// pass row, column, and value into the 2D array
    String num = "";
		for(int i = 0; i < rowLength; i++){
      for(int j = 0; j < columnLength; j++){
        num = scan.next();
        char newVal = num.charAt(0);
        crossword.setSpot(newVal, i, j);
      }
      scan.nextLine();
    }
    System.out.println("Done with array\n");
    System.out.println(crossword.toString());
    int howManySearch = scan.nextInt();
		// read number of words to search for from file
		// loops through the words
		for(int i = 0; i < howManySearch; i++){
      scan.nextLine();
      String read = scan.next();
      System.out.println(read + " -> " + crossword.inGrid(read));
    }
			// read in word from file
			// method call to search for the word in the 2D array
			// print out word to search for and true/false

	}
}