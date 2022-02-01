import java.util.Scanner;

public class Q4 {
    static int n=0;
    static boolean answer=true;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        n= input.nextInt();
        answer=magic(n);
        System.out.println(answer);

    }
    static public boolean magic(int n){
        int n1, n2;
        while (n>0 && answer){
            n1=n%10;
            n2=(n/10)%10;
            if (n1==n2)
                answer=true;
            else
                answer=false;
            n=n/100;}
            return answer;


        }
    }
