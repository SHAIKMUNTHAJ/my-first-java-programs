package conditionalStataments;

import java.util.Scanner;

//A small mini console base application using conditional statements
public class MarketConsoleBaseApplication {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a Category:");
		String Category=sc.next();
		String yn="";
		do {

			switch(Category) {
			case "vegg"->{
			System.out.println("enter a Item");
			String Item=sc.next();
			
			switch(Item) {
			case "tmt" ->
		    System.out.println("Tomato and the price is 20rs per kg");

		case "ptp" ->
		    System.out.println("Potato and the price is 30rs per kg");

		case "dmtt" ->
		    System.out.println("Drumstick and the price is 40rs per kg");

		case "clf" ->
		    System.out.println("Cauliflower and the price is 30rs per kg");

		case "cbg" ->
		    System.out.println("Cabbage and the price is 40rs per kg");

		case "oni" ->
		    System.out.println("Onion and the price is 35rs per kg");

		case "car" ->
		    System.out.println("Carrot and the price is 50rs per kg");

		case "btn" ->
		    System.out.println("Beetroot and the price is 45rs per kg");

		case "brj" ->
		    System.out.println("Brinjal and the price is 30rs per kg");

		case "chk" ->
		    System.out.println("Chilli and the price is 60rs per kg");

		case "bns" ->
		    System.out.println("Beans and the price is 55rs per kg");

		case "ggr" ->
		    System.out.println("Ginger and the price is 80rs per kg");

		case "gar" ->
		    System.out.println("Garlic and the price is 120rs per kg");

		default ->
		    System.out.println("Invalid vegetable code");
			}
			}
			
			case"fruits"->{
				System.out.println("Enter a Item:");
				String Item=sc.next();
				switch(Item) {
				case "mgo" ->
			    System.out.println("Mango and the price is 100rs per kg");

			case "wat" ->
			    System.out.println("Watermelon and the price is 25rs per kg");

			case "mst" ->
			    System.out.println("Muskmelon and the price is 150rs per kg");

			case "str" ->
			    System.out.println("Strawberry and the price is 200rs per kg");

			case "app" ->
			    System.out.println("Apple and the price is 180rs per kg");

			case "ban" ->
			    System.out.println("Banana and the price is 60rs per dozen");

			case "org" ->
			    System.out.println("Orange and the price is 120rs per kg");

			case "grp" ->
			    System.out.println("Grapes and the price is 90rs per kg");

			case "png" ->
			    System.out.println("Pomegranate and the price is 160rs per kg");

			case "pap" ->
			    System.out.println("Papaya and the price is 50rs per kg");

			case "pin" ->
			    System.out.println("Pineapple and the price is 70rs each");

			default ->
			    System.out.println("Entered Item is not available here");
				
			}
		}
		}
			System.out.println("do you want to proceed click yes oy no..?");
			yn=sc.next();
		
		}while(yn.equalsIgnoreCase("y"));
		
	}
	}

