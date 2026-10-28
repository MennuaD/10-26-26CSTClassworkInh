
public class GradedActivity2 {
    protected double score; //holds activity score

    public void setScore(double score){ //changes the score
        this.score = score;
    }

    public double getScore() { //returns the score
        return score;
    }
    //Mennua Netri Herta Davis

    public char getGrade(){  //returns a letter grade using the score
        char lettrGrd;

        if(score >= 90){
            lettrGrd = 'A';
        }else if(score >= 80){
            lettrGrd = 'B';
        }else if(score >= 70){
            lettrGrd = 'C';
        }else if(score >= 60){
            lettrGrd = 'D';
        }else{
            lettrGrd = 'F';
        }
        return lettrGrd;
    }
}
