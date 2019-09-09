package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveOutputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData(String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType(String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport(Object corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReport;
  }


}

