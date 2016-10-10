package tests;

public class data {
     private String firstname;
     private String lastname;
     private int[] testscores;
     private double average;
     private char Grade;

    
    public data(){
        firstname="  "; lastname="  "; testscores=new int[5]; average=0; Grade='*';
      }

    public data(String first,String last,int []scores){
        firstname=first;
        lastname=last;

        for(int i=0; i<5; i++){ 
          testscores[i]= scores[i];}
          //Grade=Getgrade();
      }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
