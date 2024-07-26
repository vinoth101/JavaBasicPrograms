import java.util.*;
public class stringoccurace {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string of alphabets: ");
                String t= scanner.nextLine();

                t = t.toLowerCase();


                int[] an = new int[26];

                for (char c : t.toCharArray()) {
                    if (c >= 'a' && c <= 'z') {
                        an[c - 'a']++;
                    }
                }
                char a = ' ';
                int max = 0;
                for (int i = 0; i < an.length; i++) {
                    if (an[i] > max) {
                        max = an[i];
                        a = (char) ('a' + i);
                    }
                }
                System.out.println("Occurrences of each alphabet:");
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.println(c + ": " + an[c - 'a']);
                }
                System.out.println("Alphabet with maximum occurrence: " + max + " (" + max + " occurrences)");
            }
        }


