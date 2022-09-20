import java.util.*;

public class vetoooor {

public static void main(String[] args) {
		
		int i,j;
		Scanner sc = new Scanner(System.in);
		int[] vet = new int[10];
		int[] copia = new int[10];
		
		for(i=0;i<10;i++) {
			System.out.println("Digite um valor");
			vet[i] = sc.nextInt();
			
		}
		
		for(i=0,j=9;i<10;i++,j--) {
			copia[i]=vet[j];
		}
		
		for(i=0;i<10;i++) {
			  System.out.println(copia[i]);
		}

	}

}
