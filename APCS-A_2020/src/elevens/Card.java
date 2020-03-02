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
		private String rank;
		private int pointValue;


  	//constructors
		public Card(){
			suit = "SPADES";
			face = 1;
			rank = "ACE";
			pointValue = 1;
		}
		
		public Card(String startSuit, int startFace) {
			setCard(startSuit, startFace);
		}
		
		public Card(String startSuit, String startRank, int startPointValue) {
			setCard(startSuit, startRank, startPointValue);
		}

	// modifiers
		//set methods
		public void setCard(String startSuit, int startFace) {
			suit = startSuit;
			face = startFace;
		}
		
		public void setCard(String startRank, String startSuit, int startPointValue) {
			rank = startRank;
			suit = startSuit;
			pointValue = startPointValue;
		}
		
		public void setFace(int startFace) {
			face = startFace;
		}
		
		public void setSuit(String startSuit) {
			suit = startSuit;
		}
		
		public void setRank(String startRank) {
			rank = startRank;
		}
		
		public void setPointValue(int startPointValue) {
			pointValue = startPointValue;
		}

  	//accessors
		//get methods
		public String getSuit() {
			return suit;
		}
		
		public int getFace() {
			return face;
		}
		
		public String getRank() {
			return rank;
		}
		
		public int getPointValue() {
			return pointValue;
		}
		


  	//toString
		
		public String toString() {
			if (pointValue > 0) {
				return FACES[pointValue] + " of " + suit;
			}
			return FACES[face] + " of " + suit;
		}
		
		public boolean matches(Card otherCard) {
			if (this.getSuit().equals(otherCard.getSuit())&&this.getRank().equals(otherCard.getRank())&&this.pointValue==(otherCard.pointValue)) {
				return true;
			} else if(this.getSuit().equals(otherCard.getSuit())&&this.getRank().equals(otherCard.getRank())&&this.face==(otherCard.face)) {
				return true;
			}
			
			return false;
		}

 }