package com.rea.springpractice.controller;

import com.rea.springpractice.component.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CRR
 */
@RestController
public class IndexController {

    @Autowired
    private GlobalProperties globalProperties;

    @RequestMapping("/index")
    String index() {
        return globalProperties.getProjectName()+"——"+globalProperties.getProjectAuthor();
    }
}
