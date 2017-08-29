package com.bj.basic;

import com.bj.javabean.Report;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by JACKSON on 2017/8/29.
 */
public class Jackson_Parse {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = Jackson_Parse.class.getResourceAsStream("test.json");
        System.out.println(is.toString());
        Report R = mapper.readValue(is, Report.class);
        System.out.println(R.getStatus());

////        Object O = mapper.readValue(is, Jackson_Parse.class);
//        File file = new File("test.json");
//        String json = FileUtils.readFileToString(file);
//        ObjectNode root = (ObjectNode) mapper.readTree(json);
//        String name = root.get("Data").asText();
//        System.out.println(name);

    }
}
