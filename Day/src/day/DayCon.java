package day;

import javax.swing.JOptionPane;

public class DayCon {

int index;
static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

public DayCon(String currentDay) {
    for(int i = 0; i < days.length; i++) {
        if(currentDay.equalsIgnoreCase(days[i])){
            index = i;
            return;
        }
    }
    System.out.println("Days is invalid");
}

public void printDay() {
    JOptionPane.showMessageDialog(null, "Today is: " + days[index] , "Days FTW", JOptionPane.INFORMATION_MESSAGE);
}

public String returnDay(){
    return days[index]; 
}

public String returnNextDay() {
    return days[(index + 1 )% days.length];
}

public String returnPreviousDay() {
if (days.length <= 1)
    return days[index + 6];

else return days[(index + 6)%days.length];  
}

public String whatDayIs(int i) {
     return days[(index + i)%days.length];
  }
}