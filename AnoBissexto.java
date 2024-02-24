/* Aula 22-02-2024
Aluno: Davi Brito
Disciplina: Orientação a Objetos 
*/
import java.util.*;

public class AnoBissexto{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa verifica se um ano é bissexto");
		print("Ano: ");
		int ano = teclado.nextInt();
		
		String resultado =  " é bissexto!";
		if (ano%4 != 0 || (ano%100 == 0 && ano%400 != 0)){
			resultado = " Não é bissexto";
		}
		println(ano + resultado);
	}
	public static void println(String str) {
		System.out.println(str);
	}
	public static void print(String str) {
		System.out.println(str);
	}
}