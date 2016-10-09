package addressboook;
import java.util.*;
import javax.swing.*;

public class AddressBoook {
static Scanner console = new Scanner(System.in);
public static int tester;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> lastNa = new ArrayList<>();
        ArrayList<String> testBD = new ArrayList<>();
        String fName, lName, address, city, state, id, number;
        int month, day, year, zip;
        int count = 0;
        int ln = 1;
        int bm = 2;
        String a, b, f, g, h, j, k;
        int c, d, e, i;
        

        
        int reply = JOptionPane.showConfirmDialog(null, "                                  Welcome!" 
                + "\n" + "Would you like to add a name to your address book?", "Online Address Book", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                while(reply != JOptionPane.NO_OPTION){
                    fName = JOptionPane.showInputDialog(null, "Enter the persons first name: "); //0
                    list.add(fName);
        
                    lName = JOptionPane.showInputDialog(null, "Enter the persons last name: "); //1
                    list.add(lName);
        
                    String bmonth = JOptionPane.showInputDialog(null, "Enter persons birth-month: " +"(00-00-0000)"); //2
                    list.add(bmonth);
                    month = Integer.parseInt(bmonth);
        
                    String bday = JOptionPane.showInputDialog(null, "Enter persons birth-day: " + "("+bmonth+"-00-0000)");//3
                    list.add(bday);
                    day = Integer.parseInt(bday);
        
                    String byear = JOptionPane.showInputDialog(null, "Enter persons birth-year: "+ "("+bmonth+"-"+bday+"-0000)");//4
                    list.add(byear);
                    year = Integer.parseInt(byear);
        
                    address = JOptionPane.showInputDialog(null, "Enter persons address: ");//5
                    list.add(address);
        
                    city = JOptionPane.showInputDialog(null, "Enter persons city: ");//6
                    list.add(city);
        
                    state = JOptionPane.showInputDialog(null, "Enter persons state: (XX)");//7
                    list.add(state);
        
                    String zipcode = JOptionPane.showInputDialog(null, "Enter persons zip code: (00000)");//8
                    list.add(zipcode);
                    zip = Integer.parseInt(zipcode);
        
                    number = JOptionPane.showInputDialog(null, "Enter persons phone number: ");//9
                    list.add(number);
        
                    id = JOptionPane.showInputDialog(null, "Enter persons association with you: ");//10
                    list.add(id);
        
                    ExtPerson per = new ExtPerson(fName, lName, month, day, year, address, city, state, zip, number, id);  
                    //System.out.println(per.toString());
                    //System.out.println();
                    count++;
                    reply = JOptionPane.showConfirmDialog(null, "Would you like to add another name?", "Online Address Book", JOptionPane.YES_NO_OPTION);
                }
            }else{
                System.out.println("Thank You");
                System.out.println("Now Exiting...");
            }
            //System.out.println(count);
            int one = JOptionPane.showConfirmDialog(null, "Would you like to see your current Address Book?", 
                    "Online Address Book", JOptionPane.YES_NO_OPTION);
            if (one == JOptionPane.YES_OPTION) {
                for(int x = 0; x < count; x++){
                    lastNa.add(list.get(ln));
                    ln = ln+=11;
                 }//prints last names
                System.out.println("Contacts: ");
                    Collections.sort(lastNa);
                    for(String counter: lastNa){
                        int index2 = list.indexOf(counter);
                        index2 = index2-1;
                        System.out.println(counter + "," + list.get(index2));
		}//prints contacts ln,fr
            }else{
                System.out.println("Thank You");
                System.out.println("Now Exiting...");
            }
            System.out.println("----------------------------");
            System.out.println();
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            int two = JOptionPane.showConfirmDialog(null, "Would you like to search someone up?", 
                    "Online Address Book", JOptionPane.YES_NO_OPTION);
            //System.out.println("---------------------------------------");
            if (two == JOptionPane.YES_OPTION) {
                while(two != JOptionPane.NO_OPTION){
                String pName = JOptionPane.showInputDialog(null, "Search by Last Name: ");
                int index = list.indexOf(pName); // last name
                
                a = list.get(index-1); 
                b = list.get(index);
                c = Integer.parseInt(list.get(index+1));
                d = Integer.parseInt(list.get(index+2));
                e = Integer.parseInt(list.get(index+3));
                f = list.get(index+4);
                g = list.get(index+5);
                h = list.get(index+6);
                i = Integer.parseInt(list.get(index+7));
                j = list.get(index+8);
                k = list.get(index+9);
                
                ExtPerson pers = new ExtPerson(a, b, c, d, e, f, g, h, i, j, k);  
                System.out.println(pers.toString());
                System.out.println();
                
                two = JOptionPane.showConfirmDialog(null, "Would you like to search someone up?", 
                    "Online Address Book", JOptionPane.YES_NO_OPTION);
            }//end while
        }//ends if
            
           /* int three = JOptionPane.showConfirmDialog(null, "would you like to find names by b-day?", 
                    "Online Address Book", JOptionPane.YES_NO_OPTION);
            if(three == JOptionPane.YES_OPTION){
                while(three != JOptionPane.NO_OPTION){
                    String bm1 = JOptionPane.showInputDialog(null, "Search birthdays between months: ");
                    int birth1 = Integer.parseInt(bm1);
                    String bm2 = JOptionPane.showInputDialog(null, "and: ");
                    int birth2 = Integer.parseInt(bm2);
                    
                    for(int y = 0; y < count; y++){
                    testBD.add(list.get(bm));
                    bm = bm+=11;
                }//gets bmonth
                    Collections.sort(testBD);
                    for(String counter: testBD){
                        System.out.println(counter);
                        tester = Integer.parseInt(counter);
                        if(birth1 == tester || birth2 == tester ){
                        System.out.println("same");                       
                    }else{
                            System.out.println("no");
                    }      
		}
                    three = JOptionPane.showConfirmDialog(null, "would you like to find names by b-day?", 
                        "Online Address Book", JOptionPane.YES_NO_OPTION);
            }//end while loop
        }//end if yes
            else{
                
               System.out.println("doesn't work");
            } */
    }//end main
}//end class


