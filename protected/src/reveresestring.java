public class reveresestring {
    public static void main(String[] args) {
        String s="practice code";
        String f[]=s.split(" ");
        for (int i=f.length-1;i>=0;i--){
            System.out.print(f[i]+" ");
        }
    }
}
