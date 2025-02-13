import java.util.Random;
public class ExemploDovWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando()); //while tocando = true, continua executando o DO
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1; //valor entre 1 e 3, se for 1 - ele atendeu
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu; //se ele atendeu - retorna false, pois nega o valor 1 = true e, portanto, o telefone não está mais tocando
	}
}