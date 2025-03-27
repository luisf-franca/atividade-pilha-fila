import java.util.Stack;

class Navegador {
    private Stack<String> pilhaVoltar = new Stack<>();
    private Stack<String> pilhaAvancar = new Stack<>();
    private String paginaAtual;

    // Construtor: começa sem páginas abertas
    public Navegador() {
        this.paginaAtual = null;
    }

    // Acessa uma nova página
    public void acessarPagina(String url) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual); // Salva página atual na pilha de voltar
        }
        paginaAtual = url;
        pilhaAvancar.clear(); // Limpa a pilha de avançar
        exibirEstado();
    }

    // Volta para a página anterior
    public void voltar() {
        if (!pilhaVoltar.isEmpty()) {
            pilhaAvancar.push(paginaAtual); // Salva a página atual na pilha de avançar
            paginaAtual = pilhaVoltar.pop(); // Recupera a última página acessada
        }
        exibirEstado();
    }

    // Avança para a próxima página
    public void avancar() {
        if (!pilhaAvancar.isEmpty()) {
            pilhaVoltar.push(paginaAtual); // Salva a página atual na pilha de voltar
            paginaAtual = pilhaAvancar.pop(); // Recupera a página da pilha de avançar
        }
        exibirEstado();
    }

    // Exibe o estado atual do navegador
    private void exibirEstado() {
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Pilha Voltar: " + pilhaVoltar);
        System.out.println("Pilha Avançar: " + pilhaAvancar);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.acessarPagina("google.com");
        navegador.acessarPagina("mozilla.org");
        navegador.acessarPagina("github.com");
        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
    }
}