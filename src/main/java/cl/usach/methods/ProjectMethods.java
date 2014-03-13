/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.ProjectElement;
import cl.usach.kanbanizejava.AppKanbanize;
import cl.usach.kanbanizejava.HTTP;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author FGT
 */
public class ProjectMethods {
    
    String url;
    AppKanbanize appKanbanize;

    /**
     * Constructor de la clase
     */
    public ProjectMethods() {
    }
    
    /**
     * Constructor de la clase
     * @param appKanbanize
     */
    public ProjectMethods(AppKanbanize appKanbanize){
        this.appKanbanize = appKanbanize;
    }
    
    /**
     * Obtiene los proyectos y tableros del usuario
     * @return Lista de elementos Project
     * @see http://kanbanize.com/ctrl_integration#get_projects_and_boards
     */
    public List<ProjectElement> getProjectsAndBoards(){
        url = appKanbanize.getUrlApiBase() + "get_projects_and_boards/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        JSONArray jsona;
        List<ProjectElement> projectElements = new ArrayList<ProjectElement>();       
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            jsona = new JSONArray(jsono.getString("projects"));
            for (int i = 0; i < jsona.length(); i++) {
                ProjectElement projectElement = new ProjectElement(jsona.getJSONObject(i));
                projectElements.add(projectElement);
            }
        }catch(JSONException e){
            System.out.println("Error: No existen Projectos");
        }
        return projectElements;
    }
}
