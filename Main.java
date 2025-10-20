import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any numbers! (Enter -1 to stop)");
    double input = 0;
    double sum = 1;

    while(input != -1)
    {
      input = scan.nextDouble();
      sum += input;
    }

    System.out.printf("Your sum is: %f%n%n", sum);


    System.out.printf("How many numbers do you wish to input my young one?%n");
    int numWish = scan.nextInt();
    int counter = 0;
    int max = Integer.MIN_VALUE;

    while(counter < numWish)
    {
        int currentNum = scan.nextInt();
        if(max < currentNum)
        {
          max = currentNum;
        }

      counter++;
    }

    System.out.printf("The largest number is: %d%n%n", max);

    System.out.println("Give me a word!");
    String word = scan.next();
    String newWord = "";

    counter = 0;
    int index = 1;
    while(counter < word.length())
    {
      if(index == 3)
      {
        index = 1;
      }
      else
      {
        newWord += word.substring(counter, counter + 1);
        index++;
      }

      counter++;
    }
    System.out.printf("Your new word is %s%n", newWord);


    scan.close();
  }
}
