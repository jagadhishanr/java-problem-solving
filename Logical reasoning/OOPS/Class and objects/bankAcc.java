import java.util.*;
class BankAccount{
    long accountNumber;
    double balance;

    BankAccount(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Your amount is succesfully deposited");
        }
        else{
            System.out.println("Insufficient deposition");
            System.out.println("Please try again!");
        }
    }

        void withdraw(double amount){
            if(amount < 0){
                System.out.println("Insufficient balance");
            }
            else if(amount > balance){
                System.out.println("Insufficient balance");
                System.out.println("Cheack the balance!");
            }
            else{
                balance -= amount;
                System.out.println("Amount withdrawn successfully");
            }
        }

            void displayBalance(){
                System.out.println("your's Balance amount is:" + " " + balance);
            }
}

            public class bankAcc{
                public static void main(String [] args){
                    Scanner scan = new Scanner(System.in);

                    System.out.println("Enter the Account Number");
                    long accNumber = scan.nextLong();

                    System.out.println("Enter the Initial Balance");
                    double initialBalance = scan.nextDouble();
BankAccount account = new BankAccount(accNumber , initialBalance);

int choice;
do{
    System.out.println("Enter and choose your choice");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. DisplayBalance");
    System.out.println("4. Exit");
    System.out.println("Enter your choice");
    choice = scan.nextInt();

    switch(choice){
        case 1:
        System.out.println("Enter your deposit Amount");
        double depositAmount = scan.nextDouble();
        account.deposit(depositAmount);
        break;

        case 2:
        System.out.println("Enter your withdrawn amount");
        double withdrawAmount = scan.nextDouble();
        account.withdraw(withdrawAmount);
        break;

        case 3:
        account.displayBalance();
        break;

        case 4:
            System.out.println("Thank you! for contacting our bank service!");
            break;

            default:
                System.out.println("Invalid choice");
    }
}while(choice != 4);

scan.close();

                }
            }