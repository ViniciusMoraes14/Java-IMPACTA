package aula_6;

public class Calculadora {
	
	private int a,b,op;
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}
	
	
	public void calcular(int x, int y, int z) {
		
		if(z==1) {
			System.out.println("Soma = " + (x+y));
		}
		
		if(z==2) {
			System.out.println("Sub = " + (x-y));
		}
		
		if(z==3) {
			System.out.println("Mult = " + (x*y));
		}
		
		if(z==4) {
			System.out.println("Div = " + (x/y));
		}
	}

}

