class Conta {
    public String agencia;
    public String numero;
    public Cliente cliente;

    public Conta(String agencia, String numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getRelatorio() {
        return "\nNúmero da Agência: " + this.agencia + "\nNúmero da Conta: " + this.numero +
                "\nCliente Associado: " + this.cliente.getNome() + "\nCPF do Cliente: " +
                this.cliente.getCpf() + "\nTelefone do Cliente: " + this.cliente.getTelefone();
    }
}
