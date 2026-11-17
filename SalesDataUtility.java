
public class SalesDataUtility {
	
	public static double getTotal(double[][] data) {
		
		double totalAmount = 0;
		for(int i = 0; i < data.length; i++) {
			for(int w = 0; w < data[i].length; w++) {
				
				totalAmount += data[i][w];
			}
		}
		return totalAmount;
	}
	
	public static double getAverage(double[][] data) {
		
		double averageAmount = 0;
		int divisionCount = 0;
		for(int i = 0; i < data.length; i++) {
			for(int w = 0; w < data[i].length; w++) {
				
				averageAmount += data[i][w];
				divisionCount++;
			}
		}
		averageAmount /= divisionCount;
		return averageAmount;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		
		double rowTotal = 0;
		for(int i = 0; i < data[row].length; i++) {
			rowTotal += data[row][i];
		}
		return rowTotal;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		
		double columnTotal = 0;
		for(int i = 0; i < data.length; i++) {
			if(col < data[i].length) {
				columnTotal += data[i][col];
			}
		}
		return columnTotal;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		
		double highestInRow = data[0][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] > highestInRow) {
				highestInRow = data[row][i];
			}
		}
		return highestInRow;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		
		double lowestInRow = data[0][0];
		for(int i = 0; i < data[row].length; i++) {
			if(data[row][i] < lowestInRow) {
				lowestInRow = data[row][i];
			}
		}
		return lowestInRow;
	}
	
	public static double getHighestInArray(double[][] data) {
		
		double highestInArray = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int w = 0; w < data[i].length; w++) {
				if(data[i][w] > highestInArray) {
					highestInArray = data[i][w];
				}
			}
		}
		return highestInArray;
	}
	
	public static double getLowestInArray(double[][] data) {
		
		double lowestInArray = data[0][0];
		for(int i = 0; i < data.length; i++) {
			for(int w = 0; w < data[i].length; w++) {
				if(data[i][w] < lowestInArray) {
					lowestInArray = data[i][w];
				}
			}
		}
		return lowestInArray;
	}
}
