/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced_threading;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class SumEvenArray implements Runnable {
     private int[] a = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000,15000,200000,250000};
Scanner sc = new Scanner(System.in);
 //private int [] a = new int[100];
     public int SumEvenArray(){
       //this.array = array;
         //System.out.print(" Please Enter Number of elements in an array : ");
		//Size = sc.nextInt();
       //System.out.print(" Please Enter " + Size + " elements of an Array  : ");
//		for (i = 0; i < Size; i++)
//		{
//			a[i] = sc.nextInt();
//		}   
 int i, EvenSum = 0;

		for(i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}		
		System.out.println("The Sum of Even Numbers in this Array = " + EvenSum);
     
                 return EvenSum;
   }
     
  

    @Override
    public void run() {
       
            System.out.println(Thread.currentThread().getName() + " [RECEIVED]Task of Computing the array of even large numbers. ") ;
            respondToMessage();
           System.out.println(Thread.currentThread().getName() + " (DONE) Calculation of Even numbers Done = "+ SumEvenArray());
            
            
            }

    private void respondToMessage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        try{ Thread.sleep(3000);
                
               }catch(InterruptedException e){
            System.out.println("Unable to process message" + a);
                        
         }   
                
    
    }
}
