/*Problem 5: Payment System using Interface
Problem Statement
Design a Java application for processing different types of payments. Create an interface Payment
containing:
void makePayment(double amount);
void paymentDetails();
Create the following classes implementing the interface:
        1. CreditCardPayment
2. UPIPayment
3. CashPayment
        CreditCardPayment
Store:
         Card Number
 Card Holder Name
Display the payment details and amount.
UPIPayment
Store:
         UPI ID
 User Name
Display the payment details and amount.
CashPayment
Store:
         Customer Name
Display the payment details and amount.
The program should allow the user to select a payment method and process the payment.
        Example Output
----- PAYMENT SYSTEM -----
        1. Credit Card
2. UPI
3. Cash
Enter Choice: 2
Enter UPI ID: rahul@upi

Enter Amount: 2500
Payment Successful!
Payment Mode : UPI
UPI ID : rahul@upi
Amount : Rs. 2500
Concepts Practiced
 Interface
 Implementation of interface
 Classes and objects
 Constructors
 Methods
 Method overriding
 Runtime polymorphism*/



import java.io.*;
interface Payment{

    void makePayment(double amount);

    void paymentDetails();

}


class CreditCardPayment implements Payment{
    int cardNo;
    String name;
    double value;

    CreditCardPayment(int cardNo, String name){
        this.cardNo = cardNo;
        this.name = name;
    }

    public void makePayment(double amount){
        this.value = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails(){

        System.out.println("Payment Mode : Credit Card");
        System.out.println("Card Number: " + cardNo);
        System.out.println("Card Holder Name: "+ name);

        System.out.println("Amount: "+value);
    }
}





class UPIPayment implements Payment{
    String UPI_Id;
    String name;
    double value;

    UPIPayment(String UPI_Id, String name){
        this.UPI_Id = UPI_Id;
        this.name = name;
    }

    public void makePayment(double amount){
        this.value = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails(){
        System.out.println("Payment Mode : UPI");
        System.out.println("UPI ID: " + UPI_Id);
        System.out.println("Name: " + name);
        System.out.println("Amount: "+value);
    }
}




class CashPayment implements Payment{
    String name;
    double value;


    CashPayment(String name){
        this.name = name;
    }

    public void makePayment(double amount){
        this.value = amount;
        System.out.println("Payment Successful!");
    }

    public void paymentDetails(){
        System.out.println("Payment Mode : Cash");
        System.out.println("Name : " + name);
        System.out.println("Amount: "+value);
    }
}

public class A2Ques5 {
    public static void main(String[] args) throws IOException {
        System.out.println("----- PAYMENT SYSTEM -----");
        System.out.println("1.Credit card");
        System.out.println("2.UPI");
        System.out.println("3.Cash Payment");
        System.out.println("Enter Choice: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Enter Your Card Number: ");
                int cardNo=Integer.parseInt(br.readLine());
                System.out.println("Enter Your Name: ");
                String name=br.readLine();
                System.out.println("Enter Your Amount: ");
                double amount1=Double.parseDouble(br.readLine());

                CreditCardPayment obj = new CreditCardPayment(cardNo , name);

                obj.makePayment(amount1);
                obj.paymentDetails();
                break;


            case 2:
                System.out.println("Enter your UPI ID: ");
                String UPI_Id=br.readLine();
                System.out.println("Enter your Name: ");
                String Newname = br.readLine();
                System.out.println("Enter your Amount: ");
                double newamount=Double.parseDouble(br.readLine());

                UPIPayment obj2 = new UPIPayment(UPI_Id , Newname);
                obj2.makePayment(newamount);
                obj2.paymentDetails();
                break;

            case 3:
                System.out.println("Enter your Name: ");
                String name3 = br.readLine();
                System.out.println("Enter your Amount: ");
                double newamount1=Double.parseDouble(br.readLine());

                CashPayment obj3 = new CashPayment(name3);
                obj3.makePayment(newamount1);
                obj3.paymentDetails();

                break;


            default:
                System.out.println("Invalid Choice");
        }
    }
}
