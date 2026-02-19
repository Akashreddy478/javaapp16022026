package java160226;
import java.util.Scanner;

public class Mainprogram1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter employee id :");
		int inputEmployeeId =sc.nextInt();
		System.out.print("enter the first name  :");
		String inputFirstname =sc.next();
		System.out.print("enter the last name  :");
		String inputlastname =sc.next();
		System.out.print("enter the gender  :");
		String inputgendername =sc.next();		
		System.out.print("enter the weight  :");
		String inputweight =sc.next();
		System.out.print("enter the martial status  :");
		String inputmartialstatus =sc.next();
		String [] str = {String.valueOf(inputEmployeeId),inputFirstname,inputlastname,inputgendername,inputweight,inputmartialstatus};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}

		sc.close();
	}
}


