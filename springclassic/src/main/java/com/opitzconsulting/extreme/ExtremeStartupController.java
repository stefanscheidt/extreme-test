package com.opitzconsulting.extreme;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExtremeStartupController {

    private static final Logger LOG = Logger.getLogger(ExtremeStartupController.class);

    private String name;

    public ExtremeStartupController() {
        name = "Stefan"; // System.getProperty("user.name");
    }

    @RequestMapping("/")
    public String index(@RequestParam(value = "q", required = false) String question) {
        LOG.info(String.format("received question [%s]", question));
        LOG.info(String.format("send answer [%s]", name));
        return name;
    }

}
