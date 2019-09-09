package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord
 */
public class CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecord   {
  private String customerReference = null;

  private Object customerPositionStateInstanceRecord = null;

  private String bankBranchLocationReference = null;

  private String employeeBusinessUnitReference = null;

  private String documentDirectoryEntryInstanceReference = null;

  private CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer receiving the financial advice 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The overall customer position state tracking and analysis, combining different analytical measures including credit, collateral and product/service cash flows 
   * @return customerPositionStateInstanceRecord
  **/

  public Object getCustomerPositionStateInstanceRecord() {
    return customerPositionStateInstanceRecord;
  }

  public void setCustomerPositionStateInstanceRecord(Object customerPositionStateInstanceRecord) {
    this.customerPositionStateInstanceRecord = customerPositionStateInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the customer account/relationship for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit and or employee reference to the source of the financial advice 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents such as disclosures and acceptance records 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorporateTaxAdvisoryFulfillmentArrangementInitiateInputModelCorporateTaxAdvisoryFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

