/**
 * import java.util.Scanner;
 * import lombok.Getter;
 * import lombok.Setter;
 * import lombok.AllArgsConstructor;
 * import lombok.NoArgsConstructor;
 *
 * @Setter
 * @Getter
 * @AllArgsConstructor
 * @NoArgsConstructor
 */

public class StudentResult {
    public static void main(String[] args) {
        Admin a1 = new Admin("Priya", 32);
        Admin a2 = new Admin("Iniya", 80);
        Admin[] a3 = new Admin[2];
        a3[0] = a1;
        a3[1] = a2;
        //Scanner getscanner=new Scanner(System.in);
        //System.out.println(" the Student Name is"+a1.getStudentName());
        //String a.studentName=getscanner.nextLine();
        //System.out.println(" the Student Mark is"+a1.getStudentMark());
        //int a.studentMark=getscanner.nextInt();
        for (int i = 0; i < a3.length; i++) {

            if (a3[i].getStudentMark() >= 35) {
                System.out.println("Result=Pass");
            }
            else {
                System.out.println("Result=Fail");
            }
            System.out.println(" the Student Name is" + a3[i].getStudentName() +
                    " \nthe Student Mark is" + a3[i].getStudentMark());
        }
    }
}
