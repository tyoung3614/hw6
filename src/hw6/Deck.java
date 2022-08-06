package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

private List<Card> cards;

public Deck() {
	cards = fillWithCards();
	shuffle();
}

private List<Card> fillWithCards() {
	List<Card> newDeck = new ArrayList<Card>();
	newDeck.addAll(createSuitOfCards("Spades"));
	newDeck.addAll(createSuitOfCards("Diamonds"));
	newDeck.addAll(createSuitOfCards("Hearts"));
	newDeck.addAll(createSuitOfCards("Clubs"));
	return newDeck;
}

private List<Card> createSuitOfCards(String suit){
	List<Card> cardsInSuit = new ArrayList<Card>();
	for (int i = 2; i <= 14; i++) {
		Card card = new Card();
		card.setValue(i);
		String wordValue = "";
		if(i == 2 ) {
			wordValue = "Two";
		}
		
		if(i == 3 ) {
			wordValue = "Three";
		}
		
		if(i == 4 ) {
			wordValue = "Four";
		}
		
		if(i == 5 ) {
			wordValue = "Five";
		}
		
		if(i == 6 ) {
			wordValue = "Six";
		}
		
		if(i == 7 ) {
			wordValue = "Seven";
		}
		
		if(i == 8 ) {
			wordValue = "Eight";
		}
		
		if(i == 9 ) {
			wordValue = "Nine";
		}
		
		if(i == 10 ) {
			wordValue = "Ten";
		}
		
		if(i == 11 ) {
			wordValue = "Jack";
		}
		
		if(i == 12 ) {
			wordValue = "Queen";
		}
		
		if(i == 13 ) {
			wordValue = "King";
		}
		
		if(i == 14 ) {
			wordValue = "Ace";
		}
		
		card.setName(wordValue + " of " + suit);
		
		cardsInSuit.add(card);
	}
	
	return cardsInSuit;
}

public void shuffle() {
	List<Card> temp = new ArrayList<Card>(cards);
	cards.clear();
	Random random = new Random();
	while(!temp.isEmpty() ) {
		Card removedFromTemp = temp.remove(random.nextInt(temp.size()));
		cards.add(removedFromTemp);
	}
}

public Card draw() {
	Card topCard = cards.remove(0);
	return topCard; 
}


public List<Card> getCards() {
	return cards;
}

public void setCards(List<Card> cards) {
	this.cards = cards;
}
	
}
