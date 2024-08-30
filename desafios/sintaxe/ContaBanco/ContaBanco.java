import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        while (true) {
            System.out.println("Por favor, digite o número da Conta:");
            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (numero > 0) break;
                else System.out.println("Número da conta deve ser positivo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro válido.");
            }
        }

        while (true) {
            System.out.println("Por favor, digite a da Agência:");
            agencia = scanner.nextLine();
            if (!agencia.isEmpty()) break;
            else System.out.println("a agencia não pode ser nula");
        }

        while (true) {
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();
            if (!nomeCliente.isEmpty()) break;
            else System.out.println("Nome do cliente não pode ser vazio.");
        }

        while (true) {
            System.out.println("Por favor, digite o saldo:");
            try {
                saldo = Double.parseDouble(scanner.nextLine());
                if (saldo >= 0) break;
                else System.out.println("O saldo não pode ser negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico válido.");
            }
        }

        
        ContaTerminal contaTerminal = new ContaTerminal(numero,agencia,nomeCliente,saldo);
        contaTerminal.exibirMensagem();

        // Fechamento do scanner
        scanner.close();
    }
}
