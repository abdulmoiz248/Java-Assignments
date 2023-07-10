import java.util.ArrayList;
import java.util.List;

public class Invoice {

    BillableItem list[]= new BillableItem[100];

    public void getTotalbillableamount()
    {
        int sum=0;
        for(int i=0;i<100;i++)
        {
            if(list[i]!=null)
           sum+= list[i].getpayableamount();
        }
        System.out.println("Sum="+sum);
    }
    public void addbillableitem(BillableItem item)
    {
        for(int i=0;i<100;i++)
        {
            if(list[i]==null)
            {
                list[i]=item;
                break;
            }
        }
    }
}
