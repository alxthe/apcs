/*
  Authors:
  Alex Mathew (me)
  Reese Armstrong*/

import java.util.*;
import java.io.*;

public class CardGame {
  
  private Deck deckOfCards = new Deck();
  private String nameOfGame;
  private ArrayList<CardPlayer> players = new ArrayList<CardPlayer>();
  private int numberOfPlayers;
  private int currentPlayer;

  public CardGame(String nameOfGame, int numberOfPlayers, String[] thePlayers, int currentPlayer) {
    this.nameOfGame = nameOfGame;
    this.numberOfPlayers = numberOfPlayers;
    this.currentPlayer = currentPlayer;
    deckOfCards.initializeDeck();
    ArrayList<Card> temp = new ArrayList<Card>();
    ArrayList<Card> temp2 = new ArrayList<Card>();
      players.add(new CardPlayerLevel1(thePlayers[0], 0, temp));
      players.add(new CardPlayer(thePlayers[1], 0, temp));
      players.add(new CardPlayer(thePlayers[2], 0, temp));
      players.add(new CardPlayer(thePlayers[3], 0, temp));
    }
  
  public Player getPlayer(int index) {
    return players.get(index);
  }
  
  public Deck getDeckOfCards() {
    return this.deckOfCards;
  }

  public void setDeckOfCards(Deck deckOfCards) {
    this.deckOfCards = deckOfCards;
  }

  public String getNameOfGame() {
    return this.nameOfGame;
  }

  public void setNameOfGame(String nameOfGame) {
    this.nameOfGame = nameOfGame;
  }

  public ArrayList<CardPlayer> getPlayers() {
    return this.players;
  }

  public void setPlayers(ArrayList<CardPlayer> players) {
    this.players = players;
  }

  public int getNumberOfPlayers() {
    return this.numberOfPlayers;
  }

  public void setNumberOfPlayers(int numberOfPlayers) {
    this.numberOfPlayers = numberOfPlayers;
  }

  public int getCurrentPlayer() {
    return this.currentPlayer;
  }

  public void setCurrentPlayer(int currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

public void deal(int numberOfCardss, int index) {
  players.get(index).addAll(deckOfCards.topCard(numberOfCardss).getDeck());
  }  
/*public void deal(int numOfCardsToDeal, int playerIndex){
    players.get(playerIndex).addAll(deckOfCards.topCards(numOfCardsToDeal).getDeck());
  }*/
  public void playGame() {

    for(int i = 0; i < players.size(); i++) {
      for(Card card : players.get(i).getHand()) {
        if(card.getValue() == 2 && card.getSuit().equals("clubs")) {
          currentPlayer = i;
        }
      }
    }
    
    ArrayList<Card> game = new ArrayList<Card>();
    ArrayList<Card> round = new ArrayList<Card>();
    int newCurrentPlayer = 0;
    int topCardPlayed = 0;
    
    for(int i = 0; i < 13; i++) {
     players.get(currentPlayer).chooseCard(round, game); /* error */
      for(int j = ++currentPlayer; j < players.size(); j++) {
        Card playedCard = players.get(j).chooseCard(round, game);
        round.add(playedCard);
        game.add(playedCard);

        if(playedCard.sortRank() > topCardPlayed) {
          newCurrentPlayer = j;
          topCardPlayed = playedCard.sortRank();
        }
      }
      
      for(int j = 0; j < currentPlayer; j++) {
        Card playedCard = players.get(j).chooseCard(round, game);
        round.add(playedCard);
        game.add(playedCard);

        if(playedCard.sortRank() > topCardPlayed) {
          newCurrentPlayer = j;
          topCardPlayed = playedCard.sortRank();
        }
      }

      ArrayList<Card> newCurrentPlayerTakenCards = players.get(newCurrentPlayer).getTakenCards();
      for(int j = 0; j < round.size(); j++) {
        newCurrentPlayerTakenCards.add(round.get(j));
      }

      players.get(newCurrentPlayer).setTakenCards(newCurrentPlayerTakenCards);

      currentPlayer = newCurrentPlayer;
    }

    for(int j = 0; j < players.size(); j++) {
      for(int k = 0; k < players.get(j).getTakenCards().size(); k++) {
        players.get(j).setScore(players.get(j).getScore() + players.get(j).getTakenCards().get(k).sortRank());
      }
    }
    
  }

  public String toString() {
    String name = "";
    for (int i = 0; i < players.size(); i++) {
      name = name + players.get(i).toString() + "\n";
    }
    return "***"+nameOfGame+"***\n" + name + deckOfCards.toString();
  }

  
}