import java.util.*;
public class IdentifyCorrectOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str= str.replace("-","=");
        str= str.replace("+","=");
        str= str.replace("*","=");
        str= str.replace("/","=");
        String[] s=str.split("=");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        if(a+b==c)
        {
            System.out.println("+");
        }
        if(a-b==c)
        {
            System.out.println("-");
        }
        if(a*b==c)
        {
            System.out.println("*");
        }
        if(a/b==c)
        {
            System.out.println("/");
        }

    }
}
/*Input:100/50=2
ouput:/
*/
