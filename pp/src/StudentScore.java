public class StudentScore {
    private String name;
    private double midtermScore ; 
    private double finalScore ; 
    // private double meanScore = (midtermScore + finalScore) * 0.5 ;


    public StudentScore(){
        
    }

    public StudentScore(String name , double midtermScore ,  double finalScore){
        this.name = name ; 
        this.midtermScore = midtermScore ;
        this.finalScore = finalScore ; 
    }

    public double getFinalScore() {
        return finalScore;
    }
    public double getMidtermScore() {
        return midtermScore;
    }
    public String getName(){
        return name ;
    }

    public double averageScore(){
        return (getMidtermScore() + getFinalScore()) * 0.5 ; 
    }

    public char grading(){
        if(averageScore() > 80){
            return 'A';
        }
        else if (averageScore() > 70){
            return 'B';
        }
        else if(averageScore() > 60){
            return 'C';
        }
        else if(averageScore() > 50){
            return 'D';
        }
        else{
            return 'F';
        }
    }

}
