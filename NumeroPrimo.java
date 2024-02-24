import java.util.*;

public class NumeroPrimo{
	public static void main (String[] args){
		System.out.println("este programa mostra se um determinado numero é primo");
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int num = ler.nextInt();
		String resultado = "Não é primo!";
		
		if(num > 1){
			int contador = 0;
			for (int i = 1; i <= num; i++){
				if(num % i == 0){
					contador++;
				}
			}
			if (contador == 2){
				resultado = " É primo"; 
			}
		}
		System.out.println(num + resultado);
	
	}	
}
