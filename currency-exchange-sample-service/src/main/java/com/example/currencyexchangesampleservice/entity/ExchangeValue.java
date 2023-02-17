package com.example.currencyexchangesampleservice.entity;

import java.math.BigDecimal;
import javax.persistence.*;


@Entity
@Table(name = "exchange_value")
public class ExchangeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "currency_from")
    private String fromCurrency;
    @Column(name = "currency_to")
    private String toCurrency;
    @Column(name = "conversion_multiple")
    private BigDecimal conversionMultiple;
    @Column(name = "port")
    private int port;

    public ExchangeValue() {}

    // generating constructor using fields
    public ExchangeValue(Long id, String fromCurrency,
                         String toCurrency,
                         BigDecimal conversionMultiple)
    {
        super();
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.conversionMultiple = conversionMultiple;
    }

    // generating getters
    public int getPort() { return port; }

    public void setPort(int port) { this.port = port; }

    public Long getId() { return id; }

    public String getFrom() { return fromCurrency; }

    public String getTo() { return toCurrency; }

    public BigDecimal getConversionMultiple()
    {
        return conversionMultiple;
    }
}

