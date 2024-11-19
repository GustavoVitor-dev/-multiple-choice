import java.util.Scanner;

// Classe que representa uma questão do quiz
public class Questao {
    // Atributos para armazenar a pergunta, opções de resposta e a resposta correta
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    // Método para verificar se a resposta fornecida pelo usuário está correta
    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) { // Verifica se a resposta do usuário é igual à resposta correta
            System.out.println("Parabéns, resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true; // Retorna verdadeiro se estiver correta
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta); // Exibe a resposta correta
            System.out.println("");
            return false; // Retorna falso se estiver errada
        }
    }

    // Método para ler a resposta do usuário, garantindo que seja válida
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in); // Scanner para leitura de entrada do usuário
        String resp;
        do {
            System.out.print("Digite a resposta: "); // Solicita a resposta do usuário
            resp = ler.next(); // Lê a entrada do usuário
        } while (!respostaValida(resp)); // Repete enquanto a resposta não for válida
        return resp; // Retorna a resposta válida
    }

    // Método privado para validar se a resposta está dentro das opções permitidas
    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;  // Retorna verdadeiro se a resposta for A, B, C, D ou E (ignora maiúsculas/minúsculas)
        }
        // Mensagem de erro para respostas inválidas
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println("");
        return false; // Retorna falso se a resposta não for válida
    }

    // Método para exibir a pergunta e suas opções de resposta no console
    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}
