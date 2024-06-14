package designs.strategy;

public class Street implements Motos{
    @Override
    public void categoriaDaMoto(Disponivel catalogo) {
        System.out.println("Disponibilidade: " + catalogo.getDisponivel());
        System.out.println("Modelo1: Fazer 250");
        System.out.println("Modelo1: Twister 300");
    }
}
