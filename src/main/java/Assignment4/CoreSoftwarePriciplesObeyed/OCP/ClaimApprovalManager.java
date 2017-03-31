package Assignment4.CoreSoftwarePriciplesObeyed.OCP;

/**
 * Created by Tank on 3/27/2017.
 */
public class ClaimApprovalManager {
    public ClaimApprovalManager() {
    }
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....\n");
        }
    }
}
