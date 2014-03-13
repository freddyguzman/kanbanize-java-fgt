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
public class ColumnElement {
    
    int position;
    String lcname;
    String section;
    String path;
    String description;
    String lcid;
    
    /**
     *
     * @param jsono
     * @throws JSONException
     */
    public ColumnElement(JSONObject jsono) throws JSONException{
        if(!jsono.isNull("position")) this.position = jsono.getInt("position");
        if(!jsono.isNull("lcname")) this.lcname = jsono.getString("lcname");
        if(!jsono.isNull("section")) this.section = jsono.getString("section");
        if(!jsono.isNull("path")) this.path = jsono.getString("path");
        if(!jsono.isNull("description")) this.description = jsono.getString("description");
        if(!jsono.isNull("lcid")) this.lcid = jsono.getString("lcid");
    }

    /**
     *
     * @return
     */
    public int getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     *
     * @return
     */
    public String getLcname() {
        return lcname;
    }

    /**
     *
     * @param lcname
     */
    public void setLcname(String lcname) {
        this.lcname = lcname;
    }

    /**
     *
     * @return
     */
    public String getSection() {
        return section;
    }

    /**
     *
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getLcid() {
        return lcid;
    }

    /**
     *
     * @param lcid
     */
    public void setLcid(String lcid) {
        this.lcid = lcid;
    }

    @Override
    public String toString() {
        String string;
        string = "position : " + this.position + "\n" + 
                "lcname : " + this.lcname + "\n" + 
                "section : " + this.section + "\n" +
                "path : " + this.path + "\n" + 
                "description : " + this.description + "\n" +
                "lcid : " + this.lcid + "\n";
        return string;
    }
    
       
}
