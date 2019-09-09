package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModel
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModel   {
  private Object corporateTaxAdvisoryFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest() {
    return corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest(String corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest) {
    this.corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest = corporateTaxAdvisoryFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord(CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord = corporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis(CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis;
  }


}

