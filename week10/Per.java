package week10;

public class Per {
    private String firstname ; 
    private String lastname ;
    public Per(){

    }
    public Per(String firstname , String lastname){
        setName(firstname, lastname);
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setName(String firstname , String lastname){
        this.firstname = firstname ;
        this.lastname = lastname ;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}
