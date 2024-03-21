public class Programa{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Davi Brito", "123-786-234-76", "(68) 981052465");
        Cliente cliente2 = new Cliente("Caroline Pontes", "222-222-222-22", "(68)99999999");
        Conta conta1 = new Conta("123", "1234", cliente1);
        Conta conta2 = new Conta("122", "1232", cliente2);
       

        // Mostrando na tela o relatório das contas           

        System.out.println(conta1.getRelatorio());
        System.out.println(conta2.getRelatorio());
    }

}