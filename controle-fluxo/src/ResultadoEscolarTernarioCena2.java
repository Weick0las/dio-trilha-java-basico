public class ResultadoEscolarTernarioCena2 {
    public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        //se a nota não for >= 7, verifica se é >=5 e <7, se for verdade imprime recuperação, se não for verdade imprime reprovado.
		System.out.println(resultado);
	}
}
