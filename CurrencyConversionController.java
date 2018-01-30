package com.gulsah.project.microservice.currencyconversion.springbootmicroservicecurrencyconversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by GulsahCoskun on 30.01.2018.
 */
@RestController
public class CurrencyConversionController {

    private static final Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyVersionBean convertCurrency(@PathVariable String from,
                                               @PathVariable String to,
                                               @PathVariable BigDecimal quantity) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        ResponseEntity<CurrencyVersionBean> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyVersionBean.class, uriVariables);

        CurrencyVersionBean response = responseEntity.getBody();

        return new CurrencyVersionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
                quantity.multiply(response.getConversionMultiple()), response.getPort());
    }
}
