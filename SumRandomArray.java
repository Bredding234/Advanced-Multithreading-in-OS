/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_threading;

import java.util.Random;

/**
 *
 * @author Brian
 */
public class SumRandomArray implements Runnable{
     Random r = new Random();
     private int[] values = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,15000,200000,250000,350000};
   public int SumRandomArray(){
    int sum=0;
    for(int i=0; i < values.length; i++)
    {
      int randomint = r.nextInt(values.length);
      //System.out.print(" ," + randomint);
      sum = sum + values[randomint] ;
    }

        System.out.println("Sum of the Random Numbers: " + sum);
        return sum;
   }
  

    @Override
    public void run() {
       
            System.out.println(Thread.currentThread().getName() + " [RECEIVED]Task of Computing the array of large random numbers. ");
            respondToMessage();
           System.out.println(Thread.currentThread().getName() + " (DONE) Task (DONE) Calculation Random numbers = " + SumRandomArray());
            
            
            
            
            }

    private void respondToMessage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        try{ Thread.sleep(3000);
                
               }catch(InterruptedException e){
            System.out.println("Unable to process message");
                        
         }   
                
    
    }
    
}
