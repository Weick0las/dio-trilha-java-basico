package exercicioTema3Item1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        conta.criarConta();
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
                    conta.depositarDinheiro();
                    break;
                
                case 4:
                    System.out.println("Sacando dinheiro");
                    System.out.println("================");
                    Scanner valorIn = new Scanner(System.in);
                    double dinheiroSacado = valorIn.nextDouble();
                    conta.sacarDinheiro(dinheiroSacado);
                    break;
                
                case 5: 
                    conta.pagarBoleto();
                case 6:
                    conta.verificarCheque();
                default:
                    break;
            }
            scanner.close();
        }
    }

}
