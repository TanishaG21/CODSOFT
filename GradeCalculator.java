import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of subjects: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		int total = 0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks(between 0 and 100)\n");
			System.out.println("Enter marks for subject " + (i+1) + "- ");
			marks[i] = sc.nextInt();
			total = total + marks[i];
		}
		double average = (double) total/n;
		String grade;
		
		if (average>=90){
			grade = "A+";
		}
		else if (average>=80){
			grade = "A";
		}
		else if (average>=70){
			grade = "B";
		}
		else if (average>=60){
			grade = "C";
		}
		else if (average>=50){
			grade = "D";
		}
		else if (average>=40){
			grade = "P";
		}
		else {
			grade = "F";
		}
		
		System.out.println("\nTotal Marks are: " + total);
		System.out.println("\nAverage is: " + average);
		System.out.println("\nGrade is: " + grade);
		sc.close();
	}
}
