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
public class SumOddArray implements Runnable {
      private int[] a = {1111,3333,5555,7777,9999,11111,13333,15555, 17777, 19999,21111};
Scanner sc = new Scanner(System.in);
 //private int [] a = new int[100];
     public int SumOddArray(){
       //this.array = array;
         //System.out.print(" Please Enter Number of elements in an array : ");
		//Size = sc.nextInt();
       //System.out.print(" Please Enter " + Size + " elements of an Array  : ");
//		for (i = 0; i < Size; i++)
//		{
//			a[i] = sc.nextInt();
//		}   
 int i, OddSum = 0;

		for(i = 0; i < a.length; i++)
		{
			if(a[i] % 1 == 0)
			{
				OddSum = OddSum + a[i]; 
			}
		}		
		System.out.println("The Odd of Even Numbers in this Array = " + OddSum);
     
                 return OddSum;
   }
  

    @Override
    public void run() {
       
            System.out.println(Thread.currentThread().getName() + " [RECEIVED]Task of Computing the array of Odd large numbers. ") ;
            respondToMessage();
           System.out.println(Thread.currentThread().getName() + " (DONE) Calculation Odd numbers Done = "+ SumOddArray());
            
            
            }

    private void respondToMessage() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        try{ Thread.sleep(3000);
                
               }catch(InterruptedException e){
            System.out.println("Unable to process message" + a);
                        
         }   
                
    
    }
}
