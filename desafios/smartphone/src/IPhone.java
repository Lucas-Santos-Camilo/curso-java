package desafios.smartphone.src;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.selecionarMusica("Night Terror");
        iphone.ligar("123456789");
        iphone.exibirPagina("https://google.com");
    }

    // Métodos do ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos do NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
