package com.mongodb.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bego on 23/03/2017.
 */
public class helloWorldFreemarkerStyle {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(helloWorldFreemarkerStyle.class,"/");
        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name","Freemaker");

            helloTemplate.process(helloMap,writer);
            System.out.println(writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
