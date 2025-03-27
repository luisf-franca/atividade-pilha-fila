import java.util.LinkedList;
import java.util.Queue;

class Hospital {
    private Queue<String> filaPacientes = new LinkedList<>();
    private int contadorSenhas = 1;

    // Gera uma nova senha para o paciente
    public void gerarSenha(String nome) {
        String senha = "P" + contadorSenhas + " - " + nome;
        filaPacientes.add(senha);
        contadorSenhas++;
        System.out.println("Senha gerada: " + senha);
    }

    // Chama o próximo paciente
    public void chamarProximo() {
        if (!filaPacientes.isEmpty()) {
            String chamado = filaPacientes.poll(); // Remove da fila
            System.out.println("Chamando: " + chamado);
        } else {
            System.out.println("Nenhum paciente na fila.");
        }
    }

    // Exibe a fila atual
    public void exibirFila() {
        System.out.println("Fila de espera: " + filaPacientes);
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.gerarSenha("Luís");
        hospital.gerarSenha("Fabrício");
        hospital.gerarSenha("Jardel");
        hospital.exibirFila();
        hospital.chamarProximo();
        hospital.chamarProximo();
        hospital.exibirFila();
    }
}