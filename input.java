import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);//This statement creates a Scanner object and saves it’s location into the variable sc. We can then use sc to use the object.

    System.out.println("Enter a number");
    int number = scan.nextInt();
    System.out.println(" the number you entered was:" + number);

    String word = scan.next();
    System.out.println("The word you entered was"+ word);
  }
}