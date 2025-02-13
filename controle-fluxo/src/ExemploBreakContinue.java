public class ExemploBreakContinue {
    // break
    /* 
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero); 
            
            //iteração = 0; número = 1
            //iteração = 1; número = 2
            //para a iteração
                
        }
        }
    */
    // continue
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
            //iteração = 0; número = 1
            //iteração = 1; número = 2
            //para a iteração
            //iteração = 3; número = 4
            //iteração = 4; número = 5
        }   
        }
}
