/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_threading;

/**
 *
 * @author Brian
 */
public class SumArray implements Runnable {
    private int[] array = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,15000,200000,250000};
   public int MyTask(){
       //this.array = array;
       int sum = 0;

                    
                           for(int i=0; i<array.length; i++){
                               sum = sum + array[i];
                    } System.out.println("Sum of the elements of the large array: "+sum);
                        return sum;
   }
  

    @Override
    public void run() {
       
            System.out.println(Thread.currentThread().getName() + " [RECEIVED]Task of Computing the array of large numbers. ") ;
            respondToMessage();
           System.out.println(Thread.currentThread().getName() + " (DONE) Calculation array of large numbers = "+ MyTask());
            
            
            
            
            }

    private void respondToMessage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        try{ Thread.sleep(3000);
                
               }catch(InterruptedException e){
            System.out.println("Unable to process message" + array);
                        
         }   
                
    
    }
    
}

    
    

