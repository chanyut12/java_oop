package week6;
public class Student {
    private String name ; 
    private String surname ; 
    private int score1;
    private int score2;
    private int score3;
    private double ave ;
    
    public Student(String name ,String surname , int score1 , int score2 , int score3){
        this.name = name;
        this.surname = surname;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void Setname(String name){
        this.name = name ;
    }
    public void Setsurname(String surname){
        this.surname = surname;
    }
    public void Setscore1(int score1){
        this.score1 = score1;
    }
    public void Setscore2(int score2){
     this.score2 = score2 ;
    } 
    public void Setscore3(int score3){
        this.score3 = score3 ;
    }

    public String getname(){
        return name;
    }
    public String getsurname(){
        return surname ;
    }
    public int getscore1(){
        return score1;
    }
    public int getscore2(){
        return score2;
    }
    public int getscore3(){
        return score3;
    }

    public double getAverage(){
        ave = (score1 + score2 + score3) / 3 ;
        return ave ;
    }



}
