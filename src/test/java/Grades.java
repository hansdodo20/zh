import java.util.ArrayList;

public class Grades {
    ArrayList<String> sub = new ArrayList<>();
    String subject = "";
    int grade;


    Grades(){
    }

    public void addSubject(String subject){

        this.subject = subject;
        sub.add(subject);


    }

    public ArrayList<String> getGrades(){
        return sub;
    }

    public void dropSubject(String subject){
        sub.remove(subject);
    }


}
