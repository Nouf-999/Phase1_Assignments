import java.io.*;

public class FileHandling {

	public static void main (String [] args) throws IOException {
		
		
		  // (1) Read a file.
		  
		  FileReader fr=new FileReader("C:\\Users\\HB\\Documents\\File0.txt"); 
		  int i;
		  while((i=fr.read())!=-1) 
			  System.out.print((char)i);
		  fr.close();
		  
		  
		  // (2) Write a file.
		  
		  try{ 
			   
		  FileWriter fw=new FileWriter("C:\\\\Users\\\\HB\\\\Documents\\\\File0.txt");
		  fw.write("This is a new text..."); fw.close();
		  }
		  
		  catch(Exception e){ 
			  System.out.println(e);
			  }
		  
		  System.out.println("\n Success...");

	  // (3) Append to a file.
		StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "C:\\\\Users\\\\HB\\\\Documents\\\\File0.txt";
             
             FileWriter fw = new FileWriter(filename,true); 
             
             //appends the string to the file
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\HB\\\\Documents\\\\File0.txt"));
             
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
	}
}

