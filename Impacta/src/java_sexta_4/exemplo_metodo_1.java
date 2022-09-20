package java_sexta_4;

public class exemplo_metodo_1 {

	public static void main(String[] args) {
		int a=10,b=20;
		int c=45,d=70;
		int res;
		 somar(a,b);
		 somar(c,d);
		 somar(56,89);	
	}
	
	
	public static void somar(int x,int y) {
		
		int aux;
		aux = x+y;
		System.out.println("Soma = " + aux);
		//return aux;

	}

}
