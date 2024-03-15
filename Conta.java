public class Conta{
    public String numeroAgencia;
    public String numeroConta;
    public String nomeTitular;
    public double saldo;
    public double limite;


    // métodos da classe conta
    public boolean transferir(double valor, Conta destino){
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor * 1.005){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean investir(double valor, String Tipo){
        if(this.sacar(valor)) return true;
        return false;
    }

    public String getRelatorio(){
        String s = "\nAgencia: " + this.numeroAgencia;
        s+= "\nConta: "+this.numeroConta;
        s+= "\nTitular: "+this.nomeTitular;
        s+= "\nSaldo: "+this.saldo + "\n";
        return s;
    }
}