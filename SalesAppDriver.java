import java.util.Scanner;
import java.io.*;

public class SalesAppDriver {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		String inputName, outputName;
		double[][] sales;
		
		System.out.print("Enter input file name: ");
		inputName = input.nextLine();
		
		System.out.print("\nEnter output file name: ");
		outputName = input.nextLine();
		
		sales = SalesFileIO.readSalesData(inputName);
		SalesFileIO.writeSummary(outputName, sales);
		
		input.close();
		
		
	}
}
