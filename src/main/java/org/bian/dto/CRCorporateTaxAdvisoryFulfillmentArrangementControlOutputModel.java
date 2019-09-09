package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementControlOutputModel   {
  private String corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Tax Advisory Fulfillment Arrangement instance control processing service call 
   * @return corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference() {
    return corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference(String corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference = corporateTaxAdvisoryFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord(Object corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord = corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return corporateTaxAdvisoryFulfillmentArrangementControlActionResponse
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementControlActionResponse() {
    return corporateTaxAdvisoryFulfillmentArrangementControlActionResponse;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementControlActionResponse(String corporateTaxAdvisoryFulfillmentArrangementControlActionResponse) {
    this.corporateTaxAdvisoryFulfillmentArrangementControlActionResponse = corporateTaxAdvisoryFulfillmentArrangementControlActionResponse;
  }


}

