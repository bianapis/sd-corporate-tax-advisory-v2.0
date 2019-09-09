package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementRetrieveInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceReportRecord   {
  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReportType = null;

  private String corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportReference() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportReference(String corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference = corporateTaxAdvisoryFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters
  **/

  public String getCorporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters() {
    return corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters;
  }

  public void setCorporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters(String corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters) {
    this.corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters = corporateTaxAdvisoryFulfillmentArrangementInstanceReportParameters;
  }


}

