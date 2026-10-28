
public class FinalExam2 extends GradedActivity2 {
    private int nmQuestions, nmMissed; // total questions and amount missed
    private double pointsEach; // points for each question

    public FinalExam2(int questions, int missed){ // parameters are # questions on exam and # student missed
        double numericScore;
        nmQuestions = questions;
        nmMissed = missed;

        pointsEach = (100.0/questions); //calc points per question
        numericScore = 100.0 - (missed * pointsEach); //calc score using points each

        setScore(numericScore); //uses parent class method, setScore() to set score to numericScore
        adjustScore();
    }
            //Mennua Netri Herta Davis
    public double getPointsEach() { //returns points per question
        return pointsEach;
    }

    public int getMissed() { //returns questions missed
        return nmMissed;
    }

    private void adjustScore(){ //adjusts numeric score to the closest greater whole number if fraction is >=0.5
        double fraction; //fractional part of a score

        fraction = score - (int) score; //calculates fraction of score
        if(fraction >= 0.5){ //rounds up score if fraction is >= 0.5
            score += (1.0 - fraction);
        }
    }
}
