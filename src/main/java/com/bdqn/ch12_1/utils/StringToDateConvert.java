package com.bdqn.ch12_1.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConvert
        implements Converter<String,Date> {
    private String ftm=null;

    public StringToDateConvert(String ftm) {
        this.ftm = ftm;
    }

    public Date convert(String s) {
        Date dat= null;
        try {
            dat=new SimpleDateFormat(ftm).parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dat;
    }
}
