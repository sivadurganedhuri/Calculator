import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	
		System.out.println("Arithmetric operation");
		
		int n1,n2,ch,cal;
		System.out.println("Elements two numbers");
		Scanner r = new Scanner(System.in);
		 n1 =r.nextInt();
		 n2 =r.nextInt();
		 System.out.println("Select Operation");
		 System.out.println("1.Addition \n 2. Subtraction \n 3. Multipliication \n 4.DIvision \n or Reminder(if wrong input)");
		 ch=r.nextInt();
		 
		 if(ch==1)
		 {
			 cal =n1+n2;
			 System.out.println("Addition :"+ cal);
			 
		 }
		 else if(ch==2)
		 {
			 cal =n1-n2;
			 System.out.println("Subtraction:"+cal);
		 }
		 else if(ch==3)
		 {
			 cal =n1*n2;
			 System.out.println("mutiplication :"+cal);
		 }
		 else if(ch==4)
		 {
			 cal =n1/n2;
			 System.out.println("Division :"+cal);
		 }
		 else {
			 cal =n1%n2;
			 System.out.println("Remainder :"+cal);
		 }
	}

}
