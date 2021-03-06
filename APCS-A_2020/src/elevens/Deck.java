package elevens;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

	private List<Card> cards;
	private int top;
	private int size;

	// make a Deck constructor
	public Deck() {
		cards = new ArrayList<Card>();
		top = 51;

		for (int i = 0; i < SUITS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				Card newCard = new Card(SUITS[i], j);
				cards.add(newCard);
			}
		}
	}


	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		cards = new ArrayList<Card>();
		
		for (int s = 0; s <suits.length; s++ ) {
			for (int r = 0; r<ranks.length;r++) {
				cards.add(new Card(ranks[r],suits[s],pointValues[r]));
			}
		}
		
		size = cards.size();
		top = size-1;
		this.shuffle();
	}

	//dealCard is deal
	public Card dealCard() {
		Card topCard;
		if (!isEmpty()) {
			topCard = cards.get(top);
		} else {
			return new Card();
		}

		top--;
		size--;
		return topCard;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

//write a shuffle() method
	// use Colletions.shuffle
	// reset the top card

	public void shuffle() {
		
		for (int k = size-1; k >= 1; k--) {
			int r = (int) (Math.random()*size);
			Card temp = cards.get(k);
			Card temp1 = cards.get(r);
			cards.set(k,temp1);
			cards.set(r, temp);
		}
	}

	public void resetTop() {
		size = cards.size();
		top = size - 1;
	}
	
	public String toString() {
		String rtn = "size = " +size + "\nUndealt cards: \n";
		
		for (int k=size -1; k>=0;k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn +", ";
			}
			if ((size - k)% 2 ==0) {
				rtn = rtn + "\n";
			}
		}
		
		rtn = rtn +"\n\nDealt cards: \n";
		for (int k = cards.size()-1; k>= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn+ ", ";
			}
			if ((size - k)% 2 == 0){
				rtn = rtn +"\n";
			}
		}
		
		return rtn + "\n";
	}
				

}