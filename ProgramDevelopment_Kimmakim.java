/**
 * @(#)ProgramDevelopment.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ProgramDevelopment_Kimmakim {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        System.out.println("Please select a number that indicates what the program will perform:");
        System.out.println("1. Display the factors of the number.");
        System.out.println("2. Display whether a number is odd or even.");
        System.out.println("3. Display whther a number is a Perfect Number or Not.");
        System.out.println("4. Display the elements of an array in ascending order.");
        System.out.println("5. Display the sum of odd elements in the array.");

        System.out.print("Enter the number of your choice: ");
        int task=input.nextInt();


        if(task==1) {
            System.out.print("Enter a number: ");
            int number=input.nextInt();
            System.out.print("The factors of "+number+" are ");

                for (int i = 1; i <= (number/2); i++)
                {
                    if (number % i == 0)
                    {
                        System.out.print(i + " ");
                    }
                }
                System.out.print(number);
        }

        else if(task==2){
            System.out.print("Enter a number: ");
            int number=input.nextInt();
            System.out.print("The number "+number+" is ");

                if(number%2==0) {
                    System.out.print("Even");
                }
                else {
                    System.out.print("Odd");
                }

        }

        else if(task==3){

            System.out.print("Enter a number: ");
            int number=input.nextInt();
            System.out.print(number+" is a: ");

            int sum=0;

            for(int i=1; i<number; i++) {
                if(number%i==0){
                    sum=sum+i;
                }
            }
            if(sum==number) {
                System.out.print("Perfect Number");
            }
            else {
                System.out.print("Not Perfect");
            }                
        }

        else if(task==4){

            System.out.print("Array size: ");
            int number=input.nextInt();
            System.out.print("The array elements: ");

            Random rando = new Random(); 
            int[] arr = new int[number];

            for (int i = 0; i<arr.length ; i++) {
                arr[i] = rando.nextInt(9); 
                System.out.print(arr[i]+" "); 
            }
            Arrays.sort(arr);
            System.out.print("\nAscending order: ");
            for (int i=0;i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }

        else if(task==5){
            System.out.println("The array elements: ");

            Random rando = new Random(); 
            int[][] arr = new int[5][5];

            for(int i=0;i<5;i++) {
                for(int j=0;j<5;j++) {
                    arr[i][j] = rando.nextInt(9);
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
            }
            int sum=0;
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++) {
                    if (arr[i][j]%2!=0){
                        sum=sum+arr[i][j];
                    }
                }
            }
            System.out.println("The sum of odd elements in the aray is: "+sum);
        }






    }
}

    

