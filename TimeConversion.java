public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){
    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds 
    */
    public void showDecaseconds(int Seconds){ 
    // add your code here
    //int numSeconds = seconds / 10;
    //TimeConversion decaSecond = new TimeConversion();
    //I grabbed the numSecond from the method to get this working the stuff above is everything I tried before and didnt work
    int numSeconds = Seconds;
    System.out.println("a decasecond is 10 seconds so this equals " + numSeconds / 10.0 + " decaseconds"); 
    }
   


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    public void showJiffies(int seconds){
    // add your code here
   // jiffies = numSeconds / 0.01;
   //Double doubleSeconds = Double(numSeconds);
   //My past attempts at converting to double failed so I placed it on line 37
   
    int numSeconds = seconds;
    System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds. So this equals " + numSeconds / 0.01 + " jiffies");
    //will output definition and second to jiffies conversion
    }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    public void showNewYorkMinutes(int seconds){
    // add your code here
   // NewYorkMinutes = numSeconds / 0.05;
   //1/20th of a secind = 0.05
   int numSeconds = seconds;
   System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking.\nIt is 1/20th of 1 second. So this equals " + numSeconds / 0.05 + " New York minutes");
    //will output the NY definition and seconds to NY minute conversion
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    public void showNanoCenturies(int seconds){
    // add your code here
   // NanoCenturies = numSeconds / 3.156;
   int numSeconds = seconds;
   System.out.println("A nanocentury is a computing measurement coined from the expression -  'never to let the user wait \nmore than a few nanocenturies for a response.' It is 3.156 seconds. So this equals " + numSeconds / 3.156 + " nanocenturies");
   //outputs the nanocentury and the seconds to nano conversion
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    public void showScaramuccis(int seconds){
    // add your code here
    //Scaramuccis = numSeconds / 950400.0;
    //950400 equals 11 days in seconds
    int numSeconds = seconds;
    System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days. So this equals " + numSeconds / 950400.0 + " Scaramuccis");
    // Outputs the Scaramuccis definition and seconds to Scaramuccis conversion
    }


}//end class