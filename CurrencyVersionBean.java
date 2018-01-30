package com.gulsah.project.microservice.currencyconversion.springbootmicroservicecurrencyconversion;

import java.math.BigDecimal;

/**
 * Created by GulsahCoskun on 30.01.2018.
 */
public class CurrencyVersionBean {

    private Long id;
    private String from;
    private String to;
    private BigDecimal currencyMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyVersionBean() {
    }

    public CurrencyVersionBean(Long id, String from, String to, BigDecimal currencyMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.currencyMultiple = currencyMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }


    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getCurrencyMultiple() {
        return currencyMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }
}
