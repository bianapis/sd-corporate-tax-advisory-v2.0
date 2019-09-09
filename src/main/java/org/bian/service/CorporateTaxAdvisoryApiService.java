/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateTaxAdvisoryApiService {

	SDCorporateTaxAdvisoryActivateOutputModel activate(SDCorporateTaxAdvisoryActivateInputModel request);
	
	SDCorporateTaxAdvisoryConfigureOutputModel configure(String sdReferenceId, SDCorporateTaxAdvisoryConfigureInputModel request);
	
	CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModel request);
	
	BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDCorporateTaxAdvisoryFeedbackOutputModel feedback(String sdReferenceId, SDCorporateTaxAdvisoryFeedbackInputModel request);
	
	CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQTaxOptimizationInitiateOutputModel initiateTaxoptimization(String sdReferenceId, String crReferenceId, BQTaxOptimizationInitiateInputModel request);
	
	BQTaxOptimizationRequestOutputModel requestTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationRequestInputModel request);
	
	CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModel request);
	
	CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTaxOptimizationRetrieveOutputModel retrieveTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorporateTaxAdvisoryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModel request);
	
	BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request);
	
	BQTaxOptimizationUpdateOutputModel updateTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationUpdateInputModel request);
	
}
