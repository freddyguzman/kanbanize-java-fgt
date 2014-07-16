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
public class SettingElement {
    
    List<String> usernames;
    List<String> templates;
    List<String> types;
    
    /**
     *
     * @param jsono
     * @throws JSONException
     */
    public SettingElement(JSONObject jsono) throws JSONException{
        if(!jsono.isNull("usernames")){
            usernames = new ArrayList<>();
            JSONArray jsona = new JSONArray(jsono.get("usernames").toString());
            for(int i = 0; i < jsona.length(); i++){
                this.usernames.add(jsona.getString(i));
            }
        }
        if(!jsono.isNull("templates")){
            templates = new ArrayList<>();
            JSONArray jsona = new JSONArray(jsono.get("templates").toString());
            for(int i = 0; i < jsona.length(); i++){
                this.templates.add(jsona.getString(i));
            }
        }
        if(!jsono.isNull("types")){
            types = new ArrayList<>();
            JSONArray jsona = new JSONArray(jsono.get("types").toString());
            for(int i = 0; i < jsona.length(); i++){
                this.types.add(jsona.getString(i));
            }
        }
    }

    /**
     *
     * @return
     */
    public List<String> getUsernames() {
        return usernames;
    }

    /**
     *
     * @param usernames
     */
    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    /**
     *
     * @return
     */
    public List<String> getTemplates() {
        return templates;
    }

    /**
     *
     * @param templates
     */
    public void setTemplates(List<String> templates) {
        this.templates = templates;
    }

    /**
     *
     * @return
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     *
     * @param types
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        String string;
        string = "usernames : [ ";
        for (int i = 0; i < usernames.size(); i++) {
            if(i == 0) string += usernames.get(i);
            else string += " , " + usernames.get(i);
        }
        string += " ] \ntemplates : [ " ;
        for (int i = 0; i < templates.size(); i++) {            
            if(i == 0) string += templates.get(i);
            else string += " , " + templates.get(i); 
        }
        string += " ] \ntypes : [ " ;
        for (int i = 0; i < types.size(); i++) {
            if(i == 0) string += types.get(i);
            else string += " , " + types.get(i);
        }
        string += " ] \n";
        
        return string;
    }    
}
