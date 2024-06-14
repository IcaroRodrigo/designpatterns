package designs.strategy;

public class Trail implements Motos{
    @Override
    public void categoriaDaMoto(Disponivel catalogo) {
        System.out.println("Disponibilidade: " + catalogo.getDisponivel());
        System.out.println("Modelo1: Lander 250");
        System.out.println("Modelo1: Saara 300");
    }
}
