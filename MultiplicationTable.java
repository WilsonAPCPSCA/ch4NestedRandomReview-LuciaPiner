public class MultiplicationTable {
public static void main(String[] args){
	int x;
	for (int i = 1; i <= 10; i++){
		for (int j = 1; j <= 10; j++){
			x = j*i;
			System.out.print(x+" ");
		}	
		System.out.println();
	}
}
}
