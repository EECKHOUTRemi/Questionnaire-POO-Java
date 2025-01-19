import java.util.ArrayList;
import java.util.List;

public class Question {

    int id;
    String enonce;
    List reponses = new ArrayList();
    int bonneRep;

    public Question(int id, String enonce, List reponses, int bonneRep) {
        this.id = id;
        this.enonce = enonce;
        this.reponses = reponses;
        this.bonneRep = bonneRep;
    }


}
