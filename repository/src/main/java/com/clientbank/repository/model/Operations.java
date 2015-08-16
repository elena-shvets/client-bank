package com.clientbank.repository.model;

import java.util.Date;

/**
 * Created by elena on 12.08.15.
 */
public class Operations {

    private Integer id;
    private Integer operationTypeId;
    private Date date_create;
    private Integer idAccountFrom;
    private Integer idAccountTo;
    private Double amountFrom;
    private Double amountTo;
    private Double balanceFrom;
    private Double balanceTo;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(Integer operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public Integer getIdAccountFrom() {
        return idAccountFrom;
    }

    public void setIdAccountFrom(Integer idAccountFrom) {
        this.idAccountFrom = idAccountFrom;
    }

    public Integer getIdAccountTo() {
        return idAccountTo;
    }

    public void setIdAccountTo(Integer idAccountTo) {
        this.idAccountTo = idAccountTo;
    }

    public Double getAmountFrom() {
        return amountFrom;
    }

    public void setAmountFrom(Double amountFrom) {
        this.amountFrom = amountFrom;
    }

    public Double getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(Double amountTo) {
        this.amountTo = amountTo;
    }

    public Double getBalanceFrom() {
        return balanceFrom;
    }

    public void setBalanceFrom(Double balanceFrom) {
        this.balanceFrom = balanceFrom;
    }

    public Double getBalanceTo() {
        return balanceTo;
    }

    public void setBalanceTo(Double balanceTo) {
        this.balanceTo = balanceTo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
