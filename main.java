package quizapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Quiz q=new Quiz();
        q.logic();

    }

}
class Quiz{
    Scanner sc=new Scanner(System.in);

    public void logic() {
        Questions q1=new Questions("Who invented java programming?","A.james gosling","B.Dennis Ritchie","Bjarne Stroustrup");
        Questions q2=new Questions("Which component is used compile,debug and execute the java programs","A.JRE","B.JDK","C.JVM");
        Questions q3=new Questions("Which enviroment variable is used to set the java path?","A.JavaPATH","JAVA","JAVA_HOME");

        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'A');
        hmap.put(q2,'B');
        hmap.put(q3,'C');

        for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOPtion1());
            System.out.println(map.getKey().getOPtion2());
            System.out.println(map.getKey().getOPtion3());

            System.out.println("Enter your answer:");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if(cans==0) {
                System.out.println("Correct");
            }
            else {
                System.out.println("Wrong");
            }
        }
    }
}
