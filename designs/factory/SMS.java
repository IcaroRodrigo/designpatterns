package designs.factory;

public class SMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a mensagem: " + mensagem);
    }
}
