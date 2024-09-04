import java.util.*;

public class StonePaperScissors {

    public static int computerMove(){
        return (int)((Math.random()*3)+1);
    }

    private static void displayResult(int C,int P){
        if(C>P){
            System.out.println("COMPUTER WINS, You Lose!");
        }
        else if(C<P){
            System.out.println("YOU WIN, Computer Loses!");
        }
        else{
            System.out.println("It's a DRAW between YOU and COMPUTER!");
        }
    }

    private static void displayCurrentMove(int Cm,int Pm){
        System.out.print("Your Move: ");
        switch(Pm){
            case 1:
                System.out.print("STONE");
            break;
            case 2:
                System.out.print("PAPER");
            break;
            case 3:
                System.out.print("SCISSOR");
            break;
            default:
                System.out.println("WRONG MOVE");
        }
        System.out.println();
        System.out.print("Computer's Move: ");
        switch(Cm){
            case 1:
                System.out.print("STONE");
            break;
            case 2:
                System.out.print("PAPER");
            break;
            case 3:
                System.out.print("SCISSOR");
            break;
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("WELCOME TO THE STONE PAPER SCISSORS GAME!\n\n");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of Games to decide Winner:");
        int n;
        n=in.nextInt();
        int Pmove,Cmove,Ppoints=0,Cpoints=0;
        System.out.println("Stone -> 1\nPaper -> 2\nScissor -> 3");
        for(int i=0;i<n;i++){
            System.out.println("MOVE NUMBER "+ (i+1) +" :");
            Pmove=in.nextInt();
            Cmove=computerMove();

            displayCurrentMove(Cmove,Pmove);

            switch(Pmove){
                case 1:
                    if(Cmove==2){
                        Cpoints++;
                    }
                    else if(Cmove==3){
                        Ppoints++;
                    }
                break;
                case 2:
                    if(Cmove==1){
                        Ppoints++;
                    }
                    else if(Cmove==3){
                        Cpoints++;
                    }
                break;
                case 3:
                    if(Cmove==1){
                        Cpoints++;
                    }
                    else if(Cmove==2){
                        Ppoints++;
                    }
                break;
                default:
                    System.out.println("Retry with a valid move:");
                    i=i-1;
            }

            System.out.println("\n\nCOMPUTER'S POINT: " + Cpoints + " YOUR POINT: " + Ppoints);
        }

        displayResult(Cpoints,Ppoints);

        in.close();
    }
}
