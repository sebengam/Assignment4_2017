package Assignment4.violationOfCoreSoftwarePrinciples.Open_Closed;

import Assignment4.violationOfTheCoreSoftwarePrinciples.Open_Closed.ClaimApprovalManager;
import Assignment4.violationOfTheCoreSoftwarePrinciples.Open_Closed.HealthInsuranceSurveyor;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Tank on 3/27/2017.
 */
public class HealthInsuranceClaimTest {
    HealthInsuranceSurveyor surveyor;
    ClaimApprovalManager manager;

    @Before
    public void setUp() throws Exception {
        surveyor = new HealthInsuranceSurveyor();
        manager = new ClaimApprovalManager();

    }

    @Test
    public void testClaim() throws Exception {
        manager.processHealthClaim(surveyor);
        manager.processVehicleClaim(surveyor);
    }
}
