import java.util.Scanner;

public class Main {
    static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns, resposta Correta! - Letra: " + this.correta);
                System.out.println("");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println("");
                return false;
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.print("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp) {
            if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
            System.out.println("");
            return false;
        }

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

    public static void main(String[] args) {
    System.out.println("UNIFAN - Centro Universitário Alfredo Nasser");
    System.out.println("Aluno: Gustavo Augusto Oliveira Vitor");
    System.out.println("Professor: Brenno Pimenta");
    System.out.println("Seja bem-vindo ao quiz de perguntas e respostas sobre Dark Souls 3!");
    System.out.println("Responda as 15 perguntas a seguir:");

        Questao[] questoes = new Questao[15];

        // Questão 1
        questoes[0] = new Questao();
        questoes[0].pergunta = "Qual é o nome do protagonista silencioso de Dark Souls 3?";
        questoes[0].opcaoA = "A) Guardião do Fogo";
        questoes[0].opcaoB = "B) Peregrino Solitário";
        questoes[0].opcaoC = "C) Ashen One";
        questoes[0].opcaoD = "D) Escolhido dos Mortos-Vivos";
        questoes[0].opcaoE = "E) Incendiário";
        questoes[0].correta = "C";

        // Questão 2
        questoes[1] = new Questao();
        questoes[1].pergunta = "Qual chefe é necessário derrotar para entrar na cidade de Irithyll do Vale Boreal?";
        questoes[1].opcaoA = "A) Dancer of the Boreal Valley";
        questoes[1].opcaoB = "B) Vordt of the Boreal Valley";
        questoes[1].opcaoC = "C) Pontífice Sulyvahn";
        questoes[1].opcaoD = "D) Aldrich, Devourer of Gods";
        questoes[1].opcaoE = "E) Yhorm the Giant";
        questoes[1].correta = "B";

        // Questão 3
        questoes[2] = new Questao();
        questoes[2].pergunta = "Qual é o nome do ferreiro que reforça suas armas em Dark Souls 3?";
        questoes[2].opcaoA = "A) Patches";
        questoes[2].opcaoB = "B) Gundyr";
        questoes[2].opcaoC = "C) Hawkeye";
        questoes[2].opcaoD = "D) Andre";
        questoes[2].opcaoE = "E) Siegmeyer";
        questoes[2].correta = "D";