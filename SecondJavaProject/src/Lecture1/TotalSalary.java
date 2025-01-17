package Lecture1;
import java.util.Scanner;

public class TotalSalary {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        String grade = sc.next();
        float hra = basic * 20.0f / 100.0f;
        float da = basic * 50.0f / 100.0f;
        float pf = basic * 11.0f / 100.0f;
        int totalSalary;
        if(grade.equals("A")) {
            totalSalary = (int)(basic + hra + da + 1700 - pf);
        } else if(grade.equals("B")) {
            totalSalary = (int)(basic + hra + da + 1500 - pf);
        } else {
            totalSalary = (int)(basic + hra + da + 1300 - pf);
        }
        System.out.println(totalSalary);
        System.out.println(basic + " " + grade);
    }

}
