import java.util.ArrayList;
import java.util.List;

public class practisan {

	public static void main(String[] args) {
		// Break statement 
		/*int[] arraysOfInt = {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
		};
		int searchFor = 21;
		
		int i;
		boolean foundIt = false;
		
		for (i = 0; i < arraysOfInt.length; i++) {
			if (arraysOfInt[i] == searchFor) {
				foundIt = true;
				break;
			}
		}
		
		if (foundIt) {
			System.out.println("Found" + searchFor + "At index: " + i);
		} else  {
			System.out.println("We cannot find what you're looking for");
		}*/
		
		
		
		// BreakWithLabel
		/*int[][] arraysOfInt = {
				{1,2,3,4,5,6,7,8,9},
				{10,11,12,13,14,15},
				{16,17,18,19,20}
		};
		int searchFor = 117; 
		
		int i;
		int j = 0;
		boolean foundIt = false;
		
		
		search:
			for (i = 0; i < arraysOfInt.length; i++) {
				for(j = 0; j < arraysOfInt[i].length; j++) {
					if (arraysOfInt[i][j] == searchFor) {
						foundIt = true;
						break search;
					}
				}
			}
		
		if (foundIt ) {
			System.out.println("Found: " + searchFor + "in index: " + j);
		}else {
			System.out.println(searchFor + " Not found!! ");
		}*/
		
		
		// Continue Label Statement
		/*String searchMe = "peter piper picked a \" + \"peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		
		for (int i = 0; i < max; i++) {
			//interested only in p's
			if (searchMe.charAt(i) != 'p')
				continue;
			
			numPs++;
		} 
		System.out.println("Found " + numPs + "p's in the string");*/
		
		
		
		
		//Continue With Label Demo uses test
		/*String searchMe = "Look for a substring in Me";
		String subString = "sub";
		boolean foundIt = false;
		
		int max = searchMe.length() - subString.length();
		
		test:
			for(int i = 0; i <= max; i++) {
				int n = subString.length();
				int j = i;
				int k = 0; 
				
				while (n-- != 0) {
					if(searchMe.charAt(j++) != subString.charAt(k++)) {
						continue test;
					}
				}
					foundIt = true;
					break test;
			}
		System.out.println(foundIt ? " Found it" : "Didn't find it");*/
		
		
		//Switch Statement 
		/*int quarter = 10; 
		
		String quarterLabel = null; 
		switch (quarter) {
		case 0: quarterLabel = "Q1 - Winter"; 
			break;
		case 1: quarterLabel = "Q2 - Spring"; 
			break;
		case 2	: quarterLabel = "Q2 - Summer"; 
			break;
		case 3: quarterLabel = "Q3 - summer"; 
			break;
		default: quarterLabel = "Unknown Quarter";
		};*/
		
		// Switch of FutureMonth
		/*int month = 4;
		List<String> futureMonths = new ArrayList<>();

		switch (month) {
		    case 1:  futureMonths.add("January");
		    case 2:  futureMonths.add("February");
		    case 3:  futureMonths.add("March");
		    case 4:  futureMonths.add("April");
		    case 5:  futureMonths.add("May");
		    case 6:  futureMonths.add("June");
		    case 7:  futureMonths.add("July");
		    case 8:  futureMonths.add("August");
		    case 9:  futureMonths.add("September");
		    case 10: futureMonths.add("October");
		    case 11: futureMonths.add("November");
		    case 12: futureMonths.add("December");
		             break;
		    default: break;
		}
		System.out.println("The future months after March are: " + futureMonths + 
		"The Months before are counter as = " + month);*/
		

		// calculations of months using switch statement
		/*int month = 12;
		int year = 2024;
		int numDays = 0;
		
		switch (month) {
		case 1: case 3: case 5: // January March May
		case 7: case 8: case 10: // July August December
		case 12:
			numDays = 31; 
			break;
			
		case 4: case 6: // April June
		case 9: case 11: // September November
			numDays = 30;
			break;
			
		case 2: // February
			if (((year % 4 == 0) && !(year % 100 == 0)) ||(year % 400 == 0))
				numDays = 29;
			else 
				numDays = 28;
			break;
		default: 
			System.out.println("InvalidMonth ");
			break;	
		}
		System.out.println(numDays);*/
		
		
		/*String month = "February";
		int monthCount = 12;
		
		switch (month.toUpperCase()) {
		case "January":
			monthCount = 1;
			break;
		case "February":
			monthCount = 2;
			break;
		case "March":
			monthCount = 3;
			break;
		case "April":
			monthCount = 4;
			break;
		case "May":
			monthCount = 5;
			break;
		case "June":
			monthCount = 6;
			break;
		case "July":
			monthCount = 7;
			break;
		case "August":
			monthCount = 8;
			break;
		case "September":
			monthCount = 9;
			break;
		case "October":
			monthCount = 10;
			break;
		case "November":
			monthCount = 11;
			break;
		case "December":
			monthCount = 12;
			break;
		default: 
			monthCount = 0; 
			break;
		}*/
		

		
		// Arbitrary Number of Arguments
		
		/*public Polygon polygonFrom(Point... corners) {
		    int numberOfSides = corners.length;
		    double squareOfSide1, lengthOfSide1;
		    squareOfSide1 = (corners[1].x - corners[0].x)
		                     * (corners[1].x - corners[0].x) 
		                     + (corners[1].y - corners[0].y)
		                     * (corners[1].y - corners[0].y);
		    lengthOfSide1 = Math.sqrt(squareOfSide1);

		    // more method body code follows that creates and returns a 
		    // polygon connecting the Points
		}*/
		
		
		
		
		
		// PASSING PRIMITIVE DATA TYPE ARGUMENTS
		/*int x = 3; 
		
		passMethod(x);
		
		System.out.println("After invoking method: " + x);*/
		
			
		
//end bracket===================================================	
}	
	// PASSING PRIMITIVE DATA TYPE ARGUMENTS	
	/*}
	public static void passMethod(int p) {
		p = 10;
	}*/

}
