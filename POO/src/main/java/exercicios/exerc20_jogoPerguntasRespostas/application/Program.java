package exercicios.exerc20_jogoPerguntasRespostas.application;

import exercicios.exerc20_jogoPerguntasRespostas.application.entities.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String jsonPath = "res/questions.json";
        ArrayList<Question> questions = Question.readQuestions(jsonPath);
        assert (questions != null);
        int score = 0;
        System.out.println("-----Jogo de perguntas e respostas-----");
        for (int i = 0; i < questions.size(); i++) {

            Question question = Question.questionSorter(questions);

            System.out.printf("Questão #%d\n", i + 1);
            question.questionPrinter();
            System.out.println("Escolha uma alternativa!");
            String answer = sc.nextLine();
            if(question.answerChecker(answer)){
                System.out.print("Resposta Correta!\n");
                score++;
            }else{
                System.out.print("Resposta Incorreta!\n");
            }
        }
        System.out.println("Pontuação: " + score);
        sc.close();
    }
}
