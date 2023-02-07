package exercicios.exerc20_jogoPerguntasRespostas.application.entities;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Question {
    private String Question;
    private Map<Character,String> Answer;
    private Map<Character, String> Alternatives;
    private static final ArrayList<Question> sortedQuestions = new ArrayList<>();

    public Question(String question, String answer, ArrayList<String> alternatives) {
        Question = question;
        Alternatives = mapAlternatives(alternatives);
        Answer = mapAnswer(answer);
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    private Map<Character, String> mapAlternatives(ArrayList<String> alternatives){
        Collections.shuffle(alternatives);
        char[] letters = new char[] {'a','b','c','d','e'};
        Map<Character,String> mapAternatives = new HashMap<>();
        for(int i = 0; i < alternatives.size(); i++) {
            mapAternatives.put(letters[i],alternatives.get(i));
        }
        return mapAternatives;
    }

    private Map<Character, String> mapAnswer(String answer) {
        Map<Character, String> answerMap = new HashMap<Character,String>();
        this.Alternatives.forEach((key,value) -> {
            if(Objects.equals(value, answer)) {
                answerMap.put(key,value);            }
        });
        return answerMap;
    }

    public static ArrayList<Question> readQuestions(String jsonPath) {
        try {
            JsonReader jsonFileReader = new JsonReader(new FileReader(jsonPath));
            Gson gson = new Gson();
            LinkedTreeMap hMap = gson.fromJson(jsonFileReader,LinkedTreeMap.class);
            ArrayList<Integer> sortedNumbers = new ArrayList<>();
            ArrayList<Question> questions = new ArrayList<>();
            int key = 1;

            for(int i = 1; i <= hMap.size();i++) {
                Random ran = new Random();
                LinkedTreeMap questionMap;
                questionMap = (LinkedTreeMap) hMap.get(String.valueOf(i));
                Question question = new Question((String) questionMap.get("question"), (String) questionMap.get("answer"), (ArrayList<String>) questionMap.get("alternatives"));
                questions.add(question);
            }
            return questions;

        }catch (FileNotFoundException  e) {
            System.out.println("Arquivo inexitente/ Erro na leitura");
        }
        return null;
    }

    public boolean answerChecker(String answer) {
        return Answer.containsKey(answer.charAt(0)) || Answer.containsValue(answer);
    }
    public static Question questionSorter(ArrayList<Question> questions) {
        Random rand = new Random();
        boolean key = false;

        while(true) {
            int rNum = rand.nextInt(0,questions.size());
            if(!sortedQuestions.contains(questions.get(rNum))){
                sortedQuestions.add(questions.get(rNum));
                return questions.get(rNum);
            }
        }
    }

    public void questionPrinter() {
        System.out.printf("Pergunta: %s\n", this.Question);
        this.Alternatives.forEach((key,value) -> {
            System.out.println(key + ") " + value);
        });
        System.out.println();
    }
    @Override
    public String toString() {
        return "Question: " + this.Question + ", Answer: " + this.Answer + ", Alternatives: " + this.Alternatives + "\n";
    }
}
