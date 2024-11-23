import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class p15 
{
    public static void main(String[] args) throws IOException 
	{
        try 
		{
            File f1 = new File("./stt.txt.txt");

            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.printf("%-10s %-15s %-10s %-10s %-10s %-12s %s%n", "Roll No", "Name", "Sub1", "Sub2", "Sub3",
                    "Total", "Percentage");

            while ((line = br.readLine()) != null) 
			{
                String []data = line.split("\t");

                if (data.length != 5) 
				{
                    System.out.println("Invalid record format:" + line);
                    continue;
                }

                int rollno = Integer.parseInt(data[0]);
                String name = data[1];
                double sub1 = Double.parseDouble(data[2]);
                double sub2 = Double.parseDouble(data[3]);
                double sub3 = Double.parseDouble(data[4]);

                double total = sub1 + sub2 + sub3;
                double percentage = (total / 300) * 100;

                System.out.printf("%-10d %-15s %-10.2f %-10.2f %-10.2f %-12.2f %.2f%%%n", rollno, name, sub1, sub2,
                        sub3, total, percentage);
            }
            br.close();
        } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }
}