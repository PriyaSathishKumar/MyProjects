import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] categoryList=new String[]{"1.Clothing","2.Footware","3.Decor","4.Jewelry"};
        String[] clothList = new String[]{"1.Ethnic", "2.Western", "3.Winter", "4.Summer"};
        String[] footWare=new String[]{"1.Sandals","2.Boots","3.Shoes","4.PartyShoes"};
        String[] decor=new String[]{"1.PhotoFrame","2.Vase","3.Plants","4.Idol/Statue"};
        String[] jewel=new String[]{"1.Earrings","2.Necklace","3.Bangles","4.Long Chain"};
        System.out.println("Select the category");
        int opt=scan.nextInt();
        for (int i = 0; i < categoryList.length; i++) {
                if(opt==1) {
                System.out.println(clothList[i]);
            }
              else if(opt==2) {
               System.out.println(footWare[i]);
            }
            else if(opt==3) {
                System.out.println(decor[i]);
                }
                else if(opt==4) {
                    System.out.println(jewel[i]);
                }
                else {
                    System.out.println("This is not valid option");
                }
            //int c = scan.nextInt();
        }

        // f=scan.nextInt();

        //int d=scan.nextInt();

        //int j=scan.nextInt();

    }
}