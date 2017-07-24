package com.ccsp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NetworkNameList generated by hbm2java
 */
@Entity
@Table(name = "network_name_list")
public class NetworkNameList implements java.io.Serializable {


  private int networkNameId;
  private String networkName;
  private String networkNameDescription;

  public NetworkNameList() {}

  public NetworkNameList(int networkNameId, String networkName, String networkNameDescription) {
    this.networkNameId = networkNameId;
    this.networkName = networkName;
    this.networkNameDescription = networkNameDescription;
  }

  @Id


  @Column(name = "network_name_id", unique = true, nullable = false)
  public int getNetworkNameId() {
    return this.networkNameId;
  }

  public void setNetworkNameId(int networkNameId) {
    this.networkNameId = networkNameId;
  }


  @Column(name = "network_name", nullable = false)
  public String getNetworkName() {
    return this.networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  @Column(name = "network_name_description", nullable = false)
  public String getNetworkNameDescription() {
    return this.networkNameDescription;
  }

  public void setNetworkNameDescription(String networkNameDescription) {
    this.networkNameDescription = networkNameDescription;
  }



}


