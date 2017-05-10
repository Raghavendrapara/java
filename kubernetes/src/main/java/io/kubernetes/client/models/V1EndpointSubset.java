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
import io.kubernetes.client.models.V1EndpointAddress;
import io.kubernetes.client.models.V1EndpointPort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\&quot;ip\&quot;: \&quot;10.10.1.1\&quot;}, {\&quot;ip\&quot;: \&quot;10.10.2.2\&quot;}],     Ports:     [{\&quot;name\&quot;: \&quot;a\&quot;, \&quot;port\&quot;: 8675}, {\&quot;name\&quot;: \&quot;b\&quot;, \&quot;port\&quot;: 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
@ApiModel(description = "EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],     Ports:     [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]")

public class V1EndpointSubset {
  @SerializedName("addresses")
  private List<V1EndpointAddress> addresses = new ArrayList<V1EndpointAddress>();

  @SerializedName("notReadyAddresses")
  private List<V1EndpointAddress> notReadyAddresses = new ArrayList<V1EndpointAddress>();

  @SerializedName("ports")
  private List<V1EndpointPort> ports = new ArrayList<V1EndpointPort>();

  public V1EndpointSubset addresses(List<V1EndpointAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public V1EndpointSubset addAddressesItem(V1EndpointAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.")
  public List<V1EndpointAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<V1EndpointAddress> addresses) {
    this.addresses = addresses;
  }

  public V1EndpointSubset notReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  public V1EndpointSubset addNotReadyAddressesItem(V1EndpointAddress notReadyAddressesItem) {
    this.notReadyAddresses.add(notReadyAddressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   * @return notReadyAddresses
  **/
  @ApiModelProperty(example = "null", value = "IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.")
  public List<V1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses;
  }

  public void setNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
  }

  public V1EndpointSubset ports(List<V1EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public V1EndpointSubset addPortsItem(V1EndpointPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port numbers available on the related IP addresses.
   * @return ports
  **/
  @ApiModelProperty(example = "null", value = "Port numbers available on the related IP addresses.")
  public List<V1EndpointPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1EndpointPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointSubset v1EndpointSubset = (V1EndpointSubset) o;
    return Objects.equals(this.addresses, v1EndpointSubset.addresses) &&
        Objects.equals(this.notReadyAddresses, v1EndpointSubset.notReadyAddresses) &&
        Objects.equals(this.ports, v1EndpointSubset.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, notReadyAddresses, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointSubset {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    notReadyAddresses: ").append(toIndentedString(notReadyAddresses)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

