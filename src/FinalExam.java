
public class FinalExam extends GradedActivity{
    private int nmQuestions, nmMissed; // total questions and amount missed
    private double pointsEach; // points for each question

    public FinalExam(int questions, int missed){ // parameters are # questions on exam and # student missed
        double numericScore;
        nmQuestions = questions;
        nmMissed = missed;

        pointsEach = (100.0/questions); //calc points per question
        numericScore = 100.0 - (missed * pointsEach); //calc score using points each

        setScore(numericScore); //uses parent class method, setScore() to set score to numericScore

    }
            //Mennua Netri Herta Davis
    public double getPointsEach() { //returns points per question
        return pointsEach;
    }

    public int getMissed() { //returns questions missed
        return nmMissed;
    }
}
