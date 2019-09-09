package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementUpdateOutputModel   {
  private CRCorporateTaxAdvisoryFulfillmentArrangementUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference() {
    return corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference(String corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference = corporateTaxAdvisoryFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

