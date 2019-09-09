package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord
 */
public class BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecord   {
  private String productServiceReference = null;

  private BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask = null;

  private String taxOptimizationGuidanceAdviceResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the corporate tax advisory service (used to access guidance materials) 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * Get specialistSupportTask
   * @return specialistSupportTask
  **/

  public BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQTaxOptimizationUpdateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask) {
    this.specialistSupportTask = specialistSupportTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Summary recommendations arising from the advice that is added to the consolidated tax advice record 
   * @return taxOptimizationGuidanceAdviceResult
  **/

  public String getTaxOptimizationGuidanceAdviceResult() {
    return taxOptimizationGuidanceAdviceResult;
  }

  public void setTaxOptimizationGuidanceAdviceResult(String taxOptimizationGuidanceAdviceResult) {
    this.taxOptimizationGuidanceAdviceResult = taxOptimizationGuidanceAdviceResult;
  }


}

