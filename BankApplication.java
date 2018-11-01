import java.util.Scanner;

public class BankApplication { 

    public static void main(String[] args) {
    BankAccount object= new BankAccount("Achyuthanand","17SCS0010");
        object.show();
        
    }
}

class BankAccount {

int balance;
int previousTransaction;
String costumerName;
String costumerId;

BankAccount(String cname, String cid) {
costumerName=cname;
costumerId=cid;
    
}

void deposit(int amount) {
if(amount != 0) {
balance= balance + amount;
previousTransaction= amount;
}
}

void withdraw(int amount) {
if(amount!= 0) {
balance= balance - amount;
previousTransaction= -amount; 
}
}
void getpreviousTransaction() {
if (previousTransaction > 0) {
System.out.println("deposit : "+ previousTransaction);
}
else if(previousTransaction < 0){
    System.out.println("withdraw : "+Math.abs(previousTransaction));
}
else {
System.out.println("transaction failed!!!!");
}

}
void show() {
char option='\0';
Scanner scanner= new Scanner(System.in);
System.out.println("welcome :" + costumerName);
System.out.println("yourId :" + costumerId);
System.out.println("\n");
System.out.println("A.CheckBalance");
System.out.println("B.Deposit");
System.out.println("C.Withdraw");
System.out.println("D.PreviousTransaction");
System.out.println("E.Exit");

do {
    System.out.println("=======================================");
System.out.println("Enter your option");
System.out.println("========================================");
option= scanner.next().charAt(0);
System.out.println("\n");

switch (option){
case 'A':
System.out.println("--------------------------------------------");
System.out.println("balance="+ balance);
System.out.println("--------------------------------------------");
System.out.println("\n");
break;

case 'B' :
System.out.println("--------------------------------------------");
System.out.println("Enter deposit amount");
System.out.println("--------------------------------------------");
int amount= scanner.nextInt();
deposit(amount);
System.out.println("\n");
break;

case 'C' :
System.out.println("-------------------------------------------");
System.out.println("Enter Withdraw amount");
System.out.println("-------------------------------------------");
int amount1= scanner.nextInt();
withdraw(amount1);
System.out.println("\n");
break;

case 'D' :
System.out.println("-------------------------------------------");
getpreviousTransaction();
System.out.println("-------------------------------------------");
System.out.println("\n");
break;

case 'E' :
System.out.println("*******************************************");
break;

default :
System.out.println("Invalid option!!!! please enter again");
break;

}

} while (option!= 'E'); 
System.out.println("Thank you for using our services");


}
}