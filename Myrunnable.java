/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_threading;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brian
 */
public abstract class Myrunnable {
  

    /**
     * @param args the command line arguments
     */
             static Random ran = new Random();
                    private static int[] numArray1 = {};
                    private static int[] numArray2 = new int[5];
                    private static long timeout = 10;

    public static void main(String[] args) throws InterruptedException {
        // The thread pools implementation
     final ExecutorService Service = Executors.newFixedThreadPool(2);
       
    
          System.out.println("The total sum of Large Arrays.");
          //The try block executes the runnable tasks in sumArray, then it awaitTermination so the task can finish successfully
          try{
          Runnable worker = new SumArray();
     
          Service.execute(worker);

       //Thread.sleep((long) (Math.random()*1000));
       Service.awaitTermination(timeout, TimeUnit.SECONDS);
       
          }catch(Exception ex) {
                System.out.println(ex);
           }         
          Thread.sleep((long) (Math.random()*1000)); 
          System.out.println("The sum of Random Arrays.");
          //The try block executes the second runnable tasks of summing random elements in the array, then it awaitTermination so the task can finish successfully
         try{
        Runnable worker2 = new SumRandomArray();
         Service.execute(worker2);
         Service.awaitTermination(timeout, TimeUnit.SECONDS);
         }catch(Exception ex) {
                System.out.println(ex);
        } 
         Thread.sleep((long) (Math.random()*1000));
          System.out.println("The sum of Even Arrays.");
       //The try block executes the third runnable tasks of return even number as the sum, then it awaitTermination so the task can finish successfully
        try{
         Runnable worker3 = new SumEvenArray();
         Service.execute(worker3);
         Service.awaitTermination(timeout, TimeUnit.SECONDS);
         }catch(Exception ex) {
                System.out.println(ex);
        }
          Thread.sleep((long) (Math.random()*1000));
        System.out.println("The sum of Odd Arrays.");
  //The try block executes the last runnable tasks to return the odd number as the sum, then it awaitTermination so the task can finish successfully                             
               try{
         Runnable worker4 = new SumOddArray();
         Service.execute(worker4);
         Service.awaitTermination(timeout, TimeUnit.SECONDS);
         
         }catch(Exception ex) {
                System.out.println(ex);
        }   
      //Message indicating that all tasks have been finished successfully.
        System.out.println("All Tasks are finished successfully.");
        Service.shutdown();

    }
        
//        public static void SumOfArrays(){
//        final ExecutorService executorService = Executors.newFixedThreadPool(2);
//        final CountDownLatch count = new CountDownLatch(2);
//       
//           //boolean winner = false;     
//           
//            try {  
//           
//                  
//                         
//
//                    executorService.execute(new Runnable(){
//                            public void run(){
//                                      int sum = 0;
//
//                    
//                           for(int i=0; i<numArray1.length; i++){
//                               sum = sum + numArray1[i];
//                    } System.out.println("Sum of the elements of the array: "+sum);
//                            }
//                    });
//                    executorService.shutdown();
////                        Runnable worker = new MyTask("Employee "  + " Served: "+ " Customers");
////                       executorService.execute();
////                         Thread.sleep((long) (Math.random()*1000));
////                        Runnable worker2 = new MyTask("Employee "    +  " Served: " + " Customers");  
////                         executorService.execute(worker2);
////                         Thread.sleep((long) (Math.random()*1000));
////                        Runnable worker3 = new MyTask("Employee "   +  " Served: " + " Customers");  
////                            executorService.execute(worker3);
////                         Thread.sleep((long) (Math.random()*10000));
////                         
////                         Runnable worker4 = new MyTask("Employee "    +  " Served: " + " Customers");  
////                            executorService.execute(worker4);
////                         Thread.sleep((long) (Math.random()*10000));
////                         
////                         Runnable worker5 = new MyTask("Employee " +  " Served: " + " Customers");  
////                            executorService.execute(worker5);
//                         //Thread.sleep((long) (Math.random()*10000));
//                         
//                       
//                        //Thread.sleep((long) (Math.random()*10000));
//                      //Thread.sleep((long) (Math.random()*10000));
////                if(runningPercentage != runningPercentage2){
////                    //executorService.execute(worker2);     
////                    System.out.println("Athlete 1 is losing to Athlete 2");
////                       //worker2 = new MyTask("Track Athlete " + number2 + " running is losing to Athlete 2: " + runningPercentage);              
////                }
//                        //Thread.sleep((long) (Math.random()*10000));
////                          System.out.println("End of the game");
////                 // Turn off the thread pool
////        executorService.shutdown();
//             }
//                 
//                        //if(executorS)
//                        //System.out.println("Track Athlete" + number+" is running");
//                    
//               catch (Exception ex) {
//                System.out.println(ex);
//                    } 
//        //count.await();
//                                         //Thread.sleep(100);
//
////                 System.out.println("End of the game");
////                 // Turn off the thread pool
//     executorService.shutdown();
//     while(!executorService.isTerminated()){}
//                            System.out.println("Employees have submitted all of their tasks.");
//
//                        
//                }
//        
                 
                        //if(executorS)
                        //System.out.println("Track Athlete" + number+" is running");
                    
              
        //count.await();
                                         //Thread.sleep(100);

//                 System.out.println("End of the game");
//                 // Turn off the thread pool
                              
                        
                } 
                        
           
        
        


       
        
        
        
        /*
        ExecutorService executorService = Executors.newFixedThreadPool(2); // recycle threads
        
        Runnable processor = new MyTask("Employee #1 ");
        executorService.execute(processor);
        
Runnable processor2 = new MyTask("Employee #2 "
        + "");
        executorService.execute(processor2);
        
        Runnable processor3 = new MyTask("Employee #3 ");
        executorService.execute(processor3);
        
         Runnable processor4 = new MyTask("Employee #4 ");
        executorService.execute(processor4);
        
                       executorService.shutdown(); // rejects any new tasks from being submitted and it shutsdown the service!// rejects any new tasks from being submitted and it shutsdown the service!
        try{
              executorService.awaitTermination(20, TimeUnit.SECONDS);
           } catch(InterruptedException e){
               e.printStackTrace();
           }                                System.out.println("Submitted All tasks... ");

//executorService.shutdown(); // rejects any new tasks from being submitted and it shutsdown the service!

        while(!executorService.isTerminated()){
        
        
        }
        
        //executorService.submit(task1);
        //executorService.submit(task2);
        
        //executorService.shutdown();
    }
    */

