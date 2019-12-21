import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterInput {
	
	public void add(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11, String s12, String s13, String s14, String s15, String s16, String s17, String s18, String s19, String s20, String s21){
		
	try {
		String name = s+s1;
		File file = new File(name+".txt");
		file.createNewFile();
		FileWriter fr = null;
		fr = new FileWriter(file);
	
		
		fr.write("     ********** Personal Information **********     \n");
		fr.write("Firstname: " + s + "\n");
		fr.write("Surname: " + s1 + "\n");
		fr.write("Address: " + s2 + "\n");
		fr.write(s3 + "\n");
		fr.write("\n Pincode: " + s4 + "\n");
		fr.write("Nationality: " + s5 + "\n");
		fr.write("DOB: " + s6 + "\n");
		fr.write("Phone No.: " + s7 + "\n");
		fr.write("Email: " + s8 + "\n");
		
		
		fr.write("     ********** Skills **********     \n");
		fr.write("Category: " + s10 + "\n");
		fr.write("Description" + s9 + "\n");
		fr.write("Category: " + s11 + "\n");
		fr.write("Description" + s13 + "\n");
		fr.write("Category: " + s12 + "\n");
		fr.write("Description: " + s14 + "\n");
		
		
		fr.write("     ********** Qualifications **********     \n");
		fr.write("College/University: " + s19 + "\n");
		fr.write("School: " + s20 + "\n");
		fr.write("Other: " + s21 + "\n");	
		
		fr.write("     ********** Work Experience **********     \n");
		fr.write("Company: " + s15 + "\n");
		fr.write("Designation: " + s16 + "\n");
		fr.write("Company: " + s18 + "\n");
		fr.write("Designation: " + s17 + "\n");
		fr.close();
		
	}
	catch(IOException e) {
		e.getMessage();
	}
	
	}
	
}
