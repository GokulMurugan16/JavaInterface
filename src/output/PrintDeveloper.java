package output;

import classDeveloper.DBDeveloper;
import classDeveloper.FileDeveloper;
import interfaceJava.Int2;
import interfaceJava.classImplimentation;

public class PrintDeveloper {


	
	public static void main(String[] args) {
		Int2 classImpFile = new FileDeveloper();
		classImpFile.printStatement();
		classImpFile.hello();
		classImpFile.get1();
		classImpFile.get2();
		
		classImplimentation classImpDB = new DBDeveloper();
		classImpDB.printStatement();
		classImpDB.hello();
		

		
	}

}
