package com.techlabs.treasureapp;
import java.util.Scanner;
public class Treasure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Treasure Island.");
		System.out.println("Your mission is to find the treasure.");
		String ch1=sc.nextLine();
		if(ch1.equalsIgnoreCase("right")){
			System.out.println("Fall into a hole.Game Over.");
			return;
				
		}
		else if(!ch1.equalsIgnoreCase("left")){
			System.out.println("Invalid Choice");
			return;
			
			
		}
		System.out.println("You came to a lake ");
		String action=sc.nextLine();
		if(action.equalsIgnoreCase("swim")) {
			System.out.println("Attacked by trout.game Over.");
			return;
			
		}
		else if(!action.equalsIgnoreCase("wait")) {
			System.out.println("Invalid GAme over.");
			return;
			
		}
		System.out.println("You arrive at 3 doors");
		String door=sc.nextLine();
		if(door.equalsIgnoreCase("blue")) {
			System.out.println("eaten by beasts.Game Over");
			 return;
		}
		else if(door.equalsIgnoreCase("red")) {
			System.out.println("Burned by fire.GAmeOver.");
			return;	
		}
		else if(door.equalsIgnoreCase("yellow")) {
			System.out.println("You WIn!");
			return;
		}
		else {
			System.out.println("GameOver.");
		}


	}

}
