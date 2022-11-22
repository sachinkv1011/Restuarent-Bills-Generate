import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriceList price =new PriceList();
        ArrayList<GenerateBills> bills1 = new ArrayList<GenerateBills>();
        int choice=1;
        int choice1=1;
        while(choice!=0){
            System.out.println("1.generate bills");
            System.out.println("2.view all transaction");
            System.out.println("0.exit");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    GenerateBills bill = null;
                    bill = new GenerateBills();
                    choice1=1;
                    while (choice1 != 0) {
                        price.listItems();
                        choice1 = sc.nextInt();
                        bill.addItems(choice1);
                    }
                    bills1.add(bill);
                    Main.viewEmployees(bill);
                    break;
                case 2:
                    Main.viewAllBills(bills1);
                    break;

            }

        }


    }



    public static void viewEmployees(GenerateBills bill) {
        System.out.println(bill.bills);
    }
    private static void viewAllBills(ArrayList<GenerateBills> bills1) {
        System.out.println(bills1.size());
        for (int i = 0; i < bills1.size(); i++) {
            Main.viewEmployees(bills1.get(i));
        }
    }
}