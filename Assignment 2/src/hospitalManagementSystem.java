import java.util.Scanner;

public class hospitalManagementSystem {
   static  Invoice invoice=new Invoice();
    public static void main(String[] args) {

          display();
          selection();

    }
    public static void display()
    {
        System.out.println("1: Add Consultation ");
        System.out.println("2: Add Laboratory Test ");
        System.out.println("3: Add Prescription Drug");
        System.out.println("4: Generate Invoice");
        System.out.println("5: Exit");
    }
    public static void selection()
    {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        x=input.nextInt();
        while (x!=5)
        {
            if(x==1)
            {
                Double durationinminutes;
                Double rateperminutes;
                System.out.print("Enter Duration in Minutes:");
                durationinminutes=input.nextDouble();
                System.out.print("Enter Rate per Minutes:");
                rateperminutes=input.nextDouble();
            ConsultantService consultantService=new ConsultantService(durationinminutes,rateperminutes);
            invoice.addbillableitem(consultantService);
            } else if (x==2) {
                double testcode;
                System.out.println("Enter Test Code: ");
                testcode=input.nextDouble();
               LabortaryTest labortaryTest=new LabortaryTest(testcode);
               invoice.addbillableitem(labortaryTest);
            } else if (x==3) {
                int qunatity;
                double unitprice;
                System.out.println("Enter Qunatity: ");
                qunatity=input.nextInt();
                System.out.println("Enter Unit Price:");
                unitprice=input.nextDouble();
                PrescriptionDrug prescriptionDrug=new PrescriptionDrug(qunatity,unitprice);
                invoice.addbillableitem(prescriptionDrug);
            } else if (x==4) {
             invoice.getTotalbillableamount();
            } else if (x==5) {
                break;
            }
            else System.out.println("Invalid Enter Again..!!");
            display();
            System.out.print("Enter Your Choice: ");
            x=input.nextInt();
        }
        System.out.println("Returned..!!");
        invoice.getTotalbillableamount();
    }
}

