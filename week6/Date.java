package week6;
public class Date {
    private int day;
    private int month;    
    private int year;
    
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2013) {
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(){
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date(int day, int month, int year) {

        this.year = (year >=1900 && year<=2013) ? year : 1900 ; 
        this.month = (month >=1 && month <=12 ) ? month : 1 ;
        int maxDays = MaxDaysInMonth(month, year);
        this.day = (day >=1 && day <=maxDays) ? day : 1 ;
        // if (day >= 1 && day <= 31) {
        //     this.day = day;
        // } else {
        //     this.day = 1;
        // }

        // if (month >= 1 && month <= 12) {
        //     this.month = month;
        // } else {
        //     this.month = 1;
        // }

        // if (year >= 1900 && year <= 2013) {
        //     this.year = year;
        // } else {
        //     this.year = 1900;
        // }
    }

    private int MaxDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28; 
            case 4: case 6: case 9: case 11: 
                return 30;
            default: 
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }



    public static void main(String[] args) {
        Date date = new Date(7,4,2004);
        // int day_date = date.getDay();
        // int month_date = date.getMonth();
        // int year_date = date.getYear();
        System.out.printf("The Initial date is: %d/%d/%d%n" , date.getDay() , date.getMonth() , date.getYear());
        date.setDay(11);
        date.setMonth(1);
        date.setYear(2003);
        System.out.printf("Date with new values is: %d/%d/%d" ,  date.getDay() , date.getMonth() , date.getYear());
        }
}
