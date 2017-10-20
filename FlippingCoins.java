import java.util.Scanner;
import java.util.Random;
public class FlippingCoins {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("This program will simulate flipping a fair coin");
	System.out.println("How many times would you like the coin to be flipped?");
	int x = in.nextInt();
	int flips;
	double flip;
	int h = 0;
	int t = 0;
	System.out.println("Here is the sequence of coin flips: ");
	for (flips = x; flips >0; flips--){
		flip = rand.nextInt(2)+1;
		if (flip == 1){
			System.out.print("H");
			h++;
		}else{
			System.out.print("T");
			t++;
		}
	}
	System.out.println("\nThere were "+h+" heads and "+t+" tails.");
}
}
