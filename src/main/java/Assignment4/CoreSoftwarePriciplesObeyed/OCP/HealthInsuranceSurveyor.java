package Assignment4.CoreSoftwarePriciplesObeyed.OCP;

/**
 * Created by Tank on 3/27/2017.
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    public HealthInsuranceSurveyor() {
    }

    @Override
    public boolean isValidClaim() {
        System.out.print("HealthInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
