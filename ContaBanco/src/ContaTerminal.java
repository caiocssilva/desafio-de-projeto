import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Digite o número da agência: ");
        int agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o número da conta: ");
        String numero = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
