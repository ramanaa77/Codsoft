import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Subject: ");
        int NoOfSubject = sc.nextInt();
        int[] marks = new int[NoOfSubject];
        int total=0;
        System.out.println("Enter the marks:");
        for(int i=0;i<NoOfSubject;i++) {
            marks[i]=sc.nextInt();
            total += marks[i];
        }
        int avgtot = total/NoOfSubject;
        char grade;
        if(avgtot>=90) {
            grade = 'A';
        }else if(avgtot>=70) {
            grade = 'B';
        }else if(avgtot>=50) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("Total mark: "+ total);
        System.out.println("Average Percentage: "+ avgtot);
        System.out.printf("Grade is '%c'", grade);
        sc.close();
    }
}
