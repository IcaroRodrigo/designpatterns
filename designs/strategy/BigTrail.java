package designs.strategy;

public class BigTrail implements Motos{
    @Override
    public void categoriaDaMoto(Disponivel catalogo) {
        System.out.println("Disponibilidade: " + catalogo.getDisponivel());
        System.out.println("Modelo1: F750GS");
        System.out.println("Modelo2: Tiger 900 rally pro");
    }
}
