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
import io.kubernetes.client.models.V1OwnerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
@ApiModel(description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")

public class V1ObjectMeta {
  @SerializedName("annotations")
  private Map<String, String> annotations = new HashMap<String, String>();

  @SerializedName("clusterName")
  private String clusterName = null;

  @SerializedName("creationTimestamp")
  private DateTime creationTimestamp = null;

  @SerializedName("deletionGracePeriodSeconds")
  private Long deletionGracePeriodSeconds = null;

  @SerializedName("deletionTimestamp")
  private DateTime deletionTimestamp = null;

  @SerializedName("finalizers")
  private List<String> finalizers = new ArrayList<String>();

  @SerializedName("generateName")
  private String generateName = null;

  @SerializedName("generation")
  private Long generation = null;

  @SerializedName("labels")
  private Map<String, String> labels = new HashMap<String, String>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("ownerReferences")
  private List<V1OwnerReference> ownerReferences = new ArrayList<V1OwnerReference>();

  @SerializedName("resourceVersion")
  private String resourceVersion = null;

  @SerializedName("selfLink")
  private String selfLink = null;

  @SerializedName("uid")
  private String uid = null;

  public V1ObjectMeta annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public V1ObjectMeta putAnnotationsItem(String key, String annotationsItem) {
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
   * @return annotations
  **/
  @ApiModelProperty(example = "null", value = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public V1ObjectMeta clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
   * @return clusterName
  **/
  @ApiModelProperty(example = "null", value = "The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public V1ObjectMeta creationTimestamp(DateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
   * @return creationTimestamp
  **/
  @ApiModelProperty(example = "null", value = "CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata")
  public DateTime getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(DateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  public V1ObjectMeta deletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

   /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
   * @return deletionGracePeriodSeconds
  **/
  @ApiModelProperty(example = "null", value = "Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.")
  public Long getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }

  public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }

  public V1ObjectMeta deletionTimestamp(DateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

   /**
   * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field. Once set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.  Populated by the system when a graceful deletion is requested. Read-only. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata
   * @return deletionTimestamp
  **/
  @ApiModelProperty(example = "null", value = "DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field. Once set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.  Populated by the system when a graceful deletion is requested. Read-only. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata")
  public DateTime getDeletionTimestamp() {
    return deletionTimestamp;
  }

  public void setDeletionTimestamp(DateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }

  public V1ObjectMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  public V1ObjectMeta addFinalizersItem(String finalizersItem) {
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.
   * @return finalizers
  **/
  @ApiModelProperty(example = "null", value = "Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.")
  public List<String> getFinalizers() {
    return finalizers;
  }

  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  public V1ObjectMeta generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

   /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#idempotency
   * @return generateName
  **/
  @ApiModelProperty(example = "null", value = "GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#idempotency")
  public String getGenerateName() {
    return generateName;
  }

  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }

  public V1ObjectMeta generation(Long generation) {
    this.generation = generation;
    return this;
  }

   /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
   * @return generation
  **/
  @ApiModelProperty(example = "null", value = "A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.")
  public Long getGeneration() {
    return generation;
  }

  public void setGeneration(Long generation) {
    this.generation = generation;
  }

  public V1ObjectMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public V1ObjectMeta putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public V1ObjectMeta name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ObjectMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
   * @return namespace
  **/
  @ApiModelProperty(example = "null", value = "Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public V1ObjectMeta ownerReferences(List<V1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  public V1ObjectMeta addOwnerReferencesItem(V1OwnerReference ownerReferencesItem) {
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

   /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
   * @return ownerReferences
  **/
  @ApiModelProperty(example = "null", value = "List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.")
  public List<V1OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }

  public void setOwnerReferences(List<V1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  public V1ObjectMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @ApiModelProperty(example = "null", value = "An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public V1ObjectMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

   /**
   * SelfLink is a URL representing this object. Populated by the system. Read-only.
   * @return selfLink
  **/
  @ApiModelProperty(example = "null", value = "SelfLink is a URL representing this object. Populated by the system. Read-only.")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  public V1ObjectMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @ApiModelProperty(example = "null", value = "UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ObjectMeta v1ObjectMeta = (V1ObjectMeta) o;
    return Objects.equals(this.annotations, v1ObjectMeta.annotations) &&
        Objects.equals(this.clusterName, v1ObjectMeta.clusterName) &&
        Objects.equals(this.creationTimestamp, v1ObjectMeta.creationTimestamp) &&
        Objects.equals(this.deletionGracePeriodSeconds, v1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(this.deletionTimestamp, v1ObjectMeta.deletionTimestamp) &&
        Objects.equals(this.finalizers, v1ObjectMeta.finalizers) &&
        Objects.equals(this.generateName, v1ObjectMeta.generateName) &&
        Objects.equals(this.generation, v1ObjectMeta.generation) &&
        Objects.equals(this.labels, v1ObjectMeta.labels) &&
        Objects.equals(this.name, v1ObjectMeta.name) &&
        Objects.equals(this.namespace, v1ObjectMeta.namespace) &&
        Objects.equals(this.ownerReferences, v1ObjectMeta.ownerReferences) &&
        Objects.equals(this.resourceVersion, v1ObjectMeta.resourceVersion) &&
        Objects.equals(this.selfLink, v1ObjectMeta.selfLink) &&
        Objects.equals(this.uid, v1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ObjectMeta {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

