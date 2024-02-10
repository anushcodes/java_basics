package com.java.basicapplication;

class Account { 
    
    //private variable-balance 
  private int balance = 50;
  //public int balance = 50;  
      
    // accessor method (getter) 
  public int getBalance(){  
      return balance; 
  } 
    
    // Mutator method (setter) 
    public void setBalance(int a){  
        // return balance + a; 
      balance = a; 
  } 
} 



public class BasicApplication {

    // public int k;
    // public static void main(String args[]){
        
    //     BasicApplication basicApplication = new BasicApplication();
    //     System.out.println(basicApplication.k);

    //     //Decimal Representation =>  d = (some num)*2^(exp);  ^ -> power

    //     double val = 1.6;
    //     System.out.println(val*(double)Math.pow(2, -1)); // 1.01 * 2^(-3) = 0.12625. So 0.12565 can be decimal represented.

        /*
         *  a = 0.8;
         * 
         *  0.8 = (1.6)*2^(-1) So 0.8 can be stored
         * 
         *  0.7= (1.4)*2^(-1) So 0.7 can be stored
         * 
         *  0.1 can't be stored
         * 
         * 
         * 
         * 
         */

        // double a = 0.7; 
        // double b = 0.9; 
        // double x = a + 0.1; 
        // double y = b - 0.1; 
  
        // System.out.println("x = " + x);  //0.79999999999
        // System.out.println("y = " + y ); //0.8
        // System.out.println(x == y);

        // double c = 0.7; 
        // double d = 0.9; 
        // double e = c + 0.1; 
        // double f = d - 0.1; 
  
        // System.out.println("e = " + e); 
        // System.out.println("f = " + f ); 
        // System.out.println(e == f); 

        // double i = 1.0; 
        // double j = 0.10; 
        // double k = 9 * j; 
        // i = i - (k); 
  
        // // Value of a is expected as 0.1 
        // System.out.println("i = " + i);


        public static void main(String args[]){
            Account account = new Account();
            //account.balance = 100; 
            //System.out.println(account.balance);
            //wont be visible if it is private. It can be accessed only by instance methods to update/retrieve.

            //To Update it to 100 we can use a SETTER

            account.setBalance(100);

            // To retrieve the updated one, we can use a GETTER

            System.out.println(account.getBalance());

            //Getter and setter wont make any difference if the instance variable is visible

            //Changed the instance variable to public
            

            //Uncomment few comments to check differences
            //account.balance = 500;

            //System.out.println(account.balance);




        }








    }
