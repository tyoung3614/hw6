package hw6;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		deck.shuffle();
		
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				player1.Draw(deck);
			} else {
				player2.Draw(deck);
			}
		}
		
		for (int i = 1; i <= 26; i++) {

				Card player1Card = player1.flip();

				Card player2Card = player2.flip();
				
				if(player1Card.getValue() == player2Card.getValue()) {
					
				} else if(player1Card.getValue() > player2Card.getValue()) {
					
					 player1.incrementScore();
					 
				} else {
					player2.incrementScore();
				}

		}
		
		System.out.println("Player 1 Score: " + player1.getScore());
		System.out.println("Player 2 Score: " + player2.getScore());
		
		if(player1.getScore() == player2.getScore()) {
			System.out.println("Draw");
			
		} else if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
			 
		} else {
			System.out.println("Player 2 wins!");
		}
		
		
		
	}

}
