package work;

import java.io.*;
import java.util.*;
class Marksheet
{
	static String firstname,lastname,course,exam;
	static int sem,enroll,session,seat,sub1,sub2,sub3,sub4,total;
	static float per;
	public static void login(String us,String ps)
	{
		//Function for Admin to login
		int a=0,count=0;
		String userName=new String();
		String password=new String();
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		while(a!=1)
		{
			try
			{
				System.out.println("-----------------------------------------------------------");
				System.out.println("\t PLEASE COMPLETE THE LOGIN PROCEDURE TO CONTINUE");
				System.out.println("-----------------------------------------------------------");
				System.out.println("___________________Login Below___________________\n");
				/*Siddhesh Kale*/
				if(count<4)
				{
					System.out.println("Enter your User Name:  ");admin
					userName=scan.readLine();
					System.out.println("-----------------------------------------------------------");
					System.out.println("");
					System.out.println("-----------------------------------------------------------");
					System.out.println("Enter your Password :  ");
					password=scan.readLine();
					System.out.println("-----------------------------------------------------------");
					System.out.println("");
				
					if((userName.equals(us))&&(password.equals(ps)))
					{
						System.out.println("Login Successful.\nLoading Menu...\n.\n.\n.");
						System.out.println("\n");
						a=1;
					}
					else
					{
						System.out.println("Enter Valid UserName and Password. \n.\n.\n Login not Successful try again.\n");
						count++;
					}
				}
				else
				{
					System.out.println("too much tries occured restart the application to login again.");
					System.exit(0);
				}
			}
 
			catch (Exception e)
			{
				System.out.println("Error... Incorrect Username or Password");
			}
     	}

	}
	public static void add() throws IOException
	{
		FileWriter fw=new FileWriter("DATA.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println(firstname+","+lastname+","+enroll+","+course+","+exam+","+sem+","+session+","+seat+","+sub1+","+sub2+","+sub3+","+sub4+","+total+","+per);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		pw.flush();
		pw.close();
	}
	public static void getdata() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter  First Name Of Student:");
		firstname = br.readLine();
		System.out.println (" ");
		System.out.println ("Enter Last Name Of Student:");
		lastname = br.readLine();
		System.out.println (" ");
		System.out.println("Enter Student Enrollment no:");
		enroll = Integer.parseInt(br.readLine());	
		System.out.println (" ");
		System.out.println ("Enter Exam SUMMER OR WINTER:");
		exam = br.readLine();
		System.out.println (" ");
		System.out.println("Enter Student Seat No:");
		seat = Integer.parseInt(br.readLine());
		System.out.println (" ");
		System.out.println ("Enter Number Of Exam semester:");
		sem = Integer.parseInt(br.readLine());
		System.out.println (" ");
		System.out.println ("Enter Course Of Student:");
		course = br.readLine();
		System.out.println (" ");
		System.out.println ("Enter marks out of 80 of APPLIED MATHEMATICS-III subject:");
		sub1 = Integer.parseInt(br.readLine());
		System.out.println (" ");
		System.out.println ("Enter marks out of 80 of ELECTRONIC DEVICES & CIRCUITS Isubject:");
		sub2 = Integer.parseInt(br.readLine());
		System.out.println (" ");
		System.out.println ("Enter marks out of 80 of DIGITAL SYSTEM DESIGN subject:");
		sub3 = Integer.parseInt(br.readLine());
		System.out.println (" ");
		System.out.println ("Enter marks out of 80 of CIRCUIT THEORY AND NETWORK subject:");
		sub4 = Integer.parseInt(br.readLine());

		System.out.println("--------------------------------------------------------------------------------");
	}
	public static void show()throws IOException
	{
		
		System.out.println("\t\tUNIVERSITY OF MUMBAI");
		System.out.println("\t\t\t\tSTATEMENT OF MARKS");
		System.out.print ("MR. /MS.\t: "+firstname);
		System.out.println(" "+lastname);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("ENROLLMENT NO.\t: "+enroll+"\tExamination: "+exam+"\tSEAT NO.: "+seat);
		System.out.println ("SEMESTER\t: "+sem);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("COURSE\t\t: "+course);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("SUBJECT\t\t\tMAX.MARKS\tMIN.MARKS\tMARKS OBTAINED");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("APPLIED MATHEMATICS-III \t80\t\t32\t\t"+sub1);
		System.out.println ("ELECTRONIC DEVICES & CIRCUITS I \t80\t\t32\t\t"+sub2); 
		System.out.println ("DIGITAL SYSTEM DESIGN \t80\t\t32\t\t"+sub3);
		System.out.println ("CIRCUIT THEORY AND NETWORK \t80\t\t32\t\t"+sub4);
	
		total=sub1+sub2+sub3+sub4;
		per=(total*80)/400;
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("\t\tTOTAL MAX."+"\tRESULT WITH"+"\tTOTAL MARKS");
		System.out.println ("\t\tMARKS"+"\t\t     %\t\t"+"OBTAINED");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("\t\t400"+"\t\t"+per+"\t\t"+total);
		System.out.println("--------------------------------------------------------------------------------");
		if(per>=60)
		{
			System.out.println("CLASS AWARDED\t: FIRST CLASS");
		}
		if(per>=40 && per<60)
		{
			System.out.println("CLASS AWARDED\t: SECOND CLASS");
		}
		if(per<40)
		{
			System.out.println("CLASS AWARDED\t: THIRD CLASS");
		}
		System.out.println("--------------------------------------------------------------------------------");
	
		if(sub1>32 && sub2>32 && sub3>32 && sub4>32)
		{
			System.out.println(" RESULT\t\t: PASS");
		}
	
		if(sub1<32 && sub2>32 && sub3>32 && sub4>32)
        {
			System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2<32 && sub3>32 && sub4>32)
		{
			System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2>32 && sub3<32 && sub4>32)
        {
             System.out.println(" RESULT\t\t: ATKT");
         }
        else if(sub1>32 && sub2>32 && sub3>32 && sub4<32)
        {
             System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2>32 && sub3>32 && sub4>32)
        {
             System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1<32 && sub2<32 && sub3<32 && sub4<32) 
        { 
            System.out.println(" RESULT\t\t: FAIL");
        }
        System.out.println("--------------------------------------------------------------------------------");
		add();
	}
	public static void show(String firstname,String lastname,String enroll,String course,String exam,String sem,String session1,String seat,String sub11,String sub22,String sub33,String sub44,String totall,String perc)throws IOException
	{
		/*
		static String firstname,lastname,course,exam;
		static int sem,enroll,seat,sub1,sub2,sub3,sub4,total;
		static float per;
		*/
		Float session,sub1,sub2,sub3,sub4,total;
		sub1=Float.parseFloat(sub11);
		sub2=Float.parseFloat(sub22);
		sub3=Float.parseFloat(sub33);
		sub4=Float.parseFloat(sub44);
		
		
		System.out.println("\t\tUNIVERSITY OF MUMBAI");
		System.out.println("\t\t\t\tSTATEMENT OF MARKS");
		System.out.print ("MR. /MS.\t: "+firstname);
		System.out.println(" "+lastname);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("ENROLLMENT NO.\t: "+enroll+"\tExamination: "+exam+"\tSEAT NO.: "+seat);
		System.out.println ("SEMESTER\t: "+sem);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("COURSE\t\t: "+course);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("SUBJECT\t\t\tMAX.MARKS\tMIN.MARKS\tMARKS OBTAINED");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println (" APPLIED MATHEMATICS-III \t80\t\t32\t\t"+sub1);
		System.out.println (" ELECTRONIC DEVICES & CIRCUITS I \t80\t\t32\t\t"+sub2); 
		System.out.println (" DIGITAL SYSTEM DESIGN \t80\t\t32\t\t"+sub3);
		System.out.println (" CIRCUIT THEORY AND NETWORK \t80\t\t32\t\t"+sub4);
	
		total=sub1+sub2+sub3+sub4;
		per=(total*80)/400;
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("\t\tTOTAL MAX."+"\tRESULT WITH"+"\tTOTAL MARKS");
		System.out.println ("\t\tMARKS"+"\t\t     %\t\t"+"OBTAINED");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println ("\t\t400"+"\t\t"+per+"\t\t"+total);
		System.out.println("--------------------------------------------------------------------------------");
		if(per>=60)
		{
			System.out.println("CLASS AWARDED\t: FIRST CLASS");
		}
		if(per>=40 && per<60)
		{
			System.out.println("CLASS AWARDED\t: SECOND CLASS");
		}
		if(per<40)
		{
			System.out.println("CLASS AWARDED\t: THIRD CLASS");
		}
		System.out.println("--------------------------------------------------------------------------------");
	
		if(sub1>32 && sub2>32 && sub3>32 && sub4>32)
		{
			System.out.println(" RESULT\t\t: PASS");
		}
	
		if(sub1<32 && sub2>32 && sub3>32 && sub4>32)
        {
			System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2<32 && sub3>32 && sub4>32)
		{
			System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2>32 && sub3<32 && sub4>32)
        {
             System.out.println(" RESULT\t\t: ATKT");
         }
        else if(sub1>32 && sub2>32 && sub3>32 && sub4<32)
        {
             System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1>32 && sub2>32 && sub3>32 && sub4>32)
        {
             System.out.println(" RESULT\t\t: ATKT");
        }
        else if(sub1<32 && sub2<32 && sub3<32 && sub4<32)
        { 
            System.out.println(" RESULT\t\t: FAIL");
        }
        System.out.println("--------------------------------------------------------------------------------");
	}
	public static String getEnrollmentNo(String searchTerm)
	{
		//Function to retrive id.
		
		String firstname="";String lastname="";String enroll="";String course="";
		String exam="";String sem="";String session="";String seat="";String sub1="";
		String sub2="";String sub3="";String sub4="";String total="";String per="";
		try
		{			
			boolean found=false;					
			File file22=new File("input.txt");
			Scanner scan22=new Scanner(file22);	
			scan22.useDelimiter("[,\n]");
			while((scan22.hasNext()) && (found==false))
			{
				firstname=scan22.next();
				lastname=scan22.next();
				enroll=scan22.next();
				course=scan22.next();
				exam=scan22.next();
				sem=scan22.next();
				session=scan22.next();
				seat=scan22.next();
				sub1=scan22.next();
				sub2=scan22.next();
				sub3=scan22.next();
				sub4=scan22.next();
				total=scan22.next();
				per=scan22.next();
			
				if(enroll.equals(searchTerm))
				{
					found=true;
				}
			}
			if(found==true)
			{
				//return (b);
			}
			else
			{
				enroll="0";
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught          "+e);
		}
		return (enroll);
	}
	public static void search(String searchTerm) throws IOException
	{
		String firstname="";String lastname="";String enroll="";String course="";
		String exam="";String sem="";String session="";String seat="";String sub1="";
		String sub2="";String sub3="";String sub4="";String total="";String per="";
		try
		{			
			boolean found=false;					
			File file2=new File("input.txt");
			Scanner scan2=new Scanner(file2);	
			scan2.useDelimiter("[,\n]");
			while((scan2.hasNext()) && (found==false))
			{
			firstname=scan2.next();
			lastname=scan2.next();
			enroll=scan2.next();
			course=scan2.next();
			exam=scan2.next();
			sem=scan2.next();
			session=scan2.next();
			seat=scan2.next();
			sub1=scan2.next();
			sub2=scan2.next();
			sub3=scan2.next();
			sub4=scan2.next();
			total=scan2.next();
			per=scan2.next();
				if(enroll.equals(searchTerm))
				{
					found=true;
				}
			}
			if(found==true)
			{
				show(firstname,lastname,enroll,course,exam,sem,session,seat,sub1,sub2,sub3,sub4,total,per);
			}
			scan2.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught          "+e);
		}
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String us="admin";
		String ps="admin123";
		login(us,ps);
		System.out.println("Enter your Enrollment NO : ");
		String searchTerm=br.readLine();
		String answer=getEnrollmentNo(searchTerm);
		//System.out.println(answer);
		if(answer.equalsIgnoreCase(searchTerm))
		{
			search(searchTerm);
		}
		else 
		{
			getdata();
			show();
		}
	}	
}

