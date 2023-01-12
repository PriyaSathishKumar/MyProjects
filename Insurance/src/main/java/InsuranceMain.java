public class InsuranceMain {
    public static void main(String[] args) {
        int monthDue;
        Insurance i = new Insurance("Priya", 34, "LIC", "Jeevan Anand", 5000);
        System.out.println("Policy Holder Name=" + i.getPolicyHolderName() + "\nAge=" + i.getAge() + "\nPolicy Provider=" +
                i.getPolicyProvider() + "\nPolicy type=" + i.getPolicyType() + "\nPremium=" + i.getDue());
        int temp=i.getDue();
        if (i.getDue() <= 10000) {
            temp=10000-temp;
            //i.setDue()=temp;
            System.out.println("This Month Due is="+temp);
        }
        else
        {
            System.out.println("NoDue");
        }
    }
}
