/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class LaneElement {
    
    int position;
    String lcname;
    String path;
    String description;
    String lcid;
    String color;
    
    public LaneElement(JSONObject jsono) throws JSONException{
        if(!jsono.isNull("position")) this.position = jsono.getInt("position");
        if(!jsono.isNull("lcname")) this.lcname = jsono.getString("lcname");
        if(!jsono.isNull("path")) this.path = jsono.getString("path");
        if(!jsono.isNull("description")) this.description = jsono.getString("description");
        if(!jsono.isNull("lcid")) this.lcid = jsono.getString("lcid");
        if(!jsono.isNull("color")) this.color = jsono.getString("color");
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getLcname() {
        return lcname;
    }

    public void setLcname(String lcname) {
        this.lcname = lcname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLcid() {
        return lcid;
    }

    public void setLcid(String lcid) {
        this.lcid = lcid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        String string;
        string = "position : " + this.position + "\n" + 
                "lcname : " + this.lcname + "\n" +
                "path : " + this.path + "\n" + 
                "description : " + this.description + "\n" +
                "lcid : " + this.lcid + "\n" +
                "color : " + this.color + "\n";
        return string;
    }
}
