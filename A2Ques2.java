//Problem 2: Bank Account using Constructors
//Problem Statement
//Develop a Java program to create a simple bank account system. Create a class BankAccount
//containing:
//         accountNumber
// accountHolderName
// balance
//Implement the following:
//        1. Create a default constructor that initializes the account with default values.
//2. Create a parameterized constructor to initialize account details.
//        3. Create a method deposit() to deposit money.
//
//        4. Create a method withdraw() to withdraw money.
//        5. Create a method displayAccount() to display account details.
//        6. Do not allow withdrawal if the requested amount is greater than the available balance.
//Create at least two objects using different constructors.
//Example
//Account Number: 101
//Account Holder: Rahul
//Balance: 25000
//Deposit: 5000
//Withdraw: 3000
//Updated Balance: 27000
//Concepts Practiced
// Class and Object
// Default Constructor
// Parameterized Constructor
// Constructor Overloading
// Methods
// Encapsulation basics


class BankAccount{
    int accountNumber;
    String accountHolderName;
    int balance;

    BankAccount(){
        accountNumber = 0;
        accountHolderName = "User";
        balance = 0;
    }

    BankAccount(int accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount1){
        balance = balance + amount1;
        System.out.println("Rs."+amount1+" deposited.");
    }

    public void withdraw(int amount2){
        if(balance >= amount2){
            balance = balance - amount2;
            System.out.println("Rs."+amount2+" withdrawn.");
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccount(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Total Balance(Updated): "+balance);
    }


}
public class A2Ques2 {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(101,"Rahul",25000);

        user.deposit(5000);
        user.withdraw(3000);
        user.displayAccount();
    }
}
