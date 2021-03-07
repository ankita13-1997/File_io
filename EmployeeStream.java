import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeStream {

	
	
	
	
	public static void readFromFile() throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream input=null;
        ObjectInputStream oinput=null;
        
         input=new FileInputStream("E:\\practice_core\\Fileio\\src\\filePay");
         oinput=new ObjectInputStream(input);
         PogoEmp payroll = (PogoEmp)oinput.readObject();
         
         System.out.println(payroll.toString());
         
         input.close();
         oinput.close();
        
        
	}
	
	private static void writeToFile(PogoEmp payroll)throws IOException  
	{
		// TODO Auto-generated method stub
		FileOutputStream output=null;
        ObjectOutputStream o_output=null;
        
		output=new FileOutputStream("E:\\practice_core\\Fileio\\src\\filePay");
		
		o_output = new ObjectOutputStream(output);
		
		o_output.writeObject(payroll);
		System.out.println("succesfully written");
		output.close();
		o_output.close();
		
		
	}
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		Scanner sc= new Scanner(System.in);
		
		Integer id;
		
		String name;
		 
	    Double salary;
	    
	    System.out.println("enter your id");
	    id=sc.nextInt();
	    
	    System.out.println("enter your name");
	    name=sc.next();
	    
	    System.out.println("enter your double");
	    salary=sc.nextDouble();
	    
	    
	    PogoEmp payroll = new PogoEmp(id,name,salary);
	    
	    writeToFile(payroll);

	    readFromFile();
	    sc.close();
	    
	    
		
		
	}
	
	
}
