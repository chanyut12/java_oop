package week9;
public class Person {
    private String firstname ;
    private String lastname ; 
    Person(){

    }
    Person(String firstname , String lastname){
        this.firstname = firstname ; 
        this.lastname = lastname ; 
    }
    public String toString(){
        return "";
    } 
    public void setName(String firstname , String lastname){
        this.firstname = firstname ; 
        this.lastname = lastname ; 
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

}
