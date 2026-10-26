import java.util.*;

public class GradeDemo {
    public static void main(String[] args){
        double testScore; //holds test score
        Scanner s = new Scanner(System.in);
        GradedActivity grade = new GradedActivity(); //creates a GradedActivity object

        System.out.print("Enter a numeric test score: ");
        testScore = s.nextDouble();
                //Mennua Netri Herta Davis

        grade.setScore(testScore); //sets the score of GradedActivity object, grade
        System.out.println("The grade for that test is " + grade.getGrade());
    }
}
