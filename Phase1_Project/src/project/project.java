package project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class project {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Lockerme.com");
		System.out.println("Developer : Royson Dsouza");
		while(true) {
		System.out.println("1.List    2.Operations on Directory    3.Search");
		int a;
		System.out.println("Enter the option");
		a=sc.nextInt();
		File f = new File("C:/Project");
		f.mkdir();
		
		if(a==1) {
			 String[] pathnames;
			 pathnames = f.list();
			 List listFile = Arrays.asList(f.list());
			 Collections.sort(listFile);
			 String[]  b;
			 b=f.list();
			 
			 for (String pathname :b) {
				 System.out.println(pathname);
			 }
		}
		
		else if(a==2) {
			while(true) {
				 System.out.println("1.Add  2.Search 3.Delete 4.Goto previous option");
				 int c;
				 System.out.println("Enter the option");
				 c=sc.nextInt();
				
				 if(c==1) {
					 File f1;
					 String s1;
					 System.out.println("enter the file to be added");
					 s1=sc.next();
					 f1=new File("C:/Project/"+s1);
					 String[] b1=f.list();
					 for(String s2:b1) {
						 if(s1==s2)
						 {
							 System.out.println("File name already taken");
						 }
						 else {
					 boolean filecreated=f1.createNewFile();
						 }
				 }
					 }
				 else if(c==2) {
					 File f2;
					 String s3;
					 System.out.println("enter the file to be searched");
					 s3=sc.next();
					 String[] b2=f.list();
					 for(String s4:b2) {
						 if(s3.equals(s4))
						 {
							 System.out.println("File name with "+s3+  " is found");
							 break;
						 }
						 else {
					          System.out.println("No such file");
						 }
				 }
					 
				}
				 else if(c==3) {
					 File f3;
					 String s5;
					 System.out.println("enter the file to be deleted");
					 s5=sc.next();
					 f3= new File("C:/Project/"+s5);
					 String[] b3=f.list();
					 for(String s6:b3) {
						 if(s5.equals(s6))
						 {
							 boolean filedeleted=f3.delete();
							 if(filedeleted) {
							 System.out.println("File found and deleted");
						 }
							 else {
								 System.out.println("not found");
							 }
						
				 }
					 
				 }
				 }
				 
				 
				 else if(c==4) {
					 break;
				 }
				 else if(c>4) {
					 System.out.println("Invalid Option");
				 }
			 }
		}
		if(a==3) {
			System.out.println("Thank You");
			break;
		}
		
		}
		// TODO Auto-generated method stub

	}
}


