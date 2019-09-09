package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord
 */
public class BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecord   {
  private String productServiceReference = null;

  private BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask = null;


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

  public BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQTaxOptimizationInitiateInputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask) {
    this.specialistSupportTask = specialistSupportTask;
  }


}

