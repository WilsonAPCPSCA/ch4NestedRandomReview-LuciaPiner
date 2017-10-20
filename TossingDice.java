import java.util.Random;
import java.util.Scanner;
public class TossingDice {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("This program will simulate tossing a pair of dice.");
	System.out.println("How many times would you like the dice to be tossed?");
	int x = in.nextInt();
	int times;
	int roll1;
	int roll2;
	int sum = 0;
	int s2 = 0;
	int s3 = 0;
	int s4 = 0;
	int s5 = 0;
	int s6 = 0;
	int s7 = 0;
	int s8 = 0;
	int s9 = 0;
	int s10 = 0;
	int s11 = 0;
	int s12 = 0;
	System.out.println("Here is the sequsence of sums, one for each toss: ");
	for (int i = x; i>0; i--){
		roll1 = rand.nextInt(6)+1;
		roll2 = rand.nextInt(6)+1;
		sum = roll1+roll2;
		System.out.print(sum+" ");
		if (sum == 2){
			s2++;
		}else if (sum == 3){
			s3++;
		}else if (sum == 4){
			s4++;
		}else if (sum == 5){
			s5++;
		}else if (sum == 6){
			s6++;
		}else if (sum == 7){
			s7++;
		}else if (sum == 8){
			s8++;
		}else if (sum == 9){
			s9++;
		}else if (sum == 10){
			s10++;
		}else if (sum == 11){
			s11++;
		}else if (sum == 12){
			s12++;
		}
	}	
	System.out.println();
	System.out.print("2: ");
	for (int w = s2;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("3: ");
	for (int w = s3;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("4: ");
	for (int w = s4;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("5: ");
	for (int w = s5;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("6: ");
	for (int w = s6;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("7: ");
	for (int w = s7;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("8: ");
	for (int w = s8;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("9: ");
	for (int w = s9;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("10: ");
	for (int w = s10;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("11: ");
	for (int w = s11;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	System.out.print("12: ");
	for (int w = s12;w>0; w--){
		System.out.print("*");
	}
	System.out.println();
}
}
