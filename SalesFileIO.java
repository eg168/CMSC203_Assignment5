import java.util.Scanner;
import java.io.*;

public class SalesFileIO {
	
	private static String inputFileName;

	public static double[][] readSalesData(String fileName) throws FileNotFoundException {
		
		inputFileName = fileName;
		String[] tokens;
		int rows = 0;
		
		File file = new File(fileName);
		Scanner inputFile1 = new Scanner(file);
		
		while(inputFile1.hasNextLine()) {
			String next = inputFile1.nextLine();
			if(!next.isEmpty()) {
				rows++;
			}
		}	
		
		double[][] sales = new double[rows][];
		inputFile1.close();
		Scanner inputFile2 = new Scanner(file);
		
		for(int i = 0; i < rows; i++) {
			
			String next2 = inputFile2.nextLine();
			tokens = next2.split(" ");
			if(next2.isEmpty()) {
				System.out.println("\nError: Line is empty.\n");
				break;
			}
			
			sales[i] = new double[tokens.length];
			
			for(int w = 0; w < tokens.length; w++) {
				sales[i][w] = Double.parseDouble(tokens[w]);
			
			}
		}
		
		inputFile2.close();
		return sales;
	}
	
	public static void writeSummary(String fileName, double[][] data) throws IOException {
		
		System.out.println("Data loaded from " + inputFileName);
		
		System.out.printf("\nTotal sales: %.2f", SalesDataUtility.getTotal(data));
		System.out.printf("\nAverage sale: %.2f", SalesDataUtility.getAverage(data));
		System.out.printf("\nHighest sale: %.2f", SalesDataUtility.getHighestInArray(data));
		System.out.printf("\nLowest sale: %.2f", SalesDataUtility.getLowestInArray(data));
		
		System.out.print("\n");
		for(int i = 0; i < data.length; i++) {
			System.out.printf("\nRow " + i + " total: %.2f", SalesDataUtility.getRowTotal(data, i));
		}
		
		File file = new File(fileName);
		PrintWriter outputFile = new PrintWriter(file);
		
		outputFile.printf("Total sales: %.2f", SalesDataUtility.getTotal(data));
		outputFile.printf("\nAverage sale: %.2f", SalesDataUtility.getAverage(data));
		for(int i = 0; i < data.length; i++) {
			outputFile.printf("\nRow " + i + " total: %.2f", SalesDataUtility.getRowTotal(data, i));
		}
		
		for(int i = 0; i < data.length; i++) {
			outputFile.printf("\nColumn " + i + " total: %.2f", SalesDataUtility.getColumnTotal(data, i));
		}
		
		outputFile.close();
	}
}
