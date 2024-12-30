package bank;

//Customer class
public class Customer {
   private String firstName;
   private String lastName;
   private String ssn;


   //Constructor
   Customer(){
   }

   //setter and getter method
   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   public String getLastName() {
       return lastName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   public String getSsn() {
       return ssn;
   }
  
   public void setSsn(String ssn) {
       if((ssn.charAt(3) != '-')||(ssn.charAt(6) != '-')|| ssn.length()!=11)
           System.out.println("Invalid SSN.");
       else
           this.ssn = ssn;
   }
}
