import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(System.in);
    //The statement Scanner sc = new Scanner(System.in); is what makes a Scanner object and saves its location into the variable sc.
    System.out.println("Enter a number: ");
    // users input
    int num = sc.nextInt();
    System.out.println("User's number is: " + num);
    // Notice the syntax: sc.nextInt() . We used the variable sc to use the object, and then we used dot notation to access and call its method. If the program is running, it will pause at this moment and wait until the user enters a value into the console. 
    // close scanner object
    //sc.close();

   // Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = scan.nextInt();
    System.out.println(" the number you entered was:" + number);

    String word = scan.next();
    System.out.println("The word you entered was"+ word);
  }
}