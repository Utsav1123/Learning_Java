package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;




public class P15_FileHandling {
public static void main(String[] args) throws IOException{
	ABC obj=new ABC();
	//obj.takeInputFromAFileNotFromConsole();
	obj.saveOutputIntoAfile();
	obj.createALogFile(2);
	
}
}
class ABC{
	void takeInputFromAFileNotFromConsole() throws IOException{
		String path="C:\\Users\\utsav\\git\\Learning_Java\\LearningJava\\src\\Unit_03\\input.txt";
		File file = new File(path);

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}

		// list that holds strings of a file
		List<String> listOfStrings = new ArrayList<String>();

		// read entire line as string
		String line = br.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}

		for (String str : listOfStrings) {
		System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}
	void saveOutputIntoAfile() throws IOException {
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\utsav\\git\\Learning_Java\\LearningJava\\src\\Unit_03\\output.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();
	}
	void createALogFile(int a) throws IOException {
a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\utsav\\git\\Learning_Java\\LearningJava\\src\\Unit_03\\logfile.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();

	}

	}
