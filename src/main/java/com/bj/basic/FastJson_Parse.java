package com.bj.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by JACKSON on 2017/8/29.
 */
public class FastJson_Parse {

    public static void main(String[] args) throws IOException {
        json2JsonObjectM1();//将Json文本数据信息转换为JsonObject对象，然后利用键值对的方式获取信息
//        json2BeanM2();//将Json文本数据转换为JavaBean数据！
//        json2JSONArrayM3();//将json数据转化为JSONArray:
//        json2JavaBeanM4();//将JSON文本转换为JavaBean的集合；转换为单纯的1个Object：parseObject(String text, Class<T> clazz);
//        bean2JsonM5();//将JavaBean转换为Json格式的数据/Json文本 用户数据的传递：例如上传服务器
//        bean2JSONObjectM6();//将JavaBean转换为JSON对象
//        complexExampleM7();//一个相对复杂的例子：
//        complex2JsonM8();//一个复杂的Object到Json的Demo
//        complexMap2JsonM9();//将Map数据转换为JsonString的Demo；这个对RedBoy服务端不就直接破了嘛！

    }


    private static void json2JsonObjectM1() throws IOException {
        //一个JsonObject文本数据
        String s = "{\"name\":\"bj\"}";
        File file = new File("test.json");
        System.out.println(file.getAbsolutePath());
        String json = FileUtils.readFileToString(file);

    }
}
