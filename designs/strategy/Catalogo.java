package designs.strategy;

public class Catalogo implements Disponivel{
    public String categoria;
    public String disponivel;
    public Catalogo(String categoria, String disponivel){
        this.categoria = categoria;
        this.disponivel = disponivel;
    }
    public void exibirCatalogo(Motos motos){
        motos.categoriaDaMoto(this);
    }
    @Override
    public String getDisponivel() {
        return disponivel;
    }
}
