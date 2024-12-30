package bank;

//CheckingAccount class
public class CheckingAccount extends BankAccount {

   public CheckingAccount() {
   }

   public CheckingAccount(String firstName, String lastName, String ssn, float balance) {
       super(firstName, lastName, ssn, balance);
       System.out.println("Successfully created account for " + firstName + " " + lastName + " " + accountNumber());
   }

   public float applyInterest () {
       balance += ((balance - 10000)*2)/100;
       return balance;
   }

   float checkBalance() {

       System.out.println(customer.getFirstName() + " " + customer.getLastName() + ", Balance $" + balance);

       return balance;
   }


   long accountNumber() {
       long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
       return accountNumber;
   }
}