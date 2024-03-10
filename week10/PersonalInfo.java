package week10;

public class PersonalInfo {
    private Per name ;
    private Date bDay ;
    private int personID;

    public PersonalInfo(){
        
    }

    public PersonalInfo(String first , String last , int month , int day , int year , int ID){
        this.name = new Per();
        this.bDay = new Date();
        this.personID = ID ;
    }

    public void setPersonalInfo(String first,  String last , int month , int day , int year , int ID){
        name.setName(first, last);
        bDay.setDate(month, day, year);
        personID=ID ;
    }

    public String toString(){
        return ("Name: " + name.toString() + "\n" + "Data of birth: " + bDay.toString() + "\n" + "Personal ID" + personID);
    }
}
