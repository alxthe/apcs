/*
  Author:
  Alex Mathew
*/

import java.util.*;
public class CardPlayerLevel1 extends CardPlayer {
    
  public CardPlayerLevel1(String name, int score, ArrayList<Card> hand) {
    super(name, score, hand);
  }

    public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
    ArrayList<Card> hand = getHand();
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
    if (card.getSuit().equals(round.get(0).getSuit())) {
          set.add(hand.indexOf(card));
        }
        else if (card.getSuit().equals("hearts")) {
          heart.add(hand.indexOf(card));
        }
      }
      if (!set.isEmpty()) {
        int indx = (int)(Math.random() * heart.size());
        return hand.remove((int)set.get(indx));
      }
      for (int i = 0; i < hand.size(); i++) {
      if (hand.get(i).getSuit().equals("spades") && hand.get(i).getValue() == 12) {
          return playCard(i);
      }
    }
      if (!heart.isEmpty()) {
        int indx = 0;
        for (int i = 0; i < heart.size(); i++) {
          int big = 0;
          if (hand.get((int)heart.get(i)).getValue() > big) {
            big = hand.get((int)heart.get(i)).getValue();
            indx = i;
          }
        }
        return hand.remove((int)heart.get(indx));
      }
      else {
        return hand.remove((int)(Math.random() * hand.size()));
      }
    }
  }
}