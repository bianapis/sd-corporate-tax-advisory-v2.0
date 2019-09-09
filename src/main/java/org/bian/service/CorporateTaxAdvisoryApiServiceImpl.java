/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateTaxAdvisoryApiServiceImpl implements CorporateTaxAdvisoryApiService {

	public SDCorporateTaxAdvisoryActivateOutputModel activate(SDCorporateTaxAdvisoryActivateInputModel request){
		return JsonReader.read("activate-SDCorporateTaxAdvisoryActivateOutputModel.json",new TypeReference<SDCorporateTaxAdvisoryActivateOutputModel>(){});
	}
	
	public SDCorporateTaxAdvisoryConfigureOutputModel configure(String sdReferenceId, SDCorporateTaxAdvisoryConfigureInputModel request){
		return JsonReader.read("configure-SDCorporateTaxAdvisoryConfigureOutputModel.json",new TypeReference<SDCorporateTaxAdvisoryConfigureOutputModel>(){});
	}
	
	public CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceFeesExchangeOutputModel.json",new TypeReference<BQServiceFeesExchangeOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCorporateTaxAdvisoryFeedbackOutputModel feedback(String sdReferenceId, SDCorporateTaxAdvisoryFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorporateTaxAdvisoryFeedbackOutputModel.json",new TypeReference<SDCorporateTaxAdvisoryFeedbackOutputModel>(){});
	}
	
	public CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQTaxOptimizationInitiateOutputModel initiateTaxoptimization(String sdReferenceId, String crReferenceId, BQTaxOptimizationInitiateInputModel request){
		return JsonReader.read("initiate-BQTaxOptimizationInitiateOutputModel.json",new TypeReference<BQTaxOptimizationInitiateOutputModel>(){});
	}
	
	public BQTaxOptimizationRequestOutputModel requestTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationRequestInputModel request){
		return JsonReader.read("request-BQTaxOptimizationRequestOutputModel.json",new TypeReference<BQTaxOptimizationRequestOutputModel>(){});
	}
	
	public CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModel request){
		return JsonReader.read("request-CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel.json",new TypeReference<CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel>(){});
	}
	
	public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public BQTaxOptimizationRetrieveOutputModel retrieveTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTaxOptimizationRetrieveOutputModel.json",new TypeReference<BQTaxOptimizationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorporateTaxAdvisoryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorporateTaxAdvisoryRetrieveOutputModel.json",new TypeReference<SDCorporateTaxAdvisoryRetrieveOutputModel>(){});
	}
	
	public CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request){
		return JsonReader.read("update-BQServiceFeesUpdateOutputModel.json",new TypeReference<BQServiceFeesUpdateOutputModel>(){});
	}
	
	public BQTaxOptimizationUpdateOutputModel updateTaxoptimization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTaxOptimizationUpdateInputModel request){
		return JsonReader.read("update-BQTaxOptimizationUpdateOutputModel.json",new TypeReference<BQTaxOptimizationUpdateOutputModel>(){});
	}
	
}
