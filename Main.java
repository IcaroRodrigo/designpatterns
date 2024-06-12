import designs.factory.Notificacao;
import designs.factory.NotificacaoFactory;
import designs.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //TESTE PADRÃO SINGLETON
        /*
            Singleton instance = Singleton.getInstance();
            instance.setNome("Icaro");

            Singleton instance2 = Singleton.getInstance();
            instance2.setNome("Oliveira");

            System.out.println(instance.getNome());
            System.out.println(instance2.getNome());
        */


        //TESTE PADRÃO FACTORY
        NotificacaoFactory notificacaoFactory = new NotificacaoFactory();

        Notificacao email = notificacaoFactory.criarNotificacao("Email");
        email.enviar("Ola, como vai ?");

        Notificacao sms = notificacaoFactory.criarNotificacao("SMS");
        sms.enviar("SMS - OFERTA RELAMPAGO");

    }
}