/*
  Authors:
  Alex Mathew (me)
  Reese Armstrong
*/

import java.util.*;
import java.util.ArrayList;

public class CardPlayer extends Player {

  private ArrayList<Card> hand = new ArrayList<Card>();
  private ArrayList<Card> takenCards = new ArrayList<Card>();

  public CardPlayer() {
    super("",0);
    takenCards = new ArrayList<Card>();
  }
  
  public CardPlayer(String name, int score, ArrayList<Card> hand) {
    super(name, score);
    this.hand = hand;
    //create a reference for takenCards???
  }

  public void addAll(ArrayList<Card> inpt) {
    hand.addAll(inpt);
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public void setHand(ArrayList<Card> hand) {
    this.hand = hand;
  }

  public ArrayList<Card> getTakenCards() {
    return takenCards;
  }

  public void setTakenCards(ArrayList<Card> takenCards) {
    this.takenCards = takenCards;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public Card playCard(int index) {
    return hand.remove(index);
  }

  public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
    for (Card card : hand) {
      if (card.getSuit() == "clubs" && card.getValue() == 2) {
        return hand.remove(hand.indexOf(card));
      }
    }
    if (round.isEmpty() && !game.isEmpty()) {
      return hand.remove((int)(Math.random() * hand.size()));
    }  
    else {
      ArrayList<Integer> set = new ArrayList<Integer>();
      ArrayList<Integer> heart = new ArrayList<Integer>();
      for (Card card : hand) {
        if (card.getSuit().equals(round.get(0).getSuit())) { /* error */
          set.add(hand.indexOf(card));
        }
        else if (card.getSuit().equals("hearts")) {
          heart.add(hand.indexOf(card));
        }
      }
      if (!set.isEmpty()) {
        int indx = (int)(Math.random() * set.size());
        return hand.remove((int)set.get(indx));
      }
      else if (!heart.isEmpty()) {
        int indx = (int)(Math.random() * heart.size());
        return hand.remove((int)heart.get(indx));
      }
      else {
        return hand.remove((int)(Math.random() * hand.size())); /*error*/
      }
    }
  }

  public String toString() {
    Collections.sort(hand);
    String var = "";
    for (Card temp : hand) {
      var = var + temp.toString() + ", ";
    }
    if (!var.isBlank()) {
      var = var.substring(0, var.length() - 2);
    }
    return super.toString() + " [" + var + "]";
  }
}