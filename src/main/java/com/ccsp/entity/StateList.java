package com.ccsp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StateList generated by hbm2java
 */
@Entity
@Table(name = "StateList")
public class StateList implements java.io.Serializable {


  private int stateId;
  private String stateCode;
  private String stateName;

  public StateList() {}

  public StateList(int stateId, String stateCode, String stateName) {
    this.stateId = stateId;
    this.stateCode = stateCode;
    this.stateName = stateName;
  }

  @Id
  @Column(name = "StateId", unique = true, nullable = false)
  public int getStateId() {
    return this.stateId;
  }

  public void setStateId(int stateId) {
    this.stateId = stateId;
  }


  @Column(name = "StateCode", nullable = false)
  public String getStateCode() {
    return this.stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Column(name = "StateName", nullable = false)
  public String getStateName() {
    return this.stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }



}


