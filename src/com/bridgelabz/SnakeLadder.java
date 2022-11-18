package com.bridgelabz;

public class SnakeLadder {
	
		
		public static void main(String[] args) {
		System.out.println("starting of Snake and Ladder Game");
		System.out.println("Single Player at position 0");
		int step_Count_Player1=0;
		int step_Count_Player2=0;
		int count_Of_Dice_One=0;
		int count_Of_Dice_Two=0;
		int player;
			System.out.println("Player 1 will play first");
				
		while(step_Count_Player1!=100 || step_Count_Player2!=100) {
		int options=(int)(Math.random()*3+1);
		System.out.println("option is"+options);
		int dice_roll_One=(int)(Math.random()*6+1);
		System.out.println("Dice Rolled"+dice_roll_One);

				if(dice_roll_One>0) {
					count_Of_Dice_One++;}
				
				if(options==1) {
					System.out.println("No Play");
					//Step_Count=0;
				}
				else if(options==2) {
					System.out.println("there is ladder");
					int previous_Step_Count=step_Count_Player1;

					step_Count_Player1+=dice_roll_One;
					if(step_Count_Player1>100) {
						step_Count_Player1=previous_Step_Count;
					 System.out.println(previous_Step_Count);
					}
				}
				else if(options==3) {
					System.out.println("there is Snake");
					step_Count_Player1-=dice_roll_One;
					if(step_Count_Player1<0) {
						step_Count_Player1=0;
					}else {
						step_Count_Player1=step_Count_Player1;
					}}
				else {
						System.out.println("roll dice again");
					}
				  System.out.println("step count of player1 is"+step_Count_Player1);
		  
		  			int dice_roll_two=(int)(Math.random()*6+1);
					System.out.println("Dice Rolled"+dice_roll_two);


					if(dice_roll_two>0) {
					count_Of_Dice_Two++;}
			
					if(options==1) {
					System.out.println("No Play");
							}
					else if(options==2) {
					System.out.println("there is ladder");
					int previous_Step_Count=step_Count_Player2;

					step_Count_Player2+=dice_roll_two;
					if(step_Count_Player2>100) {
					step_Count_Player2=previous_Step_Count;
				 	System.out.println(previous_Step_Count);
					}
				}
					else if(options==3) {
					System.out.println("there is Snake");
					step_Count_Player2-=dice_roll_two;
					if(step_Count_Player2<0) {
					step_Count_Player2=0;
				}	
					else {
					step_Count_Player2=step_Count_Player2;
				}
					}
					else {
					System.out.println("roll dice again");
					}
			System.out.println("step count of player1 is"+step_Count_Player2);
			System.out.println("The dice roll 2 roled"+count_Of_Dice_Two);
			System.out.println("The total number of times the dice rolled1 is:"+count_Of_Dice_One);
			System.out.println("The total number of times the dice rolled2 is:"+count_Of_Dice_Two);

			if(step_Count_Player2==100) {
			System.out.println("Player 2 is Winner");
			break;
			}
			else {
				System.out.println("roll a dice again");
			}
			if(step_Count_Player1==100) {
			System.out.println("Player 1 is Winner");
		        break;
		  }

		}
			

	  }
    }		


