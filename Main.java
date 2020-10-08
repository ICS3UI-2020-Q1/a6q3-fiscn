import java.util.Scanner;

/**
 * Write a program that will populate a 10 element array (put values into an array) with integers. Once the array is full, have your program find the largest value inside of that array.
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scaner for user input 
    Scanner input = new Scanner(System.in); 

    //ask the user to enter in the values 
    System.out.println("Please enter in 10 integers to put into the array");

    //create array for integers 
    int[] numB = new int[10]; 

    //use for loop to get all the values for arrays 
    for(int i = 0; i < numB.length; i++){
      numB[i] = input.nextInt(); 
    }  

    //create variable for number the user wants to find 
    int largeNum = input.nextInt();

    //create for statement to find and print the number the user is looking for 
    for(int i = 0; i < numB.length; i++){
      if(numB[i] > largeNum){
        largeNum = numB[i];
      }
    } 

    System.out.println("The leargest number is " + largeNum);
    

    



    
  }
}
