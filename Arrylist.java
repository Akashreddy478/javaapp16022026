package java160226;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrylist {
	

		public static void main(String[] args) {
			ArrayList employeeData = new ArrayList();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter Employee ID: ");
			int inputEmployeeId = scanner.nextInt();
			System.out.print("Enter First Name: ");
			String inputFirstName = scanner.next();
			System.out.print("Enter Last Name: ");
			String inputLastName = scanner.next();
			System.out.print("Enter Gender: ");
			String inputGender = scanner.next();
			System.out.print("Enter Weight: ");
			double inputWeight = scanner.nextDouble();
			System.out.print("Is Married? (type true or false): ");
			boolean inputMaritalStatus = scanner.nextBoolean();
						
			System.out.println();
			
			employeeData.add(inputEmployeeId);
			employeeData.add(inputFirstName);
			employeeData.add(inputLastName);
			employeeData.add(inputGender);
			employeeData.add(inputWeight);
			employeeData.add(inputMaritalStatus);
			
			System.out.println(employeeData);
					
			System.out.println();
			
			System.out.print("Email Address: ");
			String inputEmailAddress = scanner.next();
			System.out.print("Mobile Number: ");
			String inputMobileNumber = scanner.next();
			
			employeeData.add(inputEmailAddress);
			employeeData.add(inputMobileNumber);
			
			System.out.println(employeeData);

			/*System.out.print("Enter Employee ID: ");
			int inputEmployeeId = scanner.nextInt();
			System.out.print("Enter First Name: ");
			String inputFirstName = scanner.next();
			System.out.print("Enter Last Name: ");
			String inputLastName = scanner.next();
			System.out.print("Enter Gender: ");
			String inputGender = scanner.next();
			System.out.print("Enter Weight: ");
			double inputWeight = scanner.nextDouble();
			System.out.print("Is Married? (type true or false): ");
			boolean inputMaritalStatus = scanner.nextBoolean();
				
			System.out.println();
			
			String[] employeeData = {
				String.valueOf(inputEmployeeId),
				inputFirstName,
				inputLastName,
				inputGender,
				String.valueOf(inputWeight),
				String.valueOf(inputMaritalStatus)
			};*/
			
			scanner.close();
		
		
	}
}


