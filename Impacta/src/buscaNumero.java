import java.util.*;

public class buscaNumero {
    public static void main(String[] args) {

	int[] array = {1,2,3,4,5,55,65,10,12,32};
	Scanner sc = new Scanner(System.in);
	
	
	//System.out.println(array[0]);
	for (int x=0; x<10; x++) {
	    if(array[x] == 55) {
		System.out.println("Número encontrado: " + array[x]);
		
	    }
	    
	}
	
    }
    
}
