import designs.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        instance.setNome("Icaro");

        Singleton instance2 = Singleton.getInstance();
        instance2.setNome("Oliveira");

        System.out.println(instance.getNome());
        System.out.println(instance2.getNome());


    }
}