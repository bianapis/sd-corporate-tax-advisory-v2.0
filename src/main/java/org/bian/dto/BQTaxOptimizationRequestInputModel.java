package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationRequestInputModel
 */
public class BQTaxOptimizationRequestInputModel   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReference = null;

  private String taxOptimizationInstanceReference = null;

  private BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord = null;

  private Object taxOptimizationRequestActionTaskRecord = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Tax Advisory Fulfillment Arrangement instance 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReference() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReference(String corporateTaxAdvisoryFulfillmentArrangementInstanceReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReference = corporateTaxAdvisoryFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Tax Optimization instance 
   * @return taxOptimizationInstanceReference
  **/

  public String getTaxOptimizationInstanceReference() {
    return taxOptimizationInstanceReference;
  }

  public void setTaxOptimizationInstanceReference(String taxOptimizationInstanceReference) {
    this.taxOptimizationInstanceReference = taxOptimizationInstanceReference;
  }


  /**
   * Get taxOptimizationInstanceRecord
   * @return taxOptimizationInstanceRecord
  **/

  public BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord getTaxOptimizationInstanceRecord() {
    return taxOptimizationInstanceRecord;
  }

  public void setTaxOptimizationInstanceRecord(BQTaxOptimizationRequestInputModelTaxOptimizationInstanceRecord taxOptimizationInstanceRecord) {
    this.taxOptimizationInstanceRecord = taxOptimizationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return taxOptimizationRequestActionTaskRecord
  **/

  public Object getTaxOptimizationRequestActionTaskRecord() {
    return taxOptimizationRequestActionTaskRecord;
  }

  public void setTaxOptimizationRequestActionTaskRecord(Object taxOptimizationRequestActionTaskRecord) {
    this.taxOptimizationRequestActionTaskRecord = taxOptimizationRequestActionTaskRecord;
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

