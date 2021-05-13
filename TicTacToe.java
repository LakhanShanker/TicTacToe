import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe extends Board {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Tic Tac Toe Game");
        System.out.println(" ");
        System.out.println("Instructions -");
        System.out.println("If any player makes any of the entire row or column or diagonal he won the match");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Enter Player 1 Name");
        String player1=sc.nextLine();
        System.out.println("Enter Player 2 Name");
        String player2=sc.nextLine();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("  1  |" + "  2  " + "| 3  ");

        System.out.println("-----|-----|-----");
        System.out.println("  4  |" + "  5  " + "| 6 ");

        System.out.println("-----|-----|-----");
        System.out.println("  7  |" + "  8  " + "| 9 ");


        Board  b=new Board();
        System.out.println("Choose your number accordingly to win the game");
        char a[]=new char [10];
        Arrays.fill(a,' ');
        for(int i=0;i<9;i++)
        {
            if(i%2==0) {
                System.out.println("Player 1 :" + player1);
                byte p1 = sc.nextByte();
                boolean flag=true;
                if(a[p1]=='1' || a[p1]=='0')
                    flag=false;
                boolean st = p1<=0 || p1>=10 || !flag ;
                while(st) {
                    System.out.println("Error Enter valid choice");
                    p1 = sc.nextByte();
                    flag=true;
                    if(a[p1]=='1' || a[p1]=='0')
                        flag=false;
                    st = p1<=0 || p1>=10 || !flag;
                }
                a[p1] = '1';
                b.change(a,p1,10);
            }else{
                System.out.println("Player 2 :" + player2);
                byte p2=sc.nextByte();
                boolean flag=true;
                if(a[p2]=='0' || a[p2]=='1')
                    flag=false;
                boolean st = p2<=0 || p2>=10 || !flag;
                while(st) {
                    System.out.println("Error Enter valid choice");
                    p2 = sc.nextByte();
                    flag=true;
                    if(a[p2]=='1' || a[p2]=='0')
                        flag=false;
                    st = p2<=0 || p2>=10 || !flag;
                }
                a[p2]= '0';
                b.change(a,10,p2);
            }
            if(b.check(a,player1,player2)){
                break;
            }
            if(i==8 && !b.check(a,player1,player2)){
                System.out.println("Draw");
            }
        }
    }
}
