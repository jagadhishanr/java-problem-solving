// You are building a Transaction Monitoring System for 
// a financial platform. The system processes N transactions.
// Each transaction contains the following 4 parameters:
// Sender (string)
// Receiver (string)
// Timestamp (integer, in seconds)
// Amount (integer)
// 1. Duplicate Transaction Check
// If any transaction has the same sender AND receiver 
// as a previous transaction, print:
// Error: Duplicate Transaction. Terminate the program.

// 2. Fraud Detection Rule
// If the difference between the timestamps of any two consecutive
// transactions is greater than 60 seconds, print:
// Fraud Detected and terminate the program.

// 3. Valid Case
// If all transactions are valid, print: All Transactions Valid
// Input Format
// First line: Integer N (number of transactions)
// Next N lines:
// Each line contains:

import java.util.*;
public class TransactionMonitoring{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Set<String> seen = new HashSet<>();
        int PrevTimestamp = -1;
        for(int i=0; i< n; i++){
            String sender = scan.nextLine();
            String Receiver = scan.nextLine();
            int TimeStamp = scan.nextInt();
            int amount = scan.nextInt();
            scan.nextLine();

            String key = sender + "-" + Receiver;
            if(seen.contains(key)){
                System.out.println("Error: Duplicate transaction");
                return;
            } 
            seen.add(key);

            if(TimeStamp - PrevTimestamp > 60){
                System.out.println("Fraud detected");
                return;
            }
            PrevTimestamp = TimeStamp;
        }
        System.out.println("All Transactions are Valid");
    }
}