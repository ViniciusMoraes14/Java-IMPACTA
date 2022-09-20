import java.util.*;

public class vetpar {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for(x=0;x<10;x++) {
			System.out.println("Digite um valor:");
			vet[x] = sc.nextInt();
		}
		for(x=0;x<10;x++) {
			if(x%2!=0)
				System.out.println(vet[x]);
		}
		
	}
	
}
