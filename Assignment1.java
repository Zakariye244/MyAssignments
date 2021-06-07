package allassignment;

import java.util.Scanner;

public class Assignment1 {
    Scanner bk=new Scanner(System.in);
    int a,b;
    public void input(){
        System.out.println("Sogali tiro:");
         a=bk.nextInt();
        b=a;
    }
    public void display(){
        int sum=a*b;
        System.out.println("the Squere is:"+sum);
    }
}
