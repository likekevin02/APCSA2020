package elevens;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String suit;
		private int face;

  	//constructors
		public Card(){
			suit = "SPADES";
			face = 1;
		}
		
		public Card(String startSuit, int startFace) {
			setCard(startSuit, startFace);
		}

	// modifiers
		//set methods
		public void setCard(String startSuit, int startFace) {
			suit = startSuit;
			face = startFace;
		}
		
		public void setFace(int startFace) {
			face = startFace;
		}
		
		public void setSuit(String startSuit) {
			suit = startSuit;
		}

  	//accessors
		//get methods
		public String getSuit() {
			return suit;
		}
		
		public int getFace() {
			return face;
		}


  	//toString
		
		public String toString() {
			return FACES[face] + " of " + suit;
		}

 }