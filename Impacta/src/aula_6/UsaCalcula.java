package aula_6;

import java.util.*;

public class UsaCalcula {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calcula ob1 = new Calcula();
        
        System.out.println("Digite valor");
        ob1.setA(sc.nextInt());
        
        System.out.println("Digite valor");
        ob1.setB(sc.nextInt());
        
        
        System.out.println(ob1.cal(ob1.getA(), ob1.getB()));

	}

}