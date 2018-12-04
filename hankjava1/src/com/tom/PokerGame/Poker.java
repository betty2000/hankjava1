package com.tom.PokerGame;

import java.util.Random;

public class Poker {
	Card[] cards = new Card [52];
	
	public Poker(){
		for(int i = 0; i <52; i ++){
		cards[i] = new Card();

	}
}

	public void print(){
		for(int i = 0; i <52; i ++){
		int r = new Random().nextInt(52);
		//a = cards[i]
		//b = cards[r]	
		Card tmp = cards[i];
		cards[i] = cards[i];
		cards[r] = tmp;
	}
	
	
}
}
