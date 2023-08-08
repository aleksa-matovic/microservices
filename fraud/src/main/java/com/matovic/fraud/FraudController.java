package com.matovic.fraud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    @Autowired
    private FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {

        log.info("Check isFraudster with customerId {} ", customerId);

        boolean fraudelantCustomer = fraudCheckService.isFraudelantCustomer(customerId);

        return new FraudCheckResponse(fraudelantCustomer);
    }
}
