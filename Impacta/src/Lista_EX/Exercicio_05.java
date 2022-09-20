package Lista_EX;
import java.util.*;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float SM = 788,SU,qtd_salario;
		
		System.out.print("Digite o valor do seu salário: ");
		SU = sc.nextFloat();
		
		qtd_salario = SU / SM;
		
		
		System.out.println("O Usuário recebe " + qtd_salario + " salários mínimos");
	}

}
