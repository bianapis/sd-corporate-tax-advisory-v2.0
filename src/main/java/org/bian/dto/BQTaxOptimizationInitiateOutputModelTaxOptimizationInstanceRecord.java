package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecordSpecialistSupportTask;

import javax.validation.Valid;
  
/**
 * BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord
 */
public class BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecord   {
  private BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask = null;

  private String taxOptimizationGuidanceAdviceResult = null;


  /**
   * Get specialistSupportTask
   * @return specialistSupportTask
  **/

  public BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecordSpecialistSupportTask getSpecialistSupportTask() {
    return specialistSupportTask;
  }

  public void setSpecialistSupportTask(BQTaxOptimizationInitiateOutputModelTaxOptimizationInstanceRecordSpecialistSupportTask specialistSupportTask) {
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

