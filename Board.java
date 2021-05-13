import java.util.Arrays;

public class Board {
    public void change(char arr[],int b, int c) {
        char[] a =new char[9];
        Arrays.fill(a, ' ');
        if(b<10) {

            System.out.println(" " + arr[1] + "  |" + " " + arr[2] + "  " + "| " + arr[3] + " ");

            System.out.println("----|----|----");
            System.out.println(" " + arr[4] + "  |" + " " + arr[5] + "  " + "| " + arr[6] + " ");

            System.out.println("----|----|----");
            System.out.println(" " + arr[7] + "  |" + " " + arr[8] + "  " + "| " + arr[9] + " ");
        }
        else
        {
            System.out.println(" " + arr[1] + "  |" + " " + arr[2] + "  " + "| " + arr[3] + " ");

            System.out.println("----|----|----");
            System.out.println(" " + arr[4] + "  |" + " " + arr[5] + "  " + "| " + arr[6] + " ");

            System.out.println("----|----|----");
            System.out.println(" " + arr[7] + "  |" + " " + arr[8] + "  " + "| " + arr[9] + " ");
        }
    }
public static boolean check(char a[],String p1,String p2){
        if(a[1]=='1'  && a[2]=='1' && a[3]=='1' ||a[4]=='1'  && a[5]=='1' && a[6]=='1' || a[7]=='1'  && a[8]=='1' && a[9]=='1' ||
                a[1]=='1'  && a[4]=='1' && a[7]=='1' ||a[2]=='1'  && a[5]=='1' && a[8]=='1' || a[3]=='1'  && a[6]=='1' && a[9]=='1' ||
                a[1]=='1'  && a[5]=='1' && a[9]=='1' ||a[3]=='1'  && a[5]=='1' && a[7]=='1') {
            System.out.println(p1 +" won !");
            return true;
        }
    else if(a[1]=='0'  && a[2]=='0' && a[3]=='0' ||a[4]=='0'  && a[5]=='0' && a[6]=='0' || a[7]=='0'  && a[8]=='0' && a[9]=='0' ||
            a[1]=='0'  && a[4]=='0' && a[7]=='0' ||a[2]=='0'  && a[5]=='0' && a[8]=='0' || a[3]=='0'  && a[6]=='0' && a[9]=='0' ||
            a[1]=='0'  && a[5]=='0' && a[9]=='0' ||a[3]=='0'  && a[5]=='0' && a[7]=='0') {
        System.out.println(p2 + " won !");
        return true;
    }
else
    return false;
}

}
