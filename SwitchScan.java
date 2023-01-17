import java.util.Scanner;

class SwitchScan{
  public void scannerSwitchExample(){
    Scanner scan = new Scanner(System.in);
    System.out.println("what is the time of day?");

    String input = scan.next();
    switch (input.toLowerCase()){
      case "morning":
        System.out.println("Time for breakfast!");
        break;
      case "afternoon":
        System.out.println("A nice day for a walk!");
        break;
      case "evening":
        System.out.println("Its about bed time!");
        break;
      default:
        System.out.println("Sorry, I didn't understand that, but have a nice day anyway!");
          
    }
    
  }
}