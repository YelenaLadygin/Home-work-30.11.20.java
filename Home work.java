/*
change user name to Bill Gates before the print
change my_savings to start in 100000 instead of 0 -- what was the final amount this time?  
   Answer:
   Bill Gates 
   Bill Gates  has saving is 102500
*/

Targil:
        Scanner name = new Scanner(System.in );
        String my_name= name.nextLine();
        int my_savings = 0 ;
        my_savings += 1000;
        my_savings *= 2;
        my_savings += 3000;
        my_savings +=1;
        my_savings /=2;
        System.out.println(my_name +" " +"has saving is" +" "+ my_savings);
        
  /*      
    print in one line -- [my_name] has saving of [my_savings]
    what was the amount?
        Answer : 
        Yelena
        Yelena has saving is 2500
*/
