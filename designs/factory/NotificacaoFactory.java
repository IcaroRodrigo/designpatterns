package designs.factory;

public class NotificacaoFactory {

    public Notificacao criarNotificacao(String tipoNotificacao){
        if (tipoNotificacao == null || tipoNotificacao.isEmpty())
            return null;

        if(tipoNotificacao.equalsIgnoreCase("Email"))
            return new Email();
        else if(tipoNotificacao.equalsIgnoreCase("SMS"))
            return new SMS();

        return null;
    }
}
