import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner!
        // Exibir as mensagens para o nosso usuário!
        // Obter pelo Scanner os valores digitados no terminal!
        // Exibir a mensagem conta criada!

        Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +" e seu " +
                "saldo " + saldo + " já está disponível para saque"
        );

    }
}