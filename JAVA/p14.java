import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p14 
{
    public static void main(String[] args) 
	{
        if (args.length == 3) 
		{
            String sourceFile = args[0];
            String destinationFile = args[1];
            String mode = args[2].toLowerCase();

            try 
			{
                if (mode.equals("binary")) 
				{
                    copyBinaryFile(sourceFile, destinationFile);
                    System.out.println("Binary file copied successfully.");
                } 
				else if (mode.equals("text")) 
				{
                    copyTextFile(sourceFile, destinationFile);
                    System.out.println("Text file copied successfully.");
                } 
				else 
				{
                    System.out.println("Invalid mode. Please use 'binary' or 'text'.");
                }
            } 
			catch (Exception e) 
			{
                System.err.println("Error during file copy: " + e.getMessage());
            }
        } 
		else 
		{
            System.out.println("Java FileCopy <sourceFile> <destinationFile> <mode> Require.!");
            System.out.println("Mode should be either binary or text");
        }
    }

    // Method to copy binary files
    private static void copyBinaryFile(String sourceFile, String destinationFile)
	{
        try{
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos=new FileOutputStream(destinationFile);

            int bytesRead;
            while((bytesRead=fis.read())!=-1)
			{
                fos.write(bytesRead);
            }
            fis.close();
            fos.close();
        }catch(IOException e)
		{
            System.out.println("Error: "+e.getMessage());
        }
    }

    // Method to copy text files
    private static void copyTextFile(String sourceFile, String destinationFile)
	{
        try{
            FileReader fr=new FileReader(sourceFile);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(destinationFile);
            BufferedWriter bw=new BufferedWriter(fw);

            String data;
            while((data=br.readLine())!=null)
			{
                bw.write(data);
            }

            br.close();
            bw.close();
        }
		catch(Exception e)
		{
            System.err.println("Error: "+e.getMessage());
        }
    }
}