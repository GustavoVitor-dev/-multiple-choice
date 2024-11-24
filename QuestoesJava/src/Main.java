public class Main {
    public static void main(String[] args) {
    System.out.println("UNIFAN - Centro Universitário Alfredo Nasser");
    System.out.println("Aluno: Gustavo Augusto Oliveira Vitor");
    System.out.println("Professor: Brenno Pimenta");
    System.out.println("Seja bem-vindo ao quiz de perguntas e respostas sobre Dark Souls 3!");
    System.out.println("Responda as 15 perguntas a seguir:");

        // Cria um array para armazenar 15 objetos de Questao
        Questao[] questoes = new Questao[15];

        // Bloco para inicializar cada questão com pergunta, opções e resposta correta
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

        // Questão 4
        questoes[3] = new Questao();
        questoes[3].pergunta = "Quem é o chefe final de Dark Souls 3?";
        questoes[3].opcaoA = "A) Soul of Cinder";
        questoes[3].opcaoB = "B) Nameless King";
        questoes[3].opcaoC = "C) Aldrich";
        questoes[3].opcaoD = "D) Lothric";
        questoes[3].opcaoE = "E) Yhorm";
        questoes[3].correta = "A";

        // Questão 5
        questoes[4] = new Questao();
        questoes[4].pergunta = "Qual é o local onde o jogador renasce após morrer?";
        questoes[4].opcaoA = "A) Santuário de Firelink";
        questoes[4].opcaoB = "B) Templo das Chamas";
        questoes[4].opcaoC = "C) Castelo de Lothric";
        questoes[4].opcaoD = "D) Lago de Cinzas";
        questoes[4].opcaoE = "E) Refúgio das Chamas";
        questoes[4].correta = "A";

        // Questão 6
        questoes[5] = new Questao();
        questoes[5].pergunta = "Qual é o nome do cavaleiro que ajuda o jogador durante a história?";
        questoes[5].opcaoA = "A) Siegward de Catarina";
        questoes[5].opcaoB = "B) Alva, Cavaleiro Errante";
        questoes[5].opcaoC = "C) Hawkwood";
        questoes[5].opcaoD = "D) Lothric";
        questoes[5].opcaoE = "E) Greirat";
        questoes[5].correta = "A";

        // Questão 7
        questoes[6] = new Questao();
        questoes[6].pergunta = "Qual é o nome do dragão encontrado no Pico dos Dragões Antigos?";
        questoes[6].opcaoA = "A) Darkeater Midir";
        questoes[6].opcaoB = "B) Sinh";
        questoes[6].opcaoC = "C) Kalameet";
        questoes[6].opcaoD = "D) Ancient Wyvern";
        questoes[6].opcaoE = "E) Oceiros";
        questoes[6].correta = "D";

        // Questão 8
        questoes[7] = new Questao();
        questoes[7].pergunta = "Quem é o chefe conhecido como o Devorador de Deuses?";
        questoes[7].opcaoA = "A) Aldrich";
        questoes[7].opcaoB = "B) Pontífice Sulyvahn";
        questoes[7].opcaoC = "C) Yhorm";
        questoes[7].opcaoD = "D) Dancer of the Boreal Valley";
        questoes[7].opcaoE = "E) Lothric";
        questoes[7].correta = "A";

        // Questão 9
        questoes[8] = new Questao();
        questoes[8].pergunta = "Qual é o título do personagem Yhorm?";
        questoes[8].opcaoA = "A) O Rei Sem Nome";
        questoes[8].opcaoB = "B) O Gigante";
        questoes[8].opcaoC = "C) O Devorador de Deuses";
        questoes[8].opcaoD = "D) O Ashen One";
        questoes[8].opcaoE = "E) O Caçador de Dragões";
        questoes[8].correta = "B";

        // Questão 10
        questoes[9] = new Questao();
        questoes[9].pergunta = "Quem é o mentor do Santuário de Firelink?";
        questoes[9].opcaoA = "A) O Rei Sem Nome";
        questoes[9].opcaoB = "B) A Fire Keeper";
        questoes[9].opcaoC = "C) Andre";
        questoes[9].opcaoD = "D) Hawkwood";
        questoes[9].opcaoE = "E) O Lorde das Cinzas";
        questoes[9].correta = "B";

        // Questão 11
        questoes[10] = new Questao();
        questoes[10].pergunta = "Quem é conhecido como o 'Rei Sem Nome'?";
        questoes[10].opcaoA = "A) O Gigante";
        questoes[10].opcaoB = "B) Lothric";
        questoes[10].opcaoC = "C) Nameless King";
        questoes[10].opcaoD = "D) Solaire";
        questoes[10].opcaoE = "E) Gwyndolin";
        questoes[10].correta = "C";

        // Questão 12
        questoes[11] = new Questao();
        questoes[11].pergunta = "Qual é o nome do mago louco encontrado na Biblioteca de Cristal?";
        questoes[11].opcaoA = "A) Aldia";
        questoes[11].opcaoB = "B) Seath the Scaleless";
        questoes[11].opcaoC = "C) Logan";
        questoes[11].opcaoD = "D) Orbeck";
        questoes[11].opcaoE = "E) Griggs";
        questoes[11].correta = "D";

        // Questão 13
        questoes[12] = new Questao();
        questoes[12].pergunta = "Quem fundou a Igreja Negra de Londor?";
        questoes[12].opcaoA = "A) Yuria";
        questoes[12].opcaoB = "B) Karla";
        questoes[12].opcaoC = "C) Irina";
        questoes[12].opcaoD = "D) Anri";
        questoes[12].opcaoE = "E) Eygon";
        questoes[12].correta = "A";

        // Questão 14
        questoes[13] = new Questao();
        questoes[13].pergunta = "Qual chefe é responsável pelo controle da Catedral das Profundezas?";
        questoes[13].opcaoA = "A) Pontífice Sulyvahn";
        questoes[13].opcaoB = "B) Os Gigantes";
        questoes[13].opcaoC = "C) Deacons of the Deep";
        questoes[13].opcaoD = "D) Vordt";
        questoes[13].opcaoE = "E) Aldrich";
        questoes[13].correta = "C";

        // Questão 15
        questoes[14] = new Questao();
        questoes[14].pergunta = "Qual local é conhecido como o Reino dos Dragões Antigos?";
        questoes[14].opcaoA = "A) Lothric";
        questoes[14].opcaoB = "B) Archdragon Peak";
        questoes[14].opcaoC = "C) Anor Londo";
        questoes[14].opcaoD = "D) Profaned Capital";
        questoes[14].opcaoE = "E) Irithyll";
        questoes[14].correta = "B";

        // Variável para contar o número de acertos
        int acertos = 0;
        // Loop para iterar por todas as questões
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Questão " + (i + 1) + ":"); // Exibe o número da questão
            questoes[i].escrevaQuestao(); // Exibe a pergunta e as opções
            String resposta = questoes[i].leiaResposta(); // Lê a resposta do usuário
            if (questoes[i].isCorreta(resposta)) { // Verifica se está correta
                acertos++; // Incrementa o contador de acertos se a resposta estiver correta
            }
        }

        // Resultado final
        // Calcula o número de erros e a porcentagem de acertos
        int erros = questoes.length - acertos;
        double porcentagem = ((double) acertos / questoes.length) * 100;

        // Exibe os resultados finais do quiz
        System.out.println("Fim do Quiz!");
        System.out.println("Você acertou " + acertos + " questões e errou " + erros + " questões.");
        System.out.println("Porcentagem de acertos: " + porcentagem + "%");
    }
}