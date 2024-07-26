import java.util.Arrays;
class longestcommandprefix{
    public static void main(String[] args){
    String[] s = {"geeksforgeeks", "ge", "geek", "geezer"};
    int size = s.length;
        Arrays.sort(s);
    int end = Math.min(s[0].length(), s[size - 1].length());
    int i = 0;
        while (i < end && s[0].charAt(i) == s[size - 1].charAt(i))
    i++;

    String e = s[0].substring(0, i);
        System.out.println("The longest Common Prefix is : " + e);
}
}

