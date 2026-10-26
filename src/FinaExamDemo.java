import java.util.*;

public class FinaExamDemo {
    public static void main(String[] args){
        int questions, missed; //# of questions and # missed by student
        Scanner s = new Scanner(System.in);
        //get num questions on exam
        System.out.print("How many questions are on the final exam? ");
        questions = s.nextInt();
                //Mennua Netri Herta Davis

        //get num questions missed
        System.out.print("How many questions did the student miss? ");
        missed = s.nextInt();
        //creates FinalExam object, extending GradedActivity
        FinalExam exam = new FinalExam(questions, missed);
        System.out.println("Each question counts as " + exam.getPointsEach() + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());
    }
}
