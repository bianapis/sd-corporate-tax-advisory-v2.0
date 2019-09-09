package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModel   {
  private String corporateTaxAdvisoryServicingSessionReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceStatus = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateTaxAdvisoryServicingSessionReference
  **/

  public String getCorporateTaxAdvisoryServicingSessionReference() {
    return corporateTaxAdvisoryServicingSessionReference;
  }

  public void setCorporateTaxAdvisoryServicingSessionReference(String corporateTaxAdvisoryServicingSessionReference) {
    this.corporateTaxAdvisoryServicingSessionReference = corporateTaxAdvisoryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord(Object corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord = corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Tax Advisory Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceStatus
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceStatus() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceStatus;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceStatus(String corporateTaxAdvisoryFulfillmentArrangementInstanceStatus) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceStatus = corporateTaxAdvisoryFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


}

