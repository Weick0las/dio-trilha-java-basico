package exercicioTema3Item1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Conta {
    
    private double saldo;
    private double chequeEspecial;
    private double doppelChequeEspecial;
    
    private double getChequeEspecial() {
        return chequeEspecial;
    }
    private double getSaldo() {
        return saldo;
    }
    private double getDoppelChequeEspecial() {
        return doppelChequeEspecial;
    }
    private void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void criarConta(Scanner scanner){
        System.out.println("Você está criando sua conta");
        System.out.println("===========================");
        depositarDinheiro(scanner);
        if (saldo<=500){
            setChequeEspecial(50);
            doppelChequeEspecial = 50;
        }
        else if (saldo>50){
            setChequeEspecial(saldo*(1/2));
            doppelChequeEspecial = saldo*(1/2);
        }    
    }

    protected void consultar(String opcao){
        if (opcao.equals("saldo"))  {
            System.out.println(getSaldo());
        } 
        else if (opcao.equals("cheque especial")){
            System.out.println(getChequeEspecial());
        }
    }

    public void depositarDinheiro(Scanner scanner){
        System.out.println("Entre o valor que deseja depositar em sua conta: ");
        double dinheiroDepositado = scanner.nextDouble();
        setSaldo(saldo + dinheiroDepositado);
        System.out.println("Valor depositado: " + dinheiroDepositado);
        System.out.println("Saldo atual: " + getSaldo());
    }

    public double sacarDinheiro(double valor){
        double dinheiroSacado = valor;
        setSaldo(saldo - dinheiroSacado);
        System.out.println("Saldo atual: " + getSaldo());
        return getSaldo();
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
            setChequeEspecial(chequeEspecial - valorUsadoCheque);
            System.out.println("O cheque especial está sendo usado e sua taxa é " + taxa);
            System.out.println("Ainda possui " + getChequeEspecial() + " para gastar");
            System.out.println("Seu saldo com o valor descontado é " + (getSaldo()-taxa));
        }
        else if (totalSaldo>0){
            System.out.println("O cheque não precisou ser utilizado e o saldo atual é " + getSaldo());
        }
    }

    public void verificarCheque(){
        if (getChequeEspecial() != getChequeEspecial()){
            System.out.println("O cheque especial está sendo usado");
        }
        else if(getChequeEspecial() == getDoppelChequeEspecial()){
            System.out.println("O cheque especial não está sendo usado");
        }
    }
}
