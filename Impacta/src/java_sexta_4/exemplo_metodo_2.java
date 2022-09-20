package java_sexta_4;

public class exemplo_metodo_2 {

	public static void main(String[] args) {
			int aa=45,bb=78;
			cal(34,89);
			cal(22,7);
			cal(100,56);
			cal(10,2);
			cal(aa,bb);

		}
		
		
		public static void cal(int xx,int yy) {
			
			System.out.println("Soma = " + (xx+yy));
			System.out.println("Sub = " + (xx-yy));
			System.out.println("Mult = " + (xx*yy));
			System.out.println("Div = " + (xx/yy));

	}

}
