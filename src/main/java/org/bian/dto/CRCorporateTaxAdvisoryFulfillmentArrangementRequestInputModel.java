package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModel   {
  private String corporateTaxAdvisoryServicingSessionReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReference = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementRequestActionTaskRecord = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

