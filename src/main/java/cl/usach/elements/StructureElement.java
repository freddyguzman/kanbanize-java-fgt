/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.elements;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class StructureElement {
    
    List<ColumnElement> columnElements;
    List<LaneElement> laneElements;
    
    /**
     *
     * @param jsono
     * @throws JSONException
     */
    public StructureElement(JSONObject jsono) throws JSONException{
        
        if(!jsono.isNull("columns")){
            columnElements = new ArrayList<ColumnElement>();
            JSONArray jsona = new JSONArray(jsono.getJSONArray("columns").toString());
            for (int i = 0; i < jsona.length(); i++) {
                JSONObject jsono1 = new JSONObject(jsona.get(i).toString());
                ColumnElement columnElement = new ColumnElement(jsono1);
                columnElements.add(columnElement);
            }
        }
        if(!jsono.isNull("lanes")){
            laneElements = new ArrayList<LaneElement>();
            JSONArray jsona = new JSONArray(jsono.getJSONArray("lanes").toString());
            for (int i = 0; i < jsona.length(); i++) {
                JSONObject jsono1 = new JSONObject(jsona.get(i).toString());
                LaneElement laneElement = new LaneElement(jsono1);
                laneElements.add(laneElement);
            }
        }        
    }

    /**
     *
     * @return
     */
    public List<ColumnElement> getColumnElements() {
        return columnElements;
    }

    /**
     *
     * @param columnElements
     */
    public void setColumnElements(List<ColumnElement> columnElements) {
        this.columnElements = columnElements;
    }

    /**
     *
     * @return
     */
    public List<LaneElement> getLaneElements() {
        return laneElements;
    }

    /**
     *
     * @param laneElements
     */
    public void setLaneElements(List<LaneElement> laneElements) {
        this.laneElements = laneElements;
    }

    @Override
    public String toString() {
        String string;
        string = "columns : { ";
        for (int i = 0; i < this.columnElements.size(); i++) {
            string += this.columnElements.get(i).toString() +  " , ";
        }
        string += " } \n lanes: { ";
        for (int i = 0; i < this.laneElements.size(); i++) {
            string += this.laneElements.get(i).toString() +  " , ";
        }
        string += " } \n";
        
        return string;
    }
    
    
}
