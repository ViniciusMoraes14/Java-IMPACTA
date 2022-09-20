package Lista_EX;
import java.util.*;

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String senha = "1234",login;
		
		System.out.print("Digite a senha:");
		login = sc.next();
		
		if(login.equals(senha)){System.out.println("ACESSO PERMITIDO!");}
		
		else{System.out.println("ACESSO NEGADO!");}
	}

}
