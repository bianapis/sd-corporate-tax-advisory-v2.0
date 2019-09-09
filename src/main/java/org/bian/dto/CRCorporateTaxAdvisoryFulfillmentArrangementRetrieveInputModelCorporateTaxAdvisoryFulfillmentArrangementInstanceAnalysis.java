package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysis   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReportType = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference(String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters(String corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters = corporateTaxAdvisoryFulfillmentArrangementInstanceAnalysisParameters;
  }


}

