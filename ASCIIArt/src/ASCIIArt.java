/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] arg) {
		// the top line
		space();
		space();
		space();
		space();
		squareTop();
		squareTop();
		squareTop();
		squareTop();
		squareTop();
		space();
		space();
		space();
		space();
		// the boxes of top line
		System.out.println();
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		box();
		box();
		space();
		space();
		space();
		space();

		// 2nd line out of 11 tops
		System.out.println("");
		System.out.print(" ");
		space();
		space();
		space();
		box();
		box();
		box();
		box();
		box();
		box();
		box();
		box();
		box();
		space();

		// 3rd line out 11
		System.out.println("");
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		box();
		box();
		box();
		box();
		box();
		space();

		// 4th line out 11
		System.out.println("");
		space();
		space();
		space();
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		box();
		space();

		// 5th line out 11
		System.out.println("");
		System.out.print(" ");
		space();
		space();
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		box();
		box();
		box();

		// 6th line out 11
		System.out.println("");
		space2();
		space();
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		space3();;
		box();
		box();
		box();

		// 7th line out 11
		System.out.println("");
		space3();
		space();
		space();
		space();
		space();
		box();
		box();
		box();
		System.out.print("      ");
		box();
		box();
		box();

		// 8th line out 11
		System.out.println("");
		space3();
		space();
		space();
		space();
		System.out.print(" ");
		box();
		box();
		box();
		space();
		space();
		System.out.print(" ");
		box();
		box();
		box();

		// 9th line out 11
		System.out.println("");
		space3();
		space();
		space();
		space2();
		box();
		box();
		box();
		space();
		space();
		space();
		box();
		box();
		box();

		// 9th line out 11
		System.out.println("");
		space2();
		space();
		space();
		box();
		box();
		box();
		space();
		space();
		space();
		space();
		space2();
		box();
		
		// 10th line out 11
		System.out.println("  ");
		space2();
		space();
		box();
		box();
		box();
		System.out.print("                      \\\\");

		// 11th line out 11
		System.out.println("");
		space3();
		box();
		box();
		box();
		System.out.print("                         //");
		

		System.out.println("\n   (\\_/)                             \\\\");
		System.out.println("   ( *^*)                            //");
		System.out.println("////v   \\>                           \\\\");
		System.out.println("   (\")(\")                            //");
		
		System.out.println("\n\t bunny thor unleashing his wrath");
	}
	//static methods
	public static void squareTop() {
		System.out.print("___");
	}

	public static void space() {
		System.out.print("    ");
	}

	public static void box() {
		System.out.print("|_|");
	}
	
	public static void space2() {
		System.out.print("  ");
	}
	
	public static void space3() {
		System.out.print("   ");
	}
}