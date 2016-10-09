package addressboook;

public class Address {
    String address1;
    String city1;
    String state1;
    int zip1;
    String number1;
   
    Address(){
        address1 = "";
        city1 = "";
        state1 = "";
        zip1 = 00000;
        number1 = "";
    }

    Address(String address, String city, String state, int zip, String number){
        address1 = address;
        city1 = city;
        state1 = state;
        zip1 = zip;
        number1 = number;
   }
    
    public void setAddress(String address, String city, String state, int zip, String number){
        address1 = address;
        city1 = city;
        state1 = state;
        zip1 = zip;
        number1 = number;
    }
    
    public String getAddress(){
        return address1;
    }
    
    public String getCity(){
        return city1;
    }
    
    public String getState(){
        return state1;
    }
    
    public int getZip(){
        return zip1;
    }
    
    public String getNumber(){
        return number1;
    }
    
    public String toString(){
        return (address1 + "\n" 
                + "City: " + city1 + "\n"
                + "State: " + state1 + "\n" 
                + "Zip: " + zip1 + "\n" 
                + "Phone Number: " + "("+number1.substring(0,3)+")"+number1.substring(3,6)+"-"+number1.substring(6,10));
    }
}
