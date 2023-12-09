import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor inserir Numero da conta: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Valor inserido invalido!");
            scanner.next();
        }
        numConta = scanner.nextInt();

        System.out.println("Por favor inserir Agencia: ");
        while (!scanner.hasNext()) {
            System.out.println("Valor inserido invalido!");
            scanner.next();
        }
        agencia = scanner.next();

        System.out.println("Por favor insira seu Nome: ");
        while (!scanner.hasNext()) {
            System.out.println("Valor inserido invalido!");
            scanner.next();
        }
        nomeCliente = scanner.next();

        System.out.println("Por favor insira o saldo: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor inserido invalido!");
            scanner.next(); 
        }
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta "+ numConta +" e seu saldo "+saldo+ " já está disponível para saque.");
        
        scanner.close();
    }
}
