package pkg1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Gpa {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int totalSemesterPoints=0;
		int totalSemsterCredits=0;
		boolean moreSemester=false;
		
		do {
			int totalPoints=0;
			int totalCredits=0;
			boolean moreSub = false;
						
			do {
				System.out.println("Enter a credit");
				int credit = sc.nextInt();
					 
				boolean validGrade = true;
				int equalValue=0;
		
				do {
					validGrade=true;
					System.out.println("Enter a grade");
					String grade = sc.next();
					
					if(grade.equalsIgnoreCase("O")) {
						equalValue=10;
					}
					else if(grade.equalsIgnoreCase("A+")) {
						equalValue=9;
					}
					else if(grade.equalsIgnoreCase("A")) {
						equalValue=8;
					}
					else if(grade.equalsIgnoreCase("B+")) {
						equalValue=7;
					}
					else if(grade.equalsIgnoreCase("B")) {
						equalValue=6;
					}
					else if(grade.equalsIgnoreCase("C")) {
						equalValue=5;
					}
					else {
						System.out.println("Enter a valid grade!");
						validGrade=false;
					}
				}while(!validGrade);
				
					int points = credit * equalValue;
					
					totalPoints += points;
					totalCredits += credit;
					
					System.out.println("Do you want to proceed with next subject?(Y/N)");
					String nextSub = sc.next();
					moreSub = nextSub.equalsIgnoreCase("Y");
					
			}while(moreSub);
			
			Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);	
			System.out.println("Your GPA for this semester: "+ df.format(gpa));
						
			totalSemesterPoints += totalPoints;
			totalSemsterCredits += totalCredits;
			
			System.out.println("Do you want enter another semester?(Y/N)");
			String semester=sc.next();
			moreSemester=semester.equalsIgnoreCase("Y");
			
		}while(moreSemester);
		
		Double cgpa = Double.valueOf(totalSemesterPoints) / Double.valueOf(totalSemsterCredits);
		System.out.println("Your CGPA is: "+ df.format(cgpa));
		sc.close();
	}
}
