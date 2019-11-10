import java.util.Scanner;

//输入两串字符串，在第一个字符串中删除第二个字符串都所有的字符
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //被删除的字符串
        String s1=input.nextLine();
        //要删除的字符
        String s2=input.nextLine();
        StringBuilder sb=new StringBuilder();
        //sb来装一个结果字符串
        char[] a=new char[256];
        //数组下标就为0到255
        //ASCII码有128个
        for(int i=0;i<s2.length();i++){
            //char可以作为数字下标，因为char可以转化为int，
            //实际数组下标是s2.charAt(i)所对应的的码值
            //也能区分字符，把所有要删的字符的值置为1，
            // 让被删字符串统一化处理，给他们一个同一的标志，只要看见就删，
            a[s2.charAt(i)]=1;
        }
        for(int i=0;i<=s1.length()-1;i++){
            if(a[s1.charAt(i)]!=1){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
