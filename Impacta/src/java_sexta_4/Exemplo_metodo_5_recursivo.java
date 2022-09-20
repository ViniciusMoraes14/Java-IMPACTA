package java_sexta_4;

public class Exemplo_metodo_5_recursivo {

	public static void main(String[] args) {
		
		int num = 5,res;	
		res=fatorial(num);
		System.out.println("Fatorial = "+res);
	}
	
	public static int fatorial(int x) {
		
		if(x<=1) {
			return 1;
		}
		else {
			return(x * fatorial(x-1));
		}
	}

}
