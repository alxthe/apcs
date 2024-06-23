/* 
  Authors:
  Alex Mathew (me)
  Reese Armstrong
*/
import java.util.ArrayList;

// **** Your Code Goes Here ****
public class Deck  {

  public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
  public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
  public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};
  private ArrayList<Card> deck = new ArrayList<Card>();

  
  public Deck() {
    this.initializeDeck();
  }

  public void initializeDeck() {
    deck.clear();
    for (int i = 0; i < SUITS.length; i++) {
      for (int j = 0; j < NAMES.length; j++) {
        deck.add(new Card(NAMES[j], SUITS[i], RANKS[j]));
      }
    }
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public void addCard(Card inpt){
    deck.add(inpt);
  }
  
  public void setDeck(ArrayList<Card> deck) {
    this.deck = deck;
  }

  public Card getCard(int idx) { 
    return this.deck.get(idx); 
  }

  public Card dealTopCard() {
    return this.deck.get(0);
  }

  public Deck topCard(int indx) {
    Deck tem = new Deck();
    for(int i = 1; i < indx; i++) {
      tem.addCard(deck.get(deck.size()-1));
    }
    return tem;
  }
  public void shuffle() {
    int var = (int)(Math.random() * 9) + 2;
    ArrayList<Card> cards = new ArrayList<Card>();
    for (int i = 0; i < var; i++) {
      cards.add(deck.remove(0));
    }
    int indx = (int)((Math.random() * (52 - var))) + 1;
    deck.addAll(indx, cards);
   }

  public String toString() {
    String d = "";
    for(int i = 0; i < deck.size(); i++) {
      d += deck.get(i).toString();
    }
    return "deck -> " + d;
  }
}