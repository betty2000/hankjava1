package com.tom.PokerGame;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args)
	{char f 
	}
		{int[] nums =new int [5];
		nums[0] = 98;
		nums[4] = 77;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for(int i = 0; i<nums.length; i ++  ){
		System.out.println(nums[i]);	
		}
		
		
		
		
		Random random = new Random();
		for(int i = 0; i<52; i++ ){
			int x = random.nextInt(13)+1;
			int y = random.nextInt(4);
			System.out.print(x);
			char c = 0;
			switch(y){
			case 0:
			c = 'C';
			 break;
			 
			case 1:
			c = 'S';
			 break;
			
			case 2:
			c = 'H';
			 break;
		 
		case 3:
		c = 'D';
		 break;
		
		}
		System.out.println(c);
		
	}
	
	
}
}	
