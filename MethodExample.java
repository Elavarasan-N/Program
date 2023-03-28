class MethodExample
{
private static void displayMessage(int number)  // user defined method
{
System.out.print(number);
System.out.println("Start of displayMessage method");
System.out.println("Method Definition");
System.out.println("End of display message method");
}
public static void main(String args[])  // free defined method
{
int number=200; // local variable
System.out.println("Start of Main Program");
displayMessage(number); // Calling Method
System.out.println("End of Main program");
}
}