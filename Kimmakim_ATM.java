/**
 * @(#)ATM.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
import java.util.Scanner;
public class Kimmakim_ATM {

        static double balance=0;
        public static void Withdraw(double amount) {

            if(amount<=balance) {
                balance=balance-amount;
                System.out.println("Collect your money");
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }

        public static void Deposit(double amount) {
            balance=balance+amount;
        }

        public static void Transfer(double amount) {

            if(amount<=balance) {
                balance=balance-amount;
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }

        public static void BalanceCheck() {
            System.out.println("Balance:"+balance);
        }
            
        public static void main(String[] args) {

            Scanner with=new Scanner(System.in);
            int choose,decide;
            
            while(true) {
                System.out.println("  ");
                System.out.println(" ATM ");
                System.out.print("1.Withdraw\n2.Deposit\n3.Transfer\n4.Check Balance\n5.EXIT\n");
                System.out.print("Choose operation: ");
                choose=with.nextInt();

                    if(choose==1) {
                        System.out.print("Enter amount to be withdrawn: ");
                        double amount=with.nextDouble();
                        Withdraw(amount);

                        System.out.print("Check balance? (Y/N): ");
                        decide=with.next().charAt(0);

                        if(decide=='Y'){
                            BalanceCheck();
                            decide=0;
                        }
                    }

                    else if(choose==2) {
                        System.out.print("Enter amount you want to deposit: ");
                        double amount=with.nextDouble();
                        Deposit(amount);

                        System.out.print("Check balance? (Y/N): ");
                        decide=with.next().charAt(0);

                        if(decide=='Y') {
                            BalanceCheck();
                            decide=0;
                        }
                    
                    }

                    else if(choose==3) {
                        System.out.print("Enter account number: ");
                        double number=with.nextDouble();
                        System.out.print("Enter amount to be transfered: ");
                        double amount=with.nextDouble();
                        Transfer(amount);

                        System.out.print("Check balance? (Y/N): ");
                        decide=with.next().charAt(0);
                        if(decide=='Y'){
                            BalanceCheck();
                            decide=0;
                        }
                    
                    }
                    
                    else if(choose==4) {
                        BalanceCheck();
                    }

                    else {
                        break;
                    }
        }
    }
}
    

