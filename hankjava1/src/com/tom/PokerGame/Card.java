package com.tom.PokerGame;

public class Card {
	char[] suits  = {'\u2663' , '\u2666','\u2665','\u2666'};
	int value;
	int symbol;
	int suit;
	public Card(){
		this.value = value;
	}
	
		

	public String get(){
		String s = value %13 +1 +" " + suits[value/13];
		return s;
	}
	
		
	}
