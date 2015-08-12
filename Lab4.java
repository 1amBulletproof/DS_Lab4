/**
* This is the Lab4 driver class. 
* <p>Generally speaking it takes an input file and sorts it in ascending order while logging the time.
* The algorithm makes a copy of the original input array for each sort so that the original order is preserved</p>
* 
* @author Brandon Tarney
* @version 1.0  8/8/15
*/ 

import java.util.*;

public class Lab4 
{

   /**
    * Main Lab4 Driver Method
    */
   public static void main(String [] args)
    {

        RuntimeMetric totalMetrics = new RuntimeMetric(System.nanoTime());        

        //initial declarations
        String errorMsg;

        
        //Main Driving Algorithm
        if (args.length != 2)               //Error Handling for < or > 2 file arguments
        {
            errorMsg = "There should be an input file followed by an output file, "
                + "you gave me something else. Please try again.";
            System.out.println(errorMsg); 
        } 
        else  
        {
            try
            {
                FileIO file = new FileIO(args[0], args[1]);
                
                int size = file.getNumLines();
                int [] a = new int[size];
                int index = 0;
                //create the input array
                while (file.hasNextLine())
                {
                    a[index] = Integer.parseInt(file.getNextLine());
                    index++;
                }
                file.writeOutput("Original, Unsorted, array");
                if (a.length == 50)
                {
                    for(int i=0;i<a.length;i++)
                    {
                        file.writeOutput(a[i] + " ");
                    }                    
                }

                
                //Shell Sort increments: Note I added extra increments to accoun
                //"-1" is for stopping case
                int []increments1 = {-1, 1, 4, 13, 40, 121, 364, 1093, 3280, 9841};
                int []increments2 = {-1, 1, 5, 17, 53, 149, 373, 1123, 3371, 10114 };
                int []increments3 = {-1, 1, 10, 30, 60, 120, 360, 1080, 3240, 9720};
                int []increments4 = {-1, 1, 4, 16, 256, 512, 1024, 2048, 4096, 8192};//custom increments
                
                //5 sorts per file, Copy input array each time and sort it
                for (int count = 0; count < 5; count++)
                {
                    int []b = Arrays.copyOf(a, a.length);

                    file.writeOutput("");
                    switch (count)
                    {
                        case 0:
                            RuntimeMetric ss1 = new RuntimeMetric(System.nanoTime());
                            ShellSortIterative.shellSort(b, increments1);
                            ss1.setEndTime(System.nanoTime());
                            file.writeOutput("Shell Sort " + (count + 1)  + " Runtime: " + ss1.totalRuntime() + " nano seconds");
                            if (b.length == 50)
                            {
                                for(int i=0;i<b.length;i++)
                                {
                                    file.writeOutput(b[i] + " ");
                                }  
                            }

                            break;
                            
                        case 1:
                            RuntimeMetric ss2 = new RuntimeMetric(System.nanoTime());
                            ShellSortIterative.shellSort(b, increments2);
                            ss2.setEndTime(System.nanoTime());
                            file.writeOutput("Shell Sort " + (count + 1)  + " Runtime: " + ss2.totalRuntime() + " nano seconds");
                            if (b.length == 50)
                            {
                                for(int i=0;i<b.length;i++)
                                {
                                    file.writeOutput(b[i] + " ");
                                }  
                            }
                            break;
                            
                        case 2:
                            RuntimeMetric ss3 = new RuntimeMetric(System.nanoTime());
                            ShellSortIterative.shellSort(b, increments3);
                            ss3.setEndTime(System.nanoTime());
                            file.writeOutput("Shell Sort " + (count + 1) + " Runtime: " + ss3.totalRuntime() + " nano seconds");
                            if (b.length == 50)
                            {
                                for(int i=0;i<b.length;i++)
                                {
                                    file.writeOutput(b[i] + " ");
                                }  
                            }
                            break;
                            
                        case 3:
                            RuntimeMetric ss4 = new RuntimeMetric(System.nanoTime());
                            ShellSortIterative.shellSort(b, increments4);
                            ss4.setEndTime(System.nanoTime());
                            file.writeOutput("Shell Sort " + (count + 1)  + " Runtime: " + ss4.totalRuntime() + " nano seconds");
                            if (b.length == 50)
                            {
                                for(int i=0;i<b.length;i++)
                                {
                                    file.writeOutput(b[i] + " ");
                                }  
                            }
                            break;
                            
                        case 4:
                            RuntimeMetric hs1 = new RuntimeMetric(System.nanoTime());
                            HeapSortIterative.heapSort(b);
                            hs1.setEndTime(System.nanoTime());
                            file.writeOutput("Heap Sort Runtime: " + hs1.totalRuntime() + " nano seconds");
                            if (b.length == 50)
                            {
                                for(int i=0;i<b.length;i++)
                                {
                                    file.writeOutput(b[i] + " ");
                                }  
                            }
                            break;
                    }

                    file.writeOutput("");
                    file.writeOutput("");
                    

                
                }
                file.closeOutput();
                
            }
            catch (Exception e) //this exception should be generated for the fileIO input
            {
                System.out.println("There was an Error:");  
                System.out.println(e);

            }//end catch
        }

        //runtime metrics
        totalMetrics.setEndTime(System.nanoTime());                  

        
        //report program status
        System.out.println("\nThe program has completed, please check your output file for the results");
        System.out.println("The Program took " + totalMetrics.totalRuntime() + " nano seconds");
        
        
    }//end of main method

}//end of lab2 class

