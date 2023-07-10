import java.util.ArrayList;
import java.util.List;

public class CardiologyConsultation extends ConsultantService{
    List<String> additionaltest=new ArrayList<String>();

    public CardiologyConsultation(Double durationinminutes, Double rateperminutes,List<String> additionaltest) {
        this.additionaltest = additionaltest;
        this.durationinminutes = durationinminutes;
        this.rateperminutes = rateperminutes;
    }
}
