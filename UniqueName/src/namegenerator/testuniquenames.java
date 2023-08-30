package namegenerator;

//public class testuniquenames {
//
//	public static void main(String[] args)
//	{
//		
//
//		String uniqueName = "Sel" + System.currentTimeMillis();
//		System.out.print(uniqueName);
//	}
//
//}


import java.util.Random;

public class testuniquenames 
{
	public static void main(String[] args)
	{
//}
//        // Create an instance of the Random class
//        Random random = new Random();
//
//        // Generate a random 10-digit number
//        long lowerBound = 1000000000L; // 10-digit number starts at 1,000,000,000
//        long upperBound = 9999999999L; // 10-digit number ends at 9,999,999,999
//        long randomTenDigitNumber = lowerBound + (long) (random.nextDouble() * (upperBound - lowerBound));
//
//        // Print the generated number
//        System.out.println("Random 10-Digit Number: " + randomTenDigitNumber);
//    }
//}

	String uniqueSSN = "1" + System.currentTimeMillis();
	String firstTenDigits = uniqueSSN.substring(0, 10);
	
	
  
   System.out.println("Random 10-Digit Number: " + firstTenDigits);

}
}

