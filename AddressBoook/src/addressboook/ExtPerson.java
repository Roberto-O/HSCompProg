package addressboook;

public class ExtPerson {
    private Person name;
    private Date bDay;
    private Address home;
    private String personID;
    
    public ExtPerson(){
        name = new Person();
        bDay = new Date();
        home = new Address();
        personID = "";
    }
    
    public ExtPerson(String first, String last, int month, int day, int year, String address, String city, String state, int zip, String number, String ID){
        name = new Person(first, last);
        bDay = new Date (month, day, year);
        home = new Address(address, city, state, zip, number);
        personID = ID;
    }
    
    public String toString(){
        return ("Name: " + name.toString() + "\n"
                + "Date of birth: " + bDay.toString() + "\n"
                + "Address: " + home.toString() + "\n"
                + "Relationship with you: " + personID/*+ "\n"*/);
               // + "Phone Number: " + phone.toString());
    }
}
