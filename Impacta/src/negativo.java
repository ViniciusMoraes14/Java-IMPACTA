public class negativo {

	public static void main(String[] args) {
		
		int i,aux=0;
		for(i=0;i>=-20;i--) {
			if((i%2)==0)
				aux = aux + i;
				System.out.println(i);
			
		}
			System.out.println("Soma" + aux);
	}

}
