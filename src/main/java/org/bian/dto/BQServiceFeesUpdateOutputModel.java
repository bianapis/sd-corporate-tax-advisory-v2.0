package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateInputModelServiceFeesInstanceRecord;
import org.bian.dto.BQServiceFeesUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServiceFeesUpdateOutputModel
 */
public class BQServiceFeesUpdateOutputModel   {
  private BQServiceFeesUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private BQServiceFeesInitiateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord = null;

  private String serviceFeesUpdateActionTaskReference = null;

  private Object serviceFeesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
  **/

  public BQServiceFeesUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(BQServiceFeesUpdateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get serviceFeesInstanceRecord
   * @return serviceFeesInstanceRecord
  **/

  public BQServiceFeesInitiateInputModelServiceFeesInstanceRecord getServiceFeesInstanceRecord() {
    return serviceFeesInstanceRecord;
  }

  public void setServiceFeesInstanceRecord(BQServiceFeesInitiateInputModelServiceFeesInstanceRecord serviceFeesInstanceRecord) {
    this.serviceFeesInstanceRecord = serviceFeesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return serviceFeesUpdateActionTaskReference
  **/

  public String getServiceFeesUpdateActionTaskReference() {
    return serviceFeesUpdateActionTaskReference;
  }

  public void setServiceFeesUpdateActionTaskReference(String serviceFeesUpdateActionTaskReference) {
    this.serviceFeesUpdateActionTaskReference = serviceFeesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return serviceFeesUpdateActionTaskRecord
  **/

  public Object getServiceFeesUpdateActionTaskRecord() {
    return serviceFeesUpdateActionTaskRecord;
  }

  public void setServiceFeesUpdateActionTaskRecord(Object serviceFeesUpdateActionTaskRecord) {
    this.serviceFeesUpdateActionTaskRecord = serviceFeesUpdateActionTaskRecord;
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

