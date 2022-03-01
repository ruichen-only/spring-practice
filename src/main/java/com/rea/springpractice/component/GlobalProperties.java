package com.rea.springpractice.component;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author CRR
 */
@Component
@Data
public class GlobalProperties {

    @Value("${project.name}")
    private String projectName;

    @Value("${project.author}")
    private String projectAuthor;
}
