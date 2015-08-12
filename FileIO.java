/**
 * Provides data structure and methods for String File input & output
 * @author Brandon Tarney
 * @version 2.0 8/10/15
 */
import java.io.*;
import java.util.*;

public class FileIO {
    

    private File inputFile;
    private File outputFile;
    private Scanner inputScanner;
    private PrintWriter printer;
    
    
    /**
     * Constructor method for File_IO class
     * <p> Opens two files (1 for input, 1 for output)</p>
     * 
     * @param file_in   name of input file to open
     * @param file_out  name of output file to open
     * @throws FileNotFoundException
     */
    public FileIO(String file_in, String file_out) throws FileNotFoundException
    {
        inputFile = new File(file_in);
        outputFile = new File(file_out);   
       
        inputScanner = new Scanner(inputFile);
        printer = new PrintWriter(outputFile);

    }
    
    /**
     * Tests for next line
     * @return boolean true if there is a next line
     */
    public boolean hasNextLine()
    {
        return inputScanner.hasNextLine();
    }

    /**
     * Returns the next input value as a double in the input file
     * 
     * @return  next line 
     */
    public String getNextLine()
    {
        String temp;
        if (hasNextLine())
        {
            temp = inputScanner.nextLine();
            return temp;
        } else {return null;}           
    }
    
    /**
     * calculates number of lines in the file
     * 
     * @return number of lines
     * @throws FileNotFoundException
     */
    public int getNumLines() throws FileNotFoundException
    {
        Scanner tempScanner = new Scanner(inputFile);
        int counter = 0;
        while (tempScanner.hasNextLine())
        {
            counter++;
            tempScanner.nextLine();
        }
        return counter;
    }
    
    
    /**
     * Writes a line to the output file
     * 
     * @param output    what to write to the output file (a string value)
     */
    public void writeOutput(String output)
    {
        printer.println(output);
    }
    
    /**
     * Closes the output file
     */
    public void closeOutput()
    {
        printer.close();
        inputScanner.close();
        
    }
    
    
}// end class File_IO
