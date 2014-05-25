/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import cl.usach.elements.*;
import cl.usach.methods.*;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author FGT
 */
public class KanbanizeMake implements Kanbanize{
    
    AppKanbanize appKanbanize = new AppKanbanize();
    
    @Override
    public void setConfig(String apiKey){
        this.appKanbanize.setApiKey(apiKey);
    }
    
    @Override
    public Boolean checkConf(){
        Conf conf = new Conf(appKanbanize);
        return conf.checkConf();
    }
    
    /* ---------------- Metodos Project --------------- */
    
    @Override
    public List<ProjectElement> getProjectsAndBoards(){
        ProjectMethods projectMethods = new ProjectMethods(appKanbanize);
        List<ProjectElement> projectElements = projectMethods.getProjectsAndBoards();
        return projectElements;
    }
    
    /* ---------------- Metodos Structure --------------- */
    
    @Override
    public StructureElement getFullBoardStructure(String idBoard){
        StructureMethods structureMethods = new StructureMethods(appKanbanize);
        StructureElement structureElements = structureMethods.getFullBoardStructure(idBoard);
        return structureElements;
    }
    
    /* ---------------- Metodos Setting --------------- */
    
    @Override
    public SettingElement getSettingsBoard(String idBoard){
        SettingMethods settingMethods = new SettingMethods(appKanbanize);
        SettingElement settingElement = settingMethods.getSettingsBoard(idBoard);
        return settingElement;
    }
    
    /* ---------------- Metodos Activity --------------- */
    
    @Override
    public List<ActivityElement> getBoardActivities(String idBoard, String fromDate, String toDate) throws ParseException{
        ActivityMethods activityMethods = new ActivityMethods(appKanbanize);
        List<ActivityElement> activityElements = activityMethods.getBoardActivities(idBoard, fromDate, toDate);
        return activityElements;
    }
    
    @Override
    public int getTotalActivities(String idBoard, String fromDate, String toDate){
        ActivityMethods activityMethods = new ActivityMethods(appKanbanize);
        int total = activityMethods.getTotalActivities(idBoard, fromDate, toDate);
        return total;
    }
    
    /* ---------------- Metodos Task --------------- */
    
    @Override
    public List<TaskElement> getAllTask(String idBoard){
        TaskMethods taskMethods = new TaskMethods(appKanbanize);
        List<TaskElement> taskElements = taskMethods.getAllTask(idBoard);
        return taskElements;
    }
    
    @Override
    public TaskElement getTaskDetail(String idBoard, String idTask){
        TaskMethods taskMethods = new TaskMethods(appKanbanize);
        TaskElement taskElement = taskMethods.getTaskDetail(idBoard, idTask);
        return taskElement;
    }
    
}
