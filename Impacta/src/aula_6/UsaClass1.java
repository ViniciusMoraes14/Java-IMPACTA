package aula_6;

public class UsaClass1 {

	public static void main(String[] args) {
		
		getandset p1 = new getandset();
		
		p1.setNome("Cesar");
		p1.setEnd(" av paulista 222");
		
		System.out.println("Nome = " + p1.getNome());
		System.out.println("End = " + p1.getEnd());
		

	}
  
}