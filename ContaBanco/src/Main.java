import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ContaTerminal conta = new ContaTerminal();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        conta.setNumero(scan.nextInt());
        System.out.println("Digite a agencia: ");
        conta.setAgencia(scan.next());
        System.out.println("Digite seu nome: ");
        conta.setNomeCliente(scan.next());
        System.out.println("Digite seu saldo: ");
        conta.setSaldo(scan.nextDouble());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                conta.getNomeCliente(),conta.getAgencia(),conta.getNumero(),conta.getSaldo());
    }
}