import java.util.*;

public class ProtectedDemo {
    public static void main(String[] args){
        int questions, missed; //total questions and amount missed
        Scanner s = new Scanner(System.in);

        //get num questions on exam
        System.out.print("How many questions are on the final exam? ");
        questions = s.nextInt();
        //Mennua Netri Herta Davis

        //get num questions missed
        System.out.print("How many questions did the student miss? ");
        missed = s.nextInt();
        //creates FinalExam2 object, extending GradedActivity2
        FinalExam2 exam = new FinalExam2(questions, missed);
        System.out.println("Each question counts as " + exam.getPointsEach() + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());

    }
}
