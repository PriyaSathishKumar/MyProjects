public class Account {
    public static void main(String[] args) {
        int newBal=0;
        Banking b= new Banking(1001,5000,"Active");
        //Banking.CustomerDetails c= new Banking.CustomerDetails();
        System.out.println("Account Id="+b.getAccountID()+"\nCurrent Balance="+b.getCurrentBal()+
               "\nAccount Status="+b.getAccStatus());
        //System.out.println("Enter the Amount for deposit");
        //scanner
        //System.out.println("Customer ID="++);
        //System.out.println(b.get);
        //System.out.println(b.getAccountID());
    }
}
