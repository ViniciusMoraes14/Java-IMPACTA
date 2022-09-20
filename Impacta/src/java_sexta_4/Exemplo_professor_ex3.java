package java_sexta_4;

import java.util.*;

public class Exemplo_professor_ex3 {

	public static void main(String[] args) {
		
		int i;
		String nome;
		float peso, alt;
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0;i<5;i++) {
			System.out.println("Digite seu nome");
			nome = sc.nextLine();
			
			System.out.println("Digite seu peso");
			peso = sc.nextFloat();
			
			System.out.println("Digite seu altura");
			alt = sc.nextFloat();
			
			IMC(nome,peso,alt);
			
			nome = sc.nextLine();
			
		}
		

	}
	
	 public static void IMC(String nm,float ps, float al) {
		 
		 float aux;
		 aux = ps/(al*al);
		 
		 System.out.println("Nome = " + nm);
		 System.out.println("IMC = " + aux);
		 
		 if(aux<20)
			 System.out.println("Pessoa não obesa");
		 if(aux>=20 && aux <25)
			 System.out.println("Pessoa obesa moderada");
		 if(aux>=25)
			 System.out.println("Pessoa obesa com risco");
	 }

}