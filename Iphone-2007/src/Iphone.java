public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String numero;
    private String url;
    private String musica;

    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada de " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        this.url = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página: " + url);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música: " + musica);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Selecionando música: " + musica);
    }
 
    
}
