package exercicioTema3Item1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        conta.criarConta(scanner);
        while (loop){
            System.out.println("Painel de controle");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("7 - Sair do sistema");
            
            int operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    conta.consultar("saldo");
                    break;

                case 2:
                    conta.consultar("cheque especial");
                    break;

                case 3:
                    conta.depositarDinheiro(scanner);
                    break;
                
                case 4:
                    System.out.println("Sacando dinheiro");
                    System.out.println("================");
                    //Scanner valorIn = new Scanner(System.in);
                    double dinheiroSacado = scanner.nextDouble();
                    conta.sacarDinheiro(dinheiroSacado);
                    
                    break;
                
                case 5: 
                    conta.pagarBoleto();
                    break;
                case 6:
                    conta.verificarCheque();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
        scanner.close();
    }

}
