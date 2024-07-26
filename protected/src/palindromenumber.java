public class palindromenumber {
    public static void main(String[] args) {
        int n=123,r,sum=0,m=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(m==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
