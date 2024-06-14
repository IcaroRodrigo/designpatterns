import designs.factory.Notificacao;
import designs.factory.NotificacaoFactory;
import designs.singleton.Singleton;
import designs.strategy.BigTrail;
import designs.strategy.Catalogo;
import designs.strategy.Street;
import designs.strategy.Trail;

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
        /*NotificacaoFactory notificacaoFactory = new NotificacaoFactory();

        Notificacao email = notificacaoFactory.criarNotificacao("Email");
        email.enviar("Ola, como vai ?");

        Notificacao sms = notificacaoFactory.criarNotificacao("SMS");
        sms.enviar("SMS - OFERTA RELAMPAGO");*/

        //TESTE PADRÁO STRATEGY
        String categoria = "BigTrail";
        String disponivel = "indisponivel";
        Catalogo catalogo = new Catalogo(categoria,disponivel);
        catalogo.exibirCatalogo(new Street());


    }
}