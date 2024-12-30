package bank;

//SavingAccount class
public class SavingAccount extends BankAccount {

   public SavingAccount() {
   }

   public SavingAccount(String firstName, String lastName, String ssn, float balance) {
       super(firstName, lastName, ssn, balance);
       System.out.println("Successfully created account for " + firstName + " " + lastName + " " + accountNumber);
       System.out.println(firstName + " " + lastName + ", Balance $" + balance);
   }

   public float applyInterest () {
       balance += ((balance - 10000) * 5)/100;
       return balance;
   }

   long accountNumber() {
       long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
       return accountNumber;
   }

   float checkBalance() {
       System.out.println(customer.getFirstName() + " " + customer.getLastName() + ", Balance $" + balance);
       return balance;
   }
}

