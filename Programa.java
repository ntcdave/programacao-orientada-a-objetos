public class Programa{
    public static void main(String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        conta1.numeroAgencia = "123";
        conta1.numeroConta = "1234";
        conta1.nomeTitular = "Jonas";
        conta1.saldo = 10;

        
        conta2.numeroAgencia = "122";
        conta2.numeroConta = "12345";
        conta2.nomeTitular = "Carol";
        conta2.saldo = 1000;

        // Mostrando na tela o relatório das contas     
        
        conta2.sacar(50);

        System.out.println("Após transferência: \n");
        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
    }

}