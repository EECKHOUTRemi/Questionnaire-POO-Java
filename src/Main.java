import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    List questions = new ArrayList();
    int score = 0;

    public Main(List questions, int score) {
     this.questions = questions;
     this.score = score;
    }

    public int questionAlea(){
        Random rand = new Random();
        return rand.nextInt(questions.size());
    }

    public void printQuestion(int id){
        Question question = (Question) questions.get(id);
        System.out.println(question.enonce);
        System.out.println("1) " + question.reponses.get(0) + "2) " + question.reponses.get(1) + "3) " + question.reponses.get(2));
    }

    Question q1 = new Question(0, "Quel est la couleur du cheval blanc d'Henri IV ?", , 0,)
}