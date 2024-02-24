import java.util.*;
public class acelerador2 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
		int D = ler.nextInt();
		int sensor = (D-5)%8;
		System.out.println(sensor);
	}
}