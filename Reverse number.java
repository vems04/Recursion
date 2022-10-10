import java.util.*;
public class Recursion {
    public static int  vems(int x){
 if(x<10){
    return x%10;
}
 System.out.print(x%10);
        return vems(x/10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(vems(x));
    }
}
