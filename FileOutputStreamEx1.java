import java.io.FileOutputStream;

public class FileOutputStreamEx1 {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fout=new FileOutputStream("Test1.txt");
			String s="This is my file handling";
			byte b[]=s.getBytes(s);
			fout.write(b);
			fout.close(); 
			System.out.println("Successfully done");		
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
