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

        


        int []a={3,5,1,2,4, 13, 7, 10, 22, 6, 55};
        

        //increments: Note I added extra increments to account for larger size files
        int []increments1 = {-1, 1, 4, 13, 40, 121, 364, 1093, 3280, 9841};
        int []increments2 = {-1, 1, 5, 17, 53, 149, 373, 1123, 3371, 10114 };
        int []increments3 = {-1, 1, 10, 30, 60, 120, 360, 1080, 3240, 9720};
        int []increments4 = {-1, 1, 2, 4, 16, 256, 512, 1024, 2048, 4096, 8192};//custom increments
        for (int count = 0; count < 5; count++)
        {
            int []b = Arrays.copyOf(a, a.length);
            System.out.println("Original, Unsorted, array");
            for(int i=0;i<b.length;i++)
            {
                System.out.print(b[i] + " ");
            }
            System.out.println();
            switch (count)
            {
                case 0: 
                    System.out.println("Shell Sort " + count);
                    ShellSortIterative.shellSort(b, increments1);
                    for(int i=0;i<b.length;i++)
                    {
                        System.out.print(b[i] + " ");
                    }
                    break;
                case 1:
                    System.out.println("Shell Sort " + count);
                    ShellSortIterative.shellSort(b, increments2);
                    for(int i=0;i<b.length;i++)
                    {
                        System.out.print(b[i] + " ");
                    }
                    break;
                case 2:
                    System.out.println("Shell Sort " + count);
                    ShellSortIterative.shellSort(b, increments3);
                    for(int i=0;i<b.length;i++)
                    {
                        System.out.print(b[i] + " ");
                    }
                    break;
                case 3:
                    System.out.println("Shell Sort " + count);
                    ShellSortIterative.shellSort(b, increments4);
                    for(int i=0;i<b.length;i++)
                    {
                        System.out.print(b[i] + " ");
                    }
                    break;
                case 4:
                    HeapSortIterative.heapSort(b);
                    System.out.println("Heap Sort");
                    for(int i=0;i<b.length;i++)
                    {
                        System.out.print(b[i] + " ");
                    }
                    break;
            }
            System.out.println();
                    


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

