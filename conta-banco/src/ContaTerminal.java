import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora, digite sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por fim, digite seu saldo atual:");
        float saldo = scanner.nextFloat();

        System.out.println(
            "\nOla "+ nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+
            ", conta "+numeroConta+" e seu saldo "+saldo+
            " ja esta disponivel para saque"
        );

        scanner.close();
    }
}
