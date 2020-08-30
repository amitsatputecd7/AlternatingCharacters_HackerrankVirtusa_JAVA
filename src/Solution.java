import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int testc=in.nextInt();
        ArrayList<String> str=new ArrayList<>();
        in.nextLine();
        for (int i=0;i<testc;i++) str.add(in.nextLine());
        for (Integer x:getChanges(str))System.out.println(x);
    }
    public static ArrayList<Integer> getChanges(ArrayList<String> str)
    {
        ArrayList<Integer> chang=new ArrayList<>();
        for (int i=0;i<str.size();i++)  chang.add(getChange(str.get(i)));
        return chang;
    }
    public static int getChange(String s)
    {
        int count=0;
        for (int i=0;i<s.length()-1;i++) if (s.charAt(i)==s.charAt(i+1)) count++;
        return count;
    }
}
