public class ExemplosForArrays {
    //for em arrays
    /*
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        System.out.println(alunos.length);
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
    */ 
    //for each
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada --> for aluno in alunos, ou seja, para cada aluno em alunos faça...
        for(String aluno : alunos) {
          System.out.println(aluno);
        }
    
    }
}
