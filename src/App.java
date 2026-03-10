public class App {
    public static void main(String[] args) throws Exception {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
