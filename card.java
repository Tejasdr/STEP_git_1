// To Play a game with deck of cards 
import java.util.Scanner;

public class card{
	
	public final int suit;
	public final int rank;
	
	public card (int suit, int rank){
		
		if ((isValidSuit(suit) && isValidRank(rank)) == true){
			
			this.suit = suit;
			this.rank = rank;
		}
		else{
			System.out.println("Invalid entry");
			this.suit = 0;
			this.rank = 0;
		}
		
	}
		
	boolean isValidSuit(int suit){
		
		if (suit >= 1 && suit <= 4)
			return true;
		else 
			return false;
	}

	boolean isValidRank(int rank){
		
		if(rank >= 1 && rank <= 13)
			return true;
		else
			return false;
	}
	
	String getSuit(){
		switch (suit){
			case 1 : 
					return "Diamonds";
					
			case 2 :
					return "Clubs";
					
			case 3 :
					return "Hearts";
					
			case 4 :
					return "Spades";
					
		}	
		return "0";
	}

	String getRank(){
		
		switch (rank){
			
			case 1 :
					return "ACE";
				
			case 2 :
					return "Deuce";
					
			case 3 :
					return "Three";
					
			case 4 :
					return "Four";
					
			case 5 :
					return "Five";
					
			case 6 :
					return "Six";
					
			case 7 :
					return "Seven";
					
			case 8 :
					return "Eight";
					
			case 9 :
					return "Nine";
					
			case 10 :
					return "Ten";
					
			case 11 :
					return "Jack";
					
			case 12	:
					return "Queen";
					
			case 13	:
					return "King";
					
		}			
		return "0";	
	}
	

	public static void main(String []args){
		int suit, rank;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Suit and Rank respectively");
		suit = input.nextInt();
		rank = input.nextInt();
		card c = new card(suit, rank);
		
		if (c.isValidRank(rank) && c.isValidSuit(suit) == true){
			System.out.println("Suit : " + c.getSuit() + " Rank : " + c.getRank());
		}		
		else
			System.out.println("End of program");
		
	}	
	
}	
			
			