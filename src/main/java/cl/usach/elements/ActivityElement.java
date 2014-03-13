/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import cl.usach.util.FormatDate;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ActivityElement extends FormatDate{
    
    String author;
    String event;
    String text;
    Date date;
    String taskid;
    
    public ActivityElement(JSONObject jsono) throws JSONException, ParseException{
        if(!jsono.isNull("author")) this.author = jsono.getString("author");
        if(!jsono.isNull("event")) this.event = jsono.getString("event");
        if(!jsono.isNull("text")) this.text = jsono.getString("text");
        if(!jsono.isNull("date")) this.date = getFormatDate(jsono.getString("date"));
        if(!jsono.isNull("taskid")) this.taskid = jsono.getString("taskid");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String takid) {
        this.taskid = takid;
    }

    @Override
    public String toString() {
        String string;
        string = "author : " + this.author + "\n" +
                "event : " + this.event + "\n" +
                "text : " + this.text + "\n" + 
                "date : " + this.date + "\n" +
                "taskid : " + this.taskid + "\n";
        return string;
    }
    
       
}
