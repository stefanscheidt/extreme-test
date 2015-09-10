package com.opitzconsulting.extreme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtremeStartupController {

    private static final Logger LOG = LoggerFactory.getLogger(ExtremeStartupController.class);

    private String name;

    public ExtremeStartupController() {
        name = System.getProperty("user.name");
    }

    @RequestMapping("/")
    public String index(@RequestParam(value = "q", required = false) String question) {
        LOG.info(String.format("received question [%s]", question));
        LOG.info(String.format("send answer [%s]", name));
        return name;
    }

}
