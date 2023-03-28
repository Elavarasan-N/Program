import java.util.Scanner;

class Addition
{
static int a,b,c;

static void input()
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter two numbers");
a = scanner.nextInt();
b = scanner.nextInt();
}

static void add()
{
c = a + b;
}

static void result()
{
System.out.println("The sum is :"+c);
}
public static void main(String args[])
{
input();
add();
result();

}
}