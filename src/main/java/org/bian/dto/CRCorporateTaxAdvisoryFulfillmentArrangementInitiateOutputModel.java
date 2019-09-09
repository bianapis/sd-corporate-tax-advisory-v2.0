package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModel   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementInitiateActionRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceStatus = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Tax Advisory Fulfillment Arrangement instance 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReference() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReference(String corporateTaxAdvisoryFulfillmentArrangementInstanceReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReference = corporateTaxAdvisoryFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInitiateActionReference() {
    return corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInitiateActionReference(String corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference = corporateTaxAdvisoryFulfillmentArrangementInitiateActionReference;
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

  public CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementInitiateOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


}

