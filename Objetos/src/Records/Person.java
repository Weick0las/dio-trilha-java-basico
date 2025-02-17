package Records;

public record Person(String name, int age) {
    
    //construtor secundário
    public Person(String name){
        this(name, 1);
    }
}
