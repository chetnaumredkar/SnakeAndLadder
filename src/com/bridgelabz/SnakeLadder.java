package com.bridgelabz;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("starting of Snake and Ladder Game");
		System.out.println("The single player is at position 0");
		System.out.println("-------------------------------------");
		 int dice_roll=(int)(Math.random()*6+1);
			System.out.println("Dice Rolled :"+dice_roll);
			int Step_Count=0;
			int options=(int)(Math.random()*3+1);
			System.out.println("option is"+options);
			if(options==1) {
				System.out.println("No Play");
				Step_Count=Step_Count;
			}
			else if(options==2) {
				System.out.println("there is ladder");
				Step_Count+=dice_roll;
			}
			else if(options==3) {
				System.out.println("there is Snake");
				Step_Count-=dice_roll;
			}
			else {
					System.out.println("roll dice again");
				}
	}
}