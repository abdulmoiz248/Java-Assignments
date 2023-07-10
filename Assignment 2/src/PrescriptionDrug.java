public class PrescriptionDrug implements BillableItem{
    int quantity;
    double unitprice;

    public PrescriptionDrug(int quantity, double unitprice) {
        this.quantity = quantity;
        this.unitprice = unitprice;
    }
    public double getpayableamount()
    {
        return quantity*unitprice;
    }
}
