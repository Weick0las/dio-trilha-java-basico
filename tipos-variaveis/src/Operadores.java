public class Operadores {
    public static void main(String [] args){
        String concatenacao = "Linguagem " + "Java"; //concatenacao de strings
        System.out.println(concatenacao);
        String concatenacao1 = "?"; //?
        System.out.println(concatenacao1);
        concatenacao1 = 1+1+1+"1"; // 31, a partir do momento que detecta um caractere, deixa de realizar a soma para fazer concatenação
        System.out.println(concatenacao1);
        concatenacao1 = 1+"1"+1+1; // 1111
        System.out.println(concatenacao1);
        concatenacao = 1+"1"+1+"1"; //1111
        System.out.println(concatenacao1);
        concatenacao = "1" + (1+1+1); //13
        System.out.println(concatenacao1);
        
        //Operadores unários
        int numero = 5;
        numero++; // 6
        boolean verdade = true;
        System.out.println(+numero); // operador unário de valor positivo - não consegue converter números negativos em números positivos // 6
        
        
        System.out.println(numero++); // imprime primeiro, incrementa após impressão // 6
        System.out.println(numero); // imprime o valor aós o incremento // 7
        System.out.println(++numero); // operador unário de incremento de 1 unidade, incrementa o número e imprime. // 8


        System.out.println(-numero); // operador unário de valor negativo // -8, não consegue converter números negativos em números negativos, por isso o 7 na operação abaixo.
        System.out.println(--numero); // operador unário de decremento de 1 unidade, segue o mesmo princípio do op.unário de incremento // 7
        System.out.println(!verdade); // operador unário de negação de uma expressão booleana - não converte na negação, para converter é necessário usar artibuição// false

        //Operador Ternário
        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        //if(numero1 < numero2){
            //System.out.println("A nossa condição é verdadeira");
        //}
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        //Para strings
        String nomeUm = "Nickolas";
        String nomeDois = "Nickolas";
        System.out.println(nomeUm == nomeDois); //true
        nomeDois = new String("Nickolas");
        System.out.println(nomeUm == nomeDois); //false
        //Por isso, usa-se o método .equals()
        System.out.println(nomeUm.equals(nomeDois)); //true

        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");  
        } // caso "e"
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        } // caso "ou"
        
        System.out.println("fim");
    }
}
