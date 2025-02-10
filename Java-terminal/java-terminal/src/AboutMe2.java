import java.util.Locale; //convenção da entrada de dados
import java.util.Scanner;

public class AboutMe2 {
        public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = null; //uso do try com finale pra evitar leak scanner
        try {
            //rest of the code
            scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
        
            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
        
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

        
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        }

        finally {
            if(scanner!=null)
            scanner.close();
        }
    }
}