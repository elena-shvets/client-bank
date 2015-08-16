package com.clientbank.repository.model;

/**
 * Created by elena on 12.08.15.
 */
public class Transaction {

    private Integer id;
    private Integer operationId;
    private Integer transactionTypeId;
    private Integer idAccountFrom;
    private Integer idAccountTo;
    private Double amount;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Integer getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Integer transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
