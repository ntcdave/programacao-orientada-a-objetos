import java.util.*;
public class Programa {
    private static Map<String, Cliente> clientes = new HashMap<>();
    private static Map<String, Conta> contas = new HashMap<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        byte opcao;
        do {
            System.out.println(getMenu());
            System.out.println("Escolha uma opção: ");
            opcao = Byte.parseByte(teclado.nextLine());
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarConta();
                    break;
                case 3:
                    relatorioConta();
                    break;
                case 4:
                    relatorioClientes();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }

    public static String getMenu() {
        return "\n1. Cadastrar Cliente\n2. Cadastrar Conta\n3. Relatório de Conta\n4. Listar Clientes\n5. Sair\n";
    }

    public static void cadastrarCliente() {
        System.out.println("Digite o nome do cliente:");
        String nome = teclado.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = teclado.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = teclado.nextLine();
        Cliente cliente = new Cliente(nome, cpf, telefone);
        clientes.put(cpf, cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void cadastrarConta() {
        System.out.println("Digite o número da agência:");
        String agencia = teclado.nextLine();
        System.out.println("Digite o número da conta:");
        String numero = teclado.nextLine();
        System.out.println("Digite o CPF do cliente associado a esta conta:");
        String cpfCliente = teclado.nextLine();
        if (!clientes.containsKey(cpfCliente)) {
            System.out.println("Cliente não encontrado!");
            return;
        }
        Cliente cliente = clientes.get(cpfCliente);
        Conta conta = new Conta(agencia, numero, cliente);
        contas.put(numero, conta);
        System.out.println("Conta cadastrada com sucesso!");
    }

    public static void relatorioConta() {
        System.out.println("Digite o número da conta:");
        String numero = teclado.nextLine();
        if (!contas.containsKey(numero)) {
            System.out.println("Conta não encontrada!");
            return;
        }
        Conta conta = contas.get(numero);
        System.out.println(conta.getRelatorio());
    }

    public static void relatorioClientes() {
        System.out.println("Clientes Cadastrados:");
        for (Cliente cliente : clientes.values()) {
            System.out.println(cliente.getRelatorio());
            System.out.println("------------------------");
        }
    }
}
