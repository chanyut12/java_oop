package week10;

public class Date {
    private int dMonth ; 
    private int dDay ; 
    private int dYear ; 

    public Date(){
        dMonth = 1 ;
        dDay = 1 ;
        dYear = 1900 ; 
    }

    public Date(int month , int day , int year){
        dMonth = month ; 
        dDay = day ;
        dYear = year ;
    }
    public void setDate(int month , int day , int year){
        dDay = day ; 
        dMonth = month ; 
        dYear = year ;
    }

    public int getdMonth() {
        return dMonth;
    }

    public int getdDay() {
        return dDay;
    }

    public int getdYear() {
        return dYear;
    }
    public String toString(){
        return (dMonth + "-" + dDay + "-" + dYear);
    }    
}
