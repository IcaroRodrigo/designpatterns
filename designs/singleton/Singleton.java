package designs.singleton;

public class Singleton {
    private static Singleton instance;
    private String nome = "";

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();

        return instance;
    }

    public void setNome(String nome){
        this.nome = this.nome + " " + nome;
    }

    public String getNome(){
        return this.nome;
    }
}
