import java.util.Random;
import java.util.Scanner;

class LoopScan{
  public void scannerLoopExample(){
Random i = new Random();
    int randNum = i.nextInt(11);
    Scanner scan = new Scanner(System.in);
    System.out.println("Guess a number between 0 and 10");
    int guess = scan.nextInt();

    while (guess != randNum){
      if (guess > randNum){
        System.out.println("Too High");
      }
      if (guess < randNum){
        System.out.println("Too low");
      }
      System.out.println("Guess Again");
      guess = scan.nextInt();
    }
    System.out.println("Nice job!");
  }
}