public class LabortaryTest implements BillableItem{

double testcode;

    public LabortaryTest(double testcode) {
        this.testcode = testcode;
    }

    public double getpayableamount()
    {
       // return durationinminutes*rateperminutes;
        return this.testcode;
    }
}
