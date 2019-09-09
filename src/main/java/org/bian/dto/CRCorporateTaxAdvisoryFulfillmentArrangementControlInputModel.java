package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModelCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModel   {
  private String corporateTaxAdvisoryServicingSessionReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementControlActionTaskRecord = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModelCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest corporateTaxAdvisoryFulfillmentArrangementControlActionRequest = null;


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
   * Get corporateTaxAdvisoryFulfillmentArrangementControlActionRequest
   * @return corporateTaxAdvisoryFulfillmentArrangementControlActionRequest
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModelCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest getCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest() {
    return corporateTaxAdvisoryFulfillmentArrangementControlActionRequest;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest(CRCorporateTaxAdvisoryFulfillmentArrangementControlInputModelCorporateTaxAdvisoryFulfillmentArrangementControlActionRequest corporateTaxAdvisoryFulfillmentArrangementControlActionRequest) {
    this.corporateTaxAdvisoryFulfillmentArrangementControlActionRequest = corporateTaxAdvisoryFulfillmentArrangementControlActionRequest;
  }


}

