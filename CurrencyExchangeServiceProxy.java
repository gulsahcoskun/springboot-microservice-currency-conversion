package com.gulsah.project.microservice.currencyconversion.springbootmicroservicecurrencyconversion;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by GulsahCoskun on 31.01.2018.
 */
@FeignClient(name="forexservice", url="localhost:8000")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExhangeValue(@PathVariable("from") String from,
                                                       @PathVariable("to") String to);

}

