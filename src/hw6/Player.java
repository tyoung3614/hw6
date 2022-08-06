package hw6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player() {
		setScore(0);
		hand = new ArrayList<Card>();
	}

	public void describe() {
	System.out.println("Player name: "+ name + " Score: " + score);
	for (Card currentCard : hand) {
		currentCard.describe();
	}
	}
	
	public Card flip() {
		Card topCard = hand.remove(0);
		return topCard; 
	}
	
	public void Draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
