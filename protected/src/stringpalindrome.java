public class stringpalindrome {
    public static void main(String[] args) {
        String s="java",y="";
        for (int i=0;i<s.length();i++){
            y=s.charAt(i)+y;
        }
if(s==y){
    System.out.println("palindrome");
}
else {
    System.out.println("not a palindrome");
}
    }
}
