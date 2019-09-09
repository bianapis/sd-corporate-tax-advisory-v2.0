package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModel   {
  private CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementRequestOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Tax Advisory Fulfillment Arrangement instance request service call 
   * @return corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference() {
    return corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference(String corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference = corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord(Object corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord = corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

