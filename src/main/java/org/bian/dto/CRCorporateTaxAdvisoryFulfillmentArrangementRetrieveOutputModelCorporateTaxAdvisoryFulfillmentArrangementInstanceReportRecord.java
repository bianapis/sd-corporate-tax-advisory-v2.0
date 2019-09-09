package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReportData = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReportType = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportData
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportData() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportData;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportData(String corporateTaxAdvisoryFulfillmentArrangementInstanceReportData) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportData = corporateTaxAdvisoryFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportType
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportType() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportType;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportType(String corporateTaxAdvisoryFulfillmentArrangementInstanceReportType) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportType = corporateTaxAdvisoryFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReport
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementInstanceReport() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReport;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReport(Object corporateTaxAdvisoryFulfillmentArrangementInstanceReport) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReport = corporateTaxAdvisoryFulfillmentArrangementInstanceReport;
  }


}

