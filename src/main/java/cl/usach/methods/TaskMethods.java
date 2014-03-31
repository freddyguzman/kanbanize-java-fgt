/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.methods;

import cl.usach.elements.TaskElement;
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
public class TaskMethods {
    
    String url;
    AppKanbanize appKanbanize;
    
    /**
     * Constructor de la clase
     * @param appKanbanize
     */
    public TaskMethods(AppKanbanize appKanbanize){
        this.appKanbanize = appKanbanize;
    }
    
    /**
     * Obtener todas las tareas a partir del identificador del tablero
     * @param idBoard Identificador del tablero
     * @return Lista de elementos Task
     * @see http://kanbanize.com/ctrl_integration#get_all_tasks
     */
    public List<TaskElement> getAllTask(String idBoard){
        url = appKanbanize.getUrlApiBase() + "get_all_tasks/boardid/"+ idBoard + "/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        JSONArray jsona;
        List<TaskElement> taskElements = new ArrayList<TaskElement>();        
        try{
            jsona = new JSONArray(http.getResult());
            for (int i = 0; i < jsona.length(); i++) {
                TaskElement taskElement = new TaskElement(jsona.getJSONObject(i));
                taskElements.add(taskElement);
            }
        }catch(JSONException e){
            System.out.println("Error: No existen Tareas");
        }
        return taskElements;
    }
    
    /**
     * Obtener el detalle de una tarea
     * @param idBoard Identificador del tablero
     * @param idTask Identificador de la tarea
     * @return Elemento Task
     * @see http://kanbanize.com/ctrl_integration#get_task_details
     */
    public TaskElement getTaskDetail(String idBoard, String idTask){
        url = appKanbanize.getUrlApiBase() + "get_task_details/boardid/"+ idBoard + "/taskid/" + idTask + "/format/json";
        HTTP http = new HTTP(url, appKanbanize.getApiKey());
        TaskElement taskElement = null;
        try{
            JSONObject jsono = new JSONObject(http.getResult());
            taskElement = new TaskElement(jsono);
        }catch(JSONException e){
            System.out.println("Error: No existe Tarea");
        }        
        return taskElement;
    }
}
