package com.bridgelabz;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("starting of Snake and Ladder Game");
		System.out.println("The single player is at position 0");
		System.out.println("-------------------------------------");
		int Step_Count = 0;
		int count_of_dice = 0;
		int condition = 10;
		while (condition > 0) {
			int options = (int) (Math.random() * 3 + 1);
			System.out.println("option is" + options);
			int dice_roll = (int) (Math.random() * 6 + 1);
			System.out.println("Dice Rolled" + dice_roll);

			if (dice_roll > 0) {
				count_of_dice++;
			}

			if (options == 1) {
				System.out.println("No Play");
				Step_Count = Step_Count;
			} else if (options == 2) {
				System.out.println("there is ladder");
				Step_Count += dice_roll;
			} else if (options == 3) {
				System.out.println("there is Snake");
				Step_Count -= dice_roll;
				if (Step_Count < 0) {
					Step_Count = 0;
				} else {
					Step_Count = Step_Count;
				}
			} else {
				System.out.println("roll dice again");
			}
			System.out.println("step count is" + Step_Count);

			System.out.println("-------------------------");

			if (Step_Count == 100) {
				System.out.println("Player is winner");
				break;
			} else {
				System.out.println("roll a dice again");
			}

		}

	}
}
