package exercicioTema3Item1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Conta {
    
    private double saldo;
    private double chequeEspecial;
    private double doppelChequeEspecial;
    
    public void criarConta(){
        System.out.println("Você está criando sua conta");
        System.out.println("===========================");
        depositarDinheiro();
        if (saldo<=500){
            chequeEspecial = 50;
            doppelChequeEspecial = 50;
        }
        else if (saldo>50){
            chequeEspecial = saldo*(1/2);
            doppelChequeEspecial = saldo*(1/2);
        }
        
    }

    protected void consultar(String opcao){
        if (opcao.equals("saldo"))  {
            System.out.println(saldo);
        } 
        else if (opcao.equals("cheque especial")){
            System.out.println(chequeEspecial);
        }
    }

    public void depositarDinheiro(){
        System.out.println("Entre o valor que deseja depositar em sua conta: ");
        Scanner scanner = new Scanner(System.in);
        double dinheiroDepositado = scanner.nextDouble();
        saldo += dinheiroDepositado;
        System.out.println("Valor depositado: " + dinheiroDepositado);
        System.out.println("Saldo atual: " + saldo);
        scanner.close();
    }

    public double sacarDinheiro(double valor){
        double dinheiroSacado = valor;
        saldo -= dinheiroSacado;
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    public void pagarBoleto(){
        double min = 0;
        double max = saldo+chequeEspecial;
        double valorBoleto = ThreadLocalRandom.current().nextDouble(min, max);
        double novoSaldo = sacarDinheiro(valorBoleto);
        System.out.println("O valor do boleto é " + valorBoleto);
        usarCheque(novoSaldo);
    }

    private void usarCheque(double totalSaldo){
        if (totalSaldo<0){
            double valorUsadoCheque = Math.abs(totalSaldo);
            double taxa = valorUsadoCheque*(1/5);
            chequeEspecial -= valorUsadoCheque;
            System.out.println("O cheque especial está sendo usado e sua taxa é " + taxa);
            System.out.println("Ainda possui " + chequeEspecial + " para gastar");
            System.out.println("Seu saldo com o valor descontado é " + (saldo-taxa));
        }
        else if (totalSaldo>0){
            System.out.println("O cheque não precisou ser utilizado e o saldo atual é " + totalSaldo);
        }
    }

    public void verificarCheque(){
        if (chequeEspecial != doppelChequeEspecial){
            System.out.println("O cheque especial está sendo usado");
        }
        else if(chequeEspecial == doppelChequeEspecial){
            System.out.println("O cheque especial não está sendo usado");
        }
    }
}
