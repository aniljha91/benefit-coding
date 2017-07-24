package com.ccsp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ServiceRules generated by hbm2java
 */
@Entity
@Table(name = "service_rules")
public class ServiceRules implements java.io.Serializable {


  private int id;
  private String value;
  private String planId;

  public ServiceRules() {}


  public ServiceRules(int id) {
    this.id = id;
  }

  public ServiceRules(int id, String value, String planId) {
    this.id = id;
    this.value = value;
    this.planId = planId;
  }

  @Id


  @Column(name = "id", unique = true, nullable = false)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }


  @Column(name = "value")
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Column(name = "plan_id", length = 50)
  public String getPlanId() {
    return this.planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }



}


