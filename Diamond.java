import java.util.Scanner;
public class Diamond {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int x = in.nextInt();
	int i = x;
	for (i=x; i>=0; i--){
		for (int j=i; j>=0; j-=2){
			System.out.print(" ");
		}
		for (int k=x; k>=i; k--){
			if (i%2==0){
				System.out.print("*");
			}
		}
		System.out.println();
	}
	for (int w=x*2-1; w>0; w--){
		System.out.print("*");
	}
	System.out.println();
	for (i=x; i>=0; i--){
		for (int j=i; j<=x; j+=2){
			System.out.print(" ");
		}
		for (int k=0; k<=i; k++){
			if (i%2==0){
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	
}
}
