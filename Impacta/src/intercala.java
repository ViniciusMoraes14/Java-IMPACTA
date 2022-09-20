import java.util.*;
public class intercala {

public static void main(String[] args) {
		
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		int[] res = new int[20];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("digite respectivamente um valor para v1 e depois um valor para v2");
		    v1[i] = sc.nextInt();
		    v2[i] = sc.nextInt();
		}
		// intercalaçao dos vetores
		for(int i=0;i<10;i++) {
			res[2*i]=v1[i];
			res[2*i+1]=v2[i];
		}
		for(int j=0;j<20;j++) {
			System.out.println(res[j]);
		}
	}
}
