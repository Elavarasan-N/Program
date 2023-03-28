import java.util.Scanner;

class Arithmetic
{
static int a,b,c;

static void get()
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first number : ");
a = scanner.nextInt();
System.out.println("Enter the second number : ");
b = scanner.nextInt();
}
public static void main(String args[])
{
get();
System.out.println("The First Number is "+a);
System.out.println("The Second Number is "+b);
System.out.println(a+"+"+b+"="+(a+b));
System.out.println(a+"-"+b+"="+(a-b));
System.out.println(a+"*"+b+"="+(a*b));
System.out.println(a+"/"+b+"="+(a/b));
}
}