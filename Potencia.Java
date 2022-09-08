/*
CASTILLO PADRÓN STEFANY JOANA
CICLOS DE CONTROL: FOR, WHILE, DO-WHILE
POTENCIAS Y FACTORIAL DE UN NÚMERO EN JAVA
22/03/2021
*/
import java.util.Scanner;
class C_Control{
    public static void main(String[] args){
        int i=1;
    	int n=1;
        char opc;
        int numero=0;
        int base=0;
	    int exponente=0;
	    
        Scanner sc = new Scanner(System.in);
	    System.out.println("Bienvenido(a), en este programa tenemos la opcion de calcular:");
	    System.out.println("A) Factorial de un numero"+"	B)Numeros elevados a una potencia");
	    System.out.println("Favor de teclear la letra de la opción elegida: ");
	    opc=sc.next().charAt(0);
	    if(opc == 'A'||opc == 'a' || opc== 'B' || opc == 'b')
        {
		    if(opc=='A'||opc=='a')
		    {
			System.out.println("++ Usted ha elegido EL FACTORIAL DE UN NUMERO ++");
			System.out.println("Favor de teclear el numero elegido: ");
			numero=sc.nextInt();
			for_factorial(n,numero);
			while_factorial(n,numero);
			doWhile_factorial(n,numero);
		    }
		    else if(opc=='B'||opc=='b')
		    {
			System.out.println("++ Usted ha elegido NUMEROS ELEVADOS A UNA POTENCIA ++");
			System.out.println("Dame el valor de la base: ");
            base=sc.nextInt();
			System.out.println("Dame el valor de su respectivo exponente: ");
			exponente=sc.nextInt();
			for_potencia(i,exponente,base);
			while_potencia(i,exponente,base);
			doWhile_potencia(i,exponente,base);
		    }
	    }
	    else
	    {
		    System.out.println("	Lo sentimos pero la opcion tecleada es incorrecta");
	    }
    }

     static void for_factorial(int n,int numero){
        System.out.println("CICLO FOR");
        int factorial=1;
	    for(n = n;n<=numero;n++)
	    {
		System.out.println(n + " * ");
		factorial=factorial*n;
	    }
	    System.out.println(" = " + numero + " ! = " + factorial);  
    }
    static void for_potencia(int i,int exponente,int base){
	    System.out.println("CICLO FOR");
        int multiplicacion=1;
	    for(i = i;i<=exponente;i++)
	    {
		System.out.println(base+" * ");
		multiplicacion=multiplicacion*base;    
        }
        System.out.println(" = "+base+" ^ "+exponente+" = "+multiplicacion); 
    }
	static void while_factorial(int n,int numero){
		System.out.println("CICLO WHILE");
		int factorial=1;
		while(n<=numero)
		{
		System.out.println(n+" * ");
        factorial=factorial*n;
        n++;
    	}
		System.out.println(" = "+numero+" ! = "+factorial);
	}
	static void while_potencia(int i,int exponente,int base){
		System.out.println("CICLO WHILE");
		int multiplicacion=1;
		while(i<=exponente)
		{
		System.out.println(base+" * ");
        multiplicacion=multiplicacion*base;
        i++;
    	}System.out.println(" = "+base+" ^ "+exponente+" = "+multiplicacion);
	}
	static void doWhile_factorial(int n,int numero){
		System.out.println("CICLO DO-WHILE");
		int factorial=1;
		do{
		System.out.println(n+" * ");
		factorial=factorial*n;   	
		n=n+1;
    	}while(n<=numero);
    	System.out.println(" = "+numero+" ! = "+factorial);
	}
	static void doWhile_potencia(int i,int exponente,int base){
		System.out.println("CICLO DO-WHILE");
		int multiplicacion=1;
		do{
		System.out.println(base+" * ");
		multiplicacion=multiplicacion*base;   	
		i=i+1;
    	}while(i<=exponente);
    	System.out.println(" = "+base+" ^ "+exponente+" = "+multiplicacion);
	}
}
