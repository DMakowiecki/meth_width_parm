import java.util.Scanner;

class math{
    double a;
    double b;
    Scanner scan= new Scanner(System.in);
     void math_sum(double a , double b){
         System.out.print("Podaj a: ");
           a=scan.nextDouble();
         System.out.print("Podaj b: ");
           b=scan.nextDouble();
         double vol= a+b;
        System.out.println(vol);
    }
    void  math_quo(double a , double b){
        System.out.print("Podaj a: ");
           a=scan.nextDouble();
         System.out.print("Podaj b: ");
           b=scan.nextDouble();
         double vol= a/b;
        System.out.println(vol);
    }
    void math_sub(double a , double b){
        System.out.print("Podaj a: ");
           a=scan.nextDouble();
         System.out.print("Podaj b: ");
           b=scan.nextDouble();
         double vol= a*b;
        System.out.println(vol);
    }
    void math_pro(double a , double b){
       System.out.print("Podaj a: ");
           a=scan.nextDouble();
         System.out.print("Podaj b: ");
           b=scan.nextDouble();
         double vol= a-b;
        System.out.println(vol);
    }
}

public class meth {
    public static void main(String[] args) {
        math mathe= new math();
        System.out.println(" Choose calc program : ");
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();

        switch (ch){
            case "+":
                mathe.math_sum(mathe.a,mathe.b);
                break;
            case "-":
                mathe.math_pro(mathe.a,mathe.b);
                break;
            case "*":
                mathe.math_sub(mathe.a,mathe.b);
                break;
            case "/":
                mathe.math_quo(mathe.a,mathe.b);
                break;
        }




    }
}

