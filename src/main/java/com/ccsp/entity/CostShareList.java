package com.ccsp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CostShareList generated by hbm2java
 */
@Entity
@Table(name = "CostShareList")
public class CostShareList implements java.io.Serializable {


  private int costShareId;
  private String costShareCode;
  private String costShareName;
  private int costShareDescription;

  public CostShareList() {}

  public CostShareList(int costShareId, String costShareCode, String costShareName,
      int costShareDescription) {
    this.costShareId = costShareId;
    this.costShareCode = costShareCode;
    this.costShareName = costShareName;
    this.costShareDescription = costShareDescription;
  }

  @Id


  @Column(name = "CostShareId", unique = true, nullable = false)
  public int getCostShareId() {
    return this.costShareId;
  }

  public void setCostShareId(int costShareId) {
    this.costShareId = costShareId;
  }


  @Column(name = "CostShareCode", nullable = false)
  public String getCostShareCode() {
    return this.costShareCode;
  }

  public void setCostShareCode(String costShareCode) {
    this.costShareCode = costShareCode;
  }


  @Column(name = "CostShareName", nullable = false)
  public String getCostShareName() {
    return this.costShareName;
  }

  public void setCostShareName(String costShareName) {
    this.costShareName = costShareName;
  }


  @Column(name = "CostShareDescription", nullable = false)
  public int getCostShareDescription() {
    return this.costShareDescription;
  }

  public void setCostShareDescription(int costShareDescription) {
    this.costShareDescription = costShareDescription;
  }



}

