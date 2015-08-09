/**
* This is the Lab4 driver class. 
* <p> </p>
* 
* @author Brandon Tarney
* @version 1.0  8/8/15
*/ 

import java.util.*;

public class Lab4 
{

//
//    static RuntimeMetric metrics;

    
   /**
    * 
    */
   public static void main(String [] args)
    {
        //initial declarations

		//testing Sorting functionality
		int []a1={3,5,1,2,4};
		  	HeapSortIterative.heapSort(a1);
		  	for(int i=0;i<a1.length;i++)
			{
		  		System.out.print(a1[i] + " ");
			}

		System.out.println();

		int []a2={3,5,1,2,4, 13, 7, 55};
		  	ShellSortIterative.shell(a2);
		  	for(int i=0;i<a2.length;i++)
			{
		  		System.out.print(a2[i] + " ");
			}



//
//        //Main Driving Algorithm
//        if (args.length != 2)               //Error Handling for < or > 2 file arguments
//        {
//            errorMsg = "There should be an input file followed by an output file, "
//                + "you gave me something else. Please try again.";
//            System.out.println(errorMsg); 
//        } else                              //good input arguments
//        {
//            try                             //cautiously initialize File I/O
//            {
//                File_IO fileIO = new File_IO(args[0], args[1]);              
//                           
//			}//end try
//            catch (Exception e)//this exception should be generated for the fileIO input
//            {
//                System.out.println(e);
//                System.out.println("There was an input or output file parameter issue");  
//            }//end catch
//        }//end if/else
//        
//        //runtime metrics
//        end = System.nanoTime();                    
//        totalRuntime = new RuntimeMetric(end - start);
//        
//        //report program status
//        System.out.println("\nThe program has completed, please check your output file for the results");
//        System.out.println("The Program took " + metrics.getRuntime() + " nano seconds");
    }//end of main method

}//end of lab2 class

