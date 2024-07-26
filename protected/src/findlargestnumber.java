import java.util.Scanner;

public class findlargestnumber
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []arr=new int[10];
        for (int i =0; i <10; i++) {
            arr[i] = s.nextInt();
        }
            int max = arr[0];
         for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max){
                    max = arr[j];
                }
          }
         System.out.println("Largest in given number is " + max);
        }
    }

