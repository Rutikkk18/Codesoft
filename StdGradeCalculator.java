// program to calculate the grades of student on basis of their marks



import java.util.Scanner;

public class StdGradeCalculator 
{
    public static void main(String[] args)
	{
        Scanner r = new Scanner(System.in);

        // No. of subjects
        System.out.println("Enter the number of subjects:");
        int numSubjects =r.nextInt();

        // to store marks of subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        //  marks for each subject obtained by student
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = r.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = totalMarks / (double) numSubjects;

        //  grade calculation on basis of marks
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // overall results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
