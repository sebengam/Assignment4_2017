package Assignment4.CoreSoftwarePriciplesObeyed.OCP;

/**
 * Created by Tank on 3/27/2017.
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.print("VehicleInsuranceSurveyor: Validating health insurance claim...\n");
        return true;
    }
}
