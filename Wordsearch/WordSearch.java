import java.util.Arrays;

public class WordSearch {
/** one 2D array private instance variable named wordArray - You CANNOT add any additional instance variables */
  private char [][] word2DArray;

/** constructor used to set the number of rows and columns in the 2D array
* @param row
* @param col*/
  public WordSearch(int row, int col) {
    word2DArray = new char[row][col];
  }

/** method to set an element in the 2D array
* @param s which is the value to store in the 2D array
* @param row the row to use
* @param col the column to use*/
  public void setSpot(char s, int row, int col) {
    word2DArray[row][col] = s;
  }

/** methods to check for the word in the 2D array
* @param the word to search for
* @return return true or false*/
  public boolean inGrid(String s) {
    String letterCombination;
    int allRows = word2DArray.length;
    int columns = word2DArray[0].length;
    for(int r = 0; r < allRows; r++) {
      // creating a forward word for each row characters in the direction left to right
      letterCombination = "";
      for (int c = 0; c < columns; c++) {
        letterCombination += word2DArray[r][c];
      }
      if(letterCombination.indexOf(s) >= 0) {
        return true;
      }
      // REVERSING ALL CHARS - creating a backward word for each row characters in the direction right to left
      char [] allChars = letterCombination.toCharArray();
      letterCombination = "";
      for (int i = allChars.length - 1; i >= 0; i--) {
        letterCombination += allChars[i];
      }
      if(letterCombination.indexOf(s) >= 0) {
        return true;
      }
    }
    for (int c = 0; c < columns; c++) {
      // creating a forward word for each column characters in the direction top to bottom
      letterCombination = "";
      for (int r = 0; r < allRows; r++) {
        letterCombination += word2DArray[r][c];
      }
      if(letterCombination.indexOf(s) >= 0) {
        return true;
      }

      // REVERSING ALL CHARS - creating a backward word for each column characters in the direction bottom to top
      char [] allChars = letterCombination.toCharArray();
      letterCombination = "";
      for (int i = allChars.length - 1; i >= 0; i--) {
        letterCombination += allChars[i];
      }
      if(letterCombination.indexOf(s) >= 0) {
        return true;
      }
    }
    // diagonal search of words
    for (int r=0; r<allRows; r++) {
      for (int c=0; c<columns; c++) {
        //picking up words on upper left of the current element being scanned
        int r1 = r;
        int c1 = c;
        letterCombination = "";
        while (true) {
          letterCombination += word2DArray[r1][c1];
          r1--;
          c1--;
          if (r1 < 0 || c1 < 0) {
            break;
          }
        }
        // reversing the upper left word collection of the current element being scanned
        char [] characters = letterCombination.toCharArray();
        letterCombination = "";
        for (int i = characters.length - 1; i >= 0; i--) {
          letterCombination += characters[i];
        }
        // adding words (upper left collection so far done above plus) to the words on lower right of the current element being scanned
        r1 = r + 1;
        c1 = c + 1;
        while (true) {
          if (r1 >= allRows || c1 >= columns) {
            break;
          }
          letterCombination += word2DArray[r1][c1];
          r1++;
          c1++;
        }
        if(letterCombination.indexOf(s) >= 0) {
          return true;
        }
        // reversing the entire word and searching
        characters = letterCombination.toCharArray();
        letterCombination = "";
        for (int i = characters.length - 1; i >= 0; i--) {
          letterCombination += characters[i];
        }
        if(letterCombination.indexOf(s) >= 0) {
          return true;
        }
        //picking up words on lower left of the current element being scanned
        r1 = r;
        c1 = c;
        letterCombination = "";
        while (true) {
          letterCombination += word2DArray[r1][c1];
          r1++;
          c1--;
          if (r1 >= allRows || c1 < 0) {
            break;
          }
        }
        // reversing the lower left word collection of the current element being scanned
        characters = letterCombination.toCharArray();
        letterCombination = "";
        for (int i = characters.length - 1; i >= 0; i--) {
          letterCombination += characters[i];
        }
        // adding words (lower left collection so far done above plus) to the words on upper right of the current element being scanned
        r1 = r - 1;
        c1 = c + 1;
        while (true) {
          if (r1 < 0 || c1 >= columns) {
            break;
          }
          letterCombination += word2DArray[r1][c1];
          r1--;
          c1++;
        }
        if(letterCombination.indexOf(s) >= 0) {
          return true;
        }
        // reversing the entire word and searching
        characters = letterCombination.toCharArray();
        letterCombination = "";
        for (int i = characters.length - 1; i >= 0; i--) {
          letterCombination += characters[i];
        }
        if(letterCombination.indexOf(s) >= 0) {
          return true;
        }
      }
    }
    return false;
  }
  /** toString method
* @return String containing all elements in the 2D array*/
  public String toString() {
    System.out.print("[");
    for (int r=0; r<word2DArray.length; r++) {
      if (r>0) {
        System.out.print(" ");
      }
      System.out.print("[");
      System.out.print("");
      for (int c=0; c<word2DArray[r].length; c++) {
        System.out.print("" + word2DArray[r][c]);
        if (c < 14) {
          System.out.print(" ");
        }
      }
      System.out.print("]");
      if (r != word2DArray.length - 1) {
        System.out.println("");
      }
    }
    System.out.print("]");
    System.out.println("");
    return "";
  }
}