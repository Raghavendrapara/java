/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.models.V1LabelSelector;
import io.kubernetes.client.models.V1PersistentVolumeClaim;
import io.kubernetes.client.models.V1PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 */
@ApiModel(description = "A StatefulSetSpec is the specification of a StatefulSet.")

public class V1beta1StatefulSetSpec {
  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("template")
  private V1PodTemplateSpec template = null;

  @SerializedName("volumeClaimTemplates")
  private List<V1PersistentVolumeClaim> volumeClaimTemplates = new ArrayList<V1PersistentVolumeClaim>();

  public V1beta1StatefulSetSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(example = "null", value = "Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public V1beta1StatefulSetSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors
   * @return selector
  **/
  @ApiModelProperty(example = "null", value = "Selector is a label query over pods that should match the replica count. If empty, defaulted to labels on the pod template. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1beta1StatefulSetSpec serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * ServiceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.
   * @return serviceName
  **/
  @ApiModelProperty(example = "null", required = true, value = "ServiceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \"pod-specific-string\" is managed by the StatefulSet controller.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1beta1StatefulSetSpec template(V1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
   * @return template
  **/
  @ApiModelProperty(example = "null", required = true, value = "Template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1beta1StatefulSetSpec volumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public V1beta1StatefulSetSpec addVolumeClaimTemplatesItem(V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * VolumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
   * @return volumeClaimTemplates
  **/
  @ApiModelProperty(example = "null", value = "VolumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.")
  public List<V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }

  public void setVolumeClaimTemplates(List<V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1StatefulSetSpec v1beta1StatefulSetSpec = (V1beta1StatefulSetSpec) o;
    return Objects.equals(this.replicas, v1beta1StatefulSetSpec.replicas) &&
        Objects.equals(this.selector, v1beta1StatefulSetSpec.selector) &&
        Objects.equals(this.serviceName, v1beta1StatefulSetSpec.serviceName) &&
        Objects.equals(this.template, v1beta1StatefulSetSpec.template) &&
        Objects.equals(this.volumeClaimTemplates, v1beta1StatefulSetSpec.volumeClaimTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, selector, serviceName, template, volumeClaimTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1StatefulSetSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

