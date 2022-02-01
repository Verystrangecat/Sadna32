import java.util.Scanner;

public class Q2 {
    static int n1,n2;
    static int s,b, operation;
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean answer=true;
        while(answer)
        {
            System.out.println("What difference do you want to have? Enter the smallest and the biggest number");
             s= input.nextInt();
             b= input.nextInt();
            ten_exe();
            System.out.println("do you want more exercises? type true or false");
            answer=input.nextBoolean();
        }
        System.out.println("bye bye");
    }
    public static void ten_exe()
    {
        int result,i;
        for(i=1; i<=10; i++)
        {
            choose();
            result=calculate(operation);
            one_exe(result,operation);
        }
    }
    public static void choose()
    {
        System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");
        operation=input.nextInt();
        while(operation!=1 && operation!= 2 && operation!=3)
        {
            System.out.println("choose operation 1- for + , 2 -for - , 3 -for *");
            operation=input.nextInt();
        }

    }
    public static int calculate(int operation)
    {
        n1=random(s,b);
        n2=random(s,b);
        int result;
        while (n1<n2){
            n1=random(s,b);
            n2=random(s,b);
        }
        if(operation==1)
            result=n1+n2;
        else
        if(operation==2)
            result=n1-n2;
        else
            result=n1*n2;
        return result;
    }

    public static void one_exe(int result,int operation)
    {
        int answer;
        char op;
        if(operation==1)
            op='+';
        else
        if(operation==2)
            op='-';
        else
            op='*';
        System.out.println(""+n1+op+n2+"=?");
        answer=input.nextInt();
        if(answer==result)
            System.out.println("excellent");
        else {
            System.out.println("wrong. You have one more chance");
            System.out.println((""+n1+op+n2+"=?"));
            answer=input.nextInt();
            if(answer==result)
                System.out.println("excellent");
            else
                System.out.println("wrong.");}

    }
    public static int random (int min, int max){
        int random=(int)(Math.random()*(max-min+1)+min);
        return random;

    }
}
