public class MainLombok {
        public static void main(String[] args) {
            SampleLombok b= new SampleLombok(1001,5000,"Active");
            System.out.println("Account Id="+b.getAccountID()+"\nCurrent Balance="+b.getCurrentBal()+
                    "\nAccount Status="+b.getAccStatus());
            //System.out.println(b.getAccountID());
        }
    }


