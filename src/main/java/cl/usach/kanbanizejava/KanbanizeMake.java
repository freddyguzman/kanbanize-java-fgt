/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import cl.usach.elements.*;
import cl.usach.methods.*;
import java.util.List;

/**
 *
 * @author FGT
 */
public class KanbanizeMake implements Kanbanize{
    
    AppKanbanize appKanbanize = new AppKanbanize();
    
    public void setConfig(String apiKey){
        this.appKanbanize.setApiKey(apiKey);
    }
    
    /* ---------------- Metodos Project --------------- */
    
    public List<ProjectElement> getProjectsAndBoards(){
        ProjectMethods projectMethods = new ProjectMethods(appKanbanize);
        List<ProjectElement> projectElements = projectMethods.getProjectsAndBoards();
        return projectElements;
    }
    
    /* ---------------- Metodos Structure --------------- */
    
    public StructureElement getFullBoardStructure(String idBoard){
        StructureMethods structureMethods = new StructureMethods(appKanbanize);
        StructureElement structureElements = structureMethods.getFullBoardStructure(idBoard);
        return structureElements;
    }
    
    /* ---------------- Metodos Setting --------------- */
    
    public SettingElement getSettingsBoard(String idBoard){
        SettingMethods settingMethods = new SettingMethods(appKanbanize);
        SettingElement settingElement = settingMethods.getSettingsBoard(idBoard);
        return settingElement;
    }
    
    /* ---------------- Metodos Activity --------------- */
    
    public List<ActivityElement> getBoardActivities(String idBoard, String fromDate, String toDate){
        ActivityMethods activityMethods = new ActivityMethods(appKanbanize);
        List<ActivityElement> activityElements = activityMethods.getBoardActivities(idBoard, fromDate, toDate);
        return activityElements;
    }
    
    public int getTotalActivities(String idBoard, String fromDate, String toDate){
        ActivityMethods activityMethods = new ActivityMethods(appKanbanize);
        int total = activityMethods.getTotalActivities(idBoard, fromDate, toDate);
        return total;
    }
    
}
