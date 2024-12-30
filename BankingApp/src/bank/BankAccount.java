package bank;

//BankAccount class
public abstract class BankAccount {

   protected float balance;
    protected Customer customer;
   protected long accountNumber;
  
   public float getBalance() {
       return balance;
   }

   public void setBalance(float balance) {
       this.balance = balance;
   }

   public Customer getCustomer() {
       return customer;
   }

   public void setCustomer(Customer customer) {
       this.customer = customer;
   }

   public long getAccountNumber() {
       return accountNumber;
   }

   public void setAccountNumber(long accountNumber) {
       this.accountNumber = accountNumber;
   }


   //Constructors
   BankAccount (){
   }

   BankAccount(String firstName, String lastName, String ssn,float balance) {
       customer = new Customer();
       customer.setFirstName(firstName);
       customer.setLastName(lastName);
       customer.setSsn(ssn);
       this.balance = balance;
   }

   public void deposit(float amount) {
       balance = balance + amount;
       System.out.println(customer.getFirstName() + " " + customer.getLastName() + " deposited $" + amount + ". Current Balance $" + balance);

   }

   public void withdraw(float amount) {
       if (balance >= amount) {
           balance = balance - amount;
           System.out.println(customer.getFirstName() + " " + customer.getLastName() + " withdrew $" + amount + ". Current Balance $" + balance);
       }
       if (balance < amount) {
           System.out.println("Unable to withdraw " + amount + " for " + customer.getFirstName() + " " + customer.getLastName() + " due to insufficient funds.");
       }
   }
  
   public abstract float applyInterest();


}
