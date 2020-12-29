package com.jastec.testlibrary;

import android.content.Context;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ToasterMessage {

    public static void show_message(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
    public static Date getDateFrmString( String sDate) throws Exception  {

        Date date_re=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
     return date_re;
    }
}
