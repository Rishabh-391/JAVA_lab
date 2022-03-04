
import java.util.Scanner;
class Demo{
	void print_Multiple(){
		Scanner obj = new Scanner(System.in);
		int n =obj.nextInt();
		for(int i=1;i<n;i++){
			System.out.println("2*"+i+" = "+2*i);
		}
	}
	int calculator(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=obj.nextInt();
		System.out.println("Enter a number");
		int b=obj.nextInt();
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Modulas");
		System.out.println("Enter your choice");
		int choice=obj.nextInt();
		switch(choice){
			case 1:
				return a+b;
			case 2:
				return a-b;
			case 3:
				return a*b;
			case 4:
				return a/b;
			case 5:
				return a%b;
		}
		return -1;
	}
	void marks(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=obj.nextInt();
		int[] marks=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter marks of "+i+1+" student");
			marks[i]=obj.nextInt();
		}
		int[] counter=new int[4];
		for(int i=0;i<n;i++){
			if(marks[i]>=81 && marks[i]<=100)
				counter[0]++;
			else if(marks[i]>=61 && marks[i]<=80)
				counter[1]++;
			else if(marks[i]>=41 && marks[i]<=60)
				counter[2]++;
			else
				counter[3]++;
		}
		for(int i=0;i<4;i++){
			System.out.println("Marks of the students:");
			System.out.println(counter[i]);
		}
	}
	public static void main(String args[]){
		Demo ob=new Demo();
		Scanner obj = new Scanner(System.in);
		System.out.println("TABLE of 2");
		ob.print_Multiple();
		System.out.println("Calculator:  "+ob.calculator());
		System.out.println("Marks of students: ");
		ob.marks();
		
	}
}
