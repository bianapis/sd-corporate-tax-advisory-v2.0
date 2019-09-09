package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModel   {
  private CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord(CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord corporateTaxAdvisoryFulfillmentArrangementInstanceRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Tax Advisory Fulfillment Arrangement instance retrieve service call 
   * @return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference() {
    return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference(String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference = corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord(Object corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord = corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse() {
    return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse(String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse) {
    this.corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse = corporateTaxAdvisoryFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord(CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis(CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
  }


}

