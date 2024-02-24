import java.util.Scanner;

public class NumeroImpar {
	public static void main(String[] args){
	System.out.println("Este programa verifica se um número é par ou impar");
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Número: ");
	int num = teclado.nextInt();
	
	/*if (num % 2 == 0){
		System.out.println("O número é par");
		
	} 
	else {
		System.out.println("O número é impar");
	}*/
	System.out.println(num%2 == 0 ? "o numero é par" : "O numero é impar");
	}
	public static void println(String str) {
		System.out.println(str);
	}
}