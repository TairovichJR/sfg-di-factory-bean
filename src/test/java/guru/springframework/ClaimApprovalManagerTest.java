package guru.springframework;

import org.junit.Test;

import guru.springframework.solid.ClaimApprovalManager;
import guru.springframework.solid.HealthInsuranceSurveyor;
import guru.springframework.solid.VehicleInsuranceSurveyor;

import static org.junit.Assert.*;

public class ClaimApprovalManagerTest {

	
	@Test	
	public void testProcessClaim() {
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		
		ClaimApprovalManager claim1 = new ClaimApprovalManager();
		claim1.processClaim(healthInsuranceSurveyor);
		
		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager clam2 = new ClaimApprovalManager();
		clam2.processClaim(vehicleInsuranceSurveyor);
	}
	
	
	
}



