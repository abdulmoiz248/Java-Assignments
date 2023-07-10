public class MedicalService implements BillableItem {
    Double durationinminutes;
    Double rateperminutes;


    public MedicalService(Double durationinminutes, Double rateperminutes) {
        this.durationinminutes = durationinminutes;
        this.rateperminutes = rateperminutes;
    }

    public MedicalService() {
    }
    public double getpayableamount()
    {
        return this.durationinminutes*rateperminutes;
    }
}
