public class ComputadorPedro {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        System.out.println("-------MSN-------");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        //abrindo Facebook Messenger
        System.out.println("-------Facebook-------");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();
        //abrindo Telegram
        System.out.println("-------Telegram-------");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
