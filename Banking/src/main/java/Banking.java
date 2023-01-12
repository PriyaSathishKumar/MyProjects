import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Banking {
     int accountID;
     int currentBal;
     String accStatus;

     /**
      * public Banking(int accountID,int currentBal,String accStatus) {
      * this.accountID= accountID;
      * this.currentBal=currentBal;
      * this.accStatus=accStatus;
      * }
      */


     public static class CustomerDetails {
          int custID;
          int accountID;
          String firstName;
          String lastName;
          int age;
          int panCardNo;
          //private String address;
     }
}
