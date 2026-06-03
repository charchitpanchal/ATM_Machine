
import java.util.*;


public class ATM_Balance {

    float balance;
    int PIN = 5794;

    public void checkpin(){
        System.out.println("Enter your PIN");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter the valid PIN");
        }
    }

    //menu method
    public void menu(){
        System.out.println("Enter the chioce");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            check_balance();
        }
        else if(opt == 2){
            withdraw_money();
        }
        else if(opt == 3){
            deposit_money();
        }
        else if (opt == 4){
            return;
        }
        else{
            System.out.println("Enter the valid chioce");
        }

    }
    public void check_balance(){
        System.out.println("Balance: "+balance);
        menu();

    }
    public void withdraw_money(){
        System.out.println("enter the amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        if(withdraw > balance){
            System.out.println("Insufficent balance");
        }
        else{
            balance-=withdraw;
            System.out.println("Balance after the withdrawal is :" +balance);
        }
        menu();

    }

    public void deposit_money(){
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float depoist = sc.nextFloat();
        balance+=depoist;
        System.out.println("Balance after the depost is: "+balance);
        menu();
    }

    public static void main(String[] args) {
        ATM_Balance obj = new ATM_Balance();
        obj.checkpin();
    }

}
