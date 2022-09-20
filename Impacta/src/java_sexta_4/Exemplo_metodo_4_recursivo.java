package java_sexta_4;

public class Exemplo_metodo_4_recursivo {

	public static void main(String[] args) {
		
		int i;
		int fat=1;
		
		for(i=1;i<=5;i++) {
			
			System.out.println(i);
			fat = fat*i;
			System.out.println("fat parcial= "+ fat);
		}
			System.out.println("fat final = "+ fat);
		

	}

}
