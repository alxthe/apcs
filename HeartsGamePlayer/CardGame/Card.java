/*
  Authors:
  Alex Mathew (me)
  Reese Armstrong
*/

public class Card implements Comparable<Object> {
  /**
  * Set instance variables as follows;
  *   variable "name" of type string
  *   variable suit of type string
  *   variable "value" of type primitive integer
  * Note: use the correct access specifier
  */
  private String name;    // example with "name" instance variable
  private String suit;
  private int value;
   
  /**
  * Card Constuctor - default
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param none
  */
  public Card() {
    this.name = "default";
    this.suit = "default";
    this.value = 0;
  }

  // ** Your code here **

  /**
  * Card Constuctor - initializing
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param  name a string with name of card
  * @param  suit a string with name of suit
  * @param  value an integer with the value of the card
  */

  // ** Your code here **

  public Card(String name, String suit, int value) {
    this.name = name;
    this.suit = suit;
    this.value = value;
  }


  /**
  * Accessor Methods for each instance variable
  */

  // ** Your code here **

  public String getName() { return this.name; }
  public String getSuit() { return this.suit; }
  public int getValue() { return this.value; }

  /**
  * Mutator Methods for each instance variable
  */

  // ** Your code here **

  public void setName(String name ) { this.name = name; }
  public void setSuit(String suit ) { this.suit = suit; }
  public void setValue(int value ) { this.value = value; }



  /**
  * sortRank - Helper function to give rank of card, weighted
  *            by suit. 
  *                diamonds 0-12, hearts 13-25, 
  *                spades 26 - 38, clubs 39 - 51
  *  So you simply need to add a wight to value of this card object
  *                diamonds: value + 0
  *                hearts: value + 13
  *                spades: value + 26
  *                clubs: value + 39
  */



  public int sortRank() {     
    // ** You have to fix this method declaration

    // ** Your code here **

    switch (suit) {
        case "diamonds":
          // diamonds
          return value;
        case "hearts":
          // hearts
          return value + 13;
        case "spades":
          // spades
          return value + 26;
        case "clubs":
          // clubs
          return value + 39;
      default:
        return -1;
    }
  }


  /**
  * compareTo - Override the compareTo() method default
  * 
  */

  public int compareTo(Object obj) throws Error  {     
    // ** You have to fix this method declaration
    
    // ** Your code here **

    Card card = (Card) obj;

    if(card.sortRank() == this.sortRank()) return 0;
    if(card.sortRank() > this.sortRank()) return -1;
    if(card.sortRank() < this.sortRank()) return 1;

    throw new Error("Unable to sort card");
   }

  /**
  * equals - Override the equals() method default
  *  for indexOf() to work on an array of cards we 
  *   need to define what it means for two cards to 
  *   be equal.  We use indexOf() to find the 2 of 
  *   clubs in the CardGame class.
  */
   
  // ** Your code here **

  public boolean equals(Object obj) {
    
    Card card = (Card) obj;

    return card.name.equals(name) && card.value == value && card.suit.equals(suit);
  }


  /**
  * toString - Override the toString method default
  * 
  */

  // ** Your code here **

  public String toString() {
    if (value == 14) {
      if (suit.equals("diamonds")) {
      return "d" + "A" + "(" + value + ")";
    }
    if (suit.equals("spades")) {
      return "s" + "A" + "(" + value + ")";
    }
    if (suit.equals("hearts")) {
      return "h" + "A" + "(" + value + ")";
    }
    return "c" + "A" + "(" + value + ")";
    }

    if (value == 13) {
      if (suit.equals("diamonds")) {
      return "d" + "K" + "(" + value + ")";
    }
    if (suit.equals("spades")) {
      return "s" + "K" + "(" + value + ")";
    }
    if (suit.equals("hearts")) {
      return "h" + "K" + "(" + value + ")";
    }
    return "c" + "K" + "(" + value + ")";
    }

    if (value == 12) {
      if (suit.equals("diamonds")) {
      return "d" + "Q" + "(" + value + ")";
    }
    if (suit.equals("spades")) {
      return "s" + "Q" + "(" + value + ")";
    }
    if (suit.equals("hearts")) {
      return "h" + "Q" + "(" + value + ")";
    }
    return "c" + "Q" + "(" + value + ")";
    }

    if (value == 11) {
      if (suit.equals("diamonds")) {
      return "d" + "J" + "(" + value + ")";
    }
    if (suit.equals("spades")) {
      return "s" + "J" + "(" + value + ")";
    }
    if (suit.equals("hearts")) {
      return "h" + "J" + "(" + value + ")";
    }
    return "c" + "J" + "(" + value + ")";
    }
    
    if (suit.equals("diamonds")) {
      return "d" + value + "(" + value + ")";
    }
    if (suit.equals("spades")) {
      return "s" + value + "(" + value + ")";
    }
    if (suit.equals("hearts")) {
      return "h" + value + "(" + value + ")";
    }
    return "c" + value + "(" + value + ")";
  }
  
}
