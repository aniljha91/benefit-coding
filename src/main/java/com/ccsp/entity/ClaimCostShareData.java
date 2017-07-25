package com.ccsp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClaimCostShareData generated by hbm2java
 */
@Entity
@Table(name = "ClaimCostShareData")
public class ClaimCostShareData implements java.io.Serializable {


  private int id;
  private int claimId;
  private int memberId;
  private long memberCoPay;
  private long memberDeductible;
  private long memberCoins;
  private long memeberInsuranceShare;

  public ClaimCostShareData() {}

  public ClaimCostShareData(int id, int claimId, int memberId, long memberCoPay,
      long memberDeductible, long memberCoins, long memeberInsuranceShare) {
    this.id = id;
    this.claimId = claimId;
    this.memberId = memberId;
    this.memberCoPay = memberCoPay;
    this.memberDeductible = memberDeductible;
    this.memberCoins = memberCoins;
    this.memeberInsuranceShare = memeberInsuranceShare;
  }

  @Id


  @Column(name = "id", unique = true, nullable = false)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }


  @Column(name = "ClaimId", nullable = false)
  public int getClaimId() {
    return this.claimId;
  }

  public void setClaimId(int claimId) {
    this.claimId = claimId;
  }


  @Column(name = "MemberId", nullable = false)
  public int getMemberId() {
    return this.memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }


  @Column(name = "MemberCoPay", nullable = false, precision = 18, scale = 0)
  public long getMemberCoPay() {
    return this.memberCoPay;
  }

  public void setMemberCoPay(long memberCoPay) {
    this.memberCoPay = memberCoPay;
  }


  @Column(name = "MemberDeductible", nullable = false, precision = 18, scale = 0)
  public long getMemberDeductible() {
    return this.memberDeductible;
  }

  public void setMemberDeductible(long memberDeductible) {
    this.memberDeductible = memberDeductible;
  }


  @Column(name = "MemberCoins", nullable = false, precision = 18, scale = 0)
  public long getMemberCoins() {
    return this.memberCoins;
  }

  public void setMemberCoins(long memberCoins) {
    this.memberCoins = memberCoins;
  }


  @Column(name = "MemeberInsuranceShare", nullable = false, precision = 18, scale = 0)
  public long getMemeberInsuranceShare() {
    return this.memeberInsuranceShare;
  }

  public void setMemeberInsuranceShare(long memeberInsuranceShare) {
    this.memeberInsuranceShare = memeberInsuranceShare;
  }



}

