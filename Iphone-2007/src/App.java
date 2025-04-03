public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica("Minha Música Favorita");
        iphone.tocar();
        iphone.pausar();
    }
}
