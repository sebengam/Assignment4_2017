package Assignment4.violationOfTheCoreSoftwarePrinciples.Open_Closed;

/**
 * Created by Tank on 3/27/2017.
 */
public class ClaimApprovalManager {
    public ClaimApprovalManager() {
    }
    public void processHealthClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.print("ClaimApprovalManager: Valid Claim. Currently processing claim for approval...\n");
        }
    }
    public void processVehicleClaim(HealthInsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.print("ClaimApprovalManager: Invalid claim. Can't process Vehicle Claim under HealthInsuranceSurveyor...\n");
        }
    }
}
