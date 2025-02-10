import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = null; //uso do try com finale pra evitar leak scanner
        try {
            //rest of the code
            scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Por favor, digite o número da agência!");
            int numeroAgencia = scanner.nextInt();
        
            System.out.println("Por favor, digite sua agência!");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu nome!");
            String nome = scanner.next();
            System.out.println("Por favor, digite seu sobrenome!");
            String sobrenome = scanner.next();
            String nomeCliente = nome + " " + sobrenome;

            System.out.println("Por favor, digite seu saldo!");
            double saldo = scanner.nextDouble();

        
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " + nomeCliente + "," + " " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," + " " + "conta " + numeroAgencia + " " + "e seu saldo " + saldo + " " + "já está disponível para saque");
        }

        finally {
            if(scanner!=null)
            scanner.close();
        }
    }
}

