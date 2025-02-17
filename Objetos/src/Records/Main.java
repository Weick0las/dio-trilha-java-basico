package Records;

public class Main {
    public static void main(String[] args) {
        var person = new Person("Nickolas", 19);
        System.out.println(person);
        //observe a diferença de impressão pela chamada direta em comparação com classes normais
        System.out.println(person.name());

    }
}
