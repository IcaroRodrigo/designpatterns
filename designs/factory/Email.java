package designs.factory;

public class Email implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a mensagem: " + mensagem);
    }
}
