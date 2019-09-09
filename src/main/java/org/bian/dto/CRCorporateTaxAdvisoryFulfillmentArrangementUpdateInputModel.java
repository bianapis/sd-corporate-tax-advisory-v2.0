package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModel   {
  private String corporateTaxAdvisoryServicingSessionReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReference = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord(Object corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord = corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

