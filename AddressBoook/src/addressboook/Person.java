package addressboook;

public class Person{
    private String firstName; //store the first name
    private String lastName;  //store the last name

    public Person(){
        firstName = "";
        lastName = "";
    }

    public Person(String first, String last){
        setName(first, last);
    }

    public void setName(String first, String last){
        firstName = first;
        lastName = last;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public String toString(){
        return (firstName + " " + lastName);
    }
}
