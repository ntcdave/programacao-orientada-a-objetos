import java.util.*;

public class TesteWhile{
	public static void main (String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Este programa ler números inteiros até enconttrar um valor negativo ou 0");
		
		int num, soma = 0;
		
		do {
			System.out.println("Número: ");
			num = ler.nextInt();
			soma += num > 0 ? num :0;
			// soma += num;
		}while (num > 0);
		System.out.println("Soma: "+ soma);
		//System.out.println("Soma: "+ (soma - num));
	}
}