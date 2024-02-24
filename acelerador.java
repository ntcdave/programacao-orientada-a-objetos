import java.util.*;
public class acelerador {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
		int D = ler.nextInt() - 3;
		int aux = D%8;
		if (aux == 3){
			System.out.println("Sensor1 ativado");
		} else if(aux == 4){
			System.out.println("Sensor2 ativado");
		} else{
			System.out.println("Sensor3 ativado");
		}
	}
}