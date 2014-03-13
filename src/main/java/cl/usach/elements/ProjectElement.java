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
public class ProjectElement {
    
    String id;
    String name;
    List<BoardElement> boardElements;
    
    /**
     *
     * @param jsonO
     * @throws JSONException
     */
    public ProjectElement(JSONObject jsonO) throws JSONException{
        this.id = jsonO.get("id").toString();
        if(!jsonO.isNull("name")) this.name = jsonO.get("name").toString();
        if(!jsonO.isNull("boards")){
            JSONArray jsonA = jsonO.getJSONArray("boards");
            boardElements = new ArrayList<BoardElement>();
            for (int i = 0; i < jsonA.length(); i++) {
                JSONObject jso = new JSONObject(jsonA.get(i).toString());                
                BoardElement boardElement = new BoardElement(jso);
                boardElements.add(boardElement);
            }
        }
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public List<BoardElement> getBoardElements() {
        return boardElements;
    }

    /**
     *
     * @param boardElements
     */
    public void setBoardElements(List<BoardElement> boardElements) {
        this.boardElements = boardElements;
    }

    @Override
    public String toString() {
        String string;
        string = "id : " + this.id + "\n" + 
                "name : " + this.name + "\n" +
                "boards : { ";
        for(int i = 0; i < this.boardElements.size(); i++){
            string += "id : " + boardElements.get(i).getId() + " , name : " + boardElements.get(i).getName() + "\n";
        }
        string += "} \n"; 
        
        return string;
    }
    
    
}
