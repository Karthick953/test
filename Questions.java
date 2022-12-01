package quizapp;

public class Questions {
    String Question;
    String option1;
    String option2;
    String option3;


    public Questions(String question,String option1,String option2,String option3) {
        Question=question;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question=question;
    }

    public String getOPtion1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1=option1;
    }

    public String getOPtion2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2=option2;
    }

    public String getOPtion3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3=option3;
    }

    @Override
    public String toString() {
        return "Questions{"+
                "Question='" + Question + '\'' +
                ",option1='" + option1 + '\'' +
                ",option2='" + option2 + '\'' +
                ",option3='" + option3 + '\'' +
                '}';

    }
}
