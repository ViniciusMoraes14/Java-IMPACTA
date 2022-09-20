package Lista_EX;
import java.util.*;

//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. 
//Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade,meses,dia_mes,op;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Quantos meses? ");
		meses = sc.nextInt();
		System.out.print("Quantos dias? ");
		dia_mes = sc.nextInt();
		op = (idade * 365) + (meses*30)+ dia_mes;
		
		System.out.println(idade + " anos," + meses + " meses e " +  dia_mes + " dias" + " = " + op + " dias");
	}

}
