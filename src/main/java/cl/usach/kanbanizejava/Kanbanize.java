/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.usach.kanbanizejava;

import cl.usach.elements.*;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author FGT
 */
public interface Kanbanize {
    
    public void setConfig(String apiKey);
    
    public Boolean checkConf();
    
    /* ---------------- Metodos Project --------------- */
    
    public List<ProjectElement> getProjectsAndBoards();
    
    /* ---------------- Metodos Structure --------------- */
    
    public StructureElement getFullBoardStructure(String idBoard);
    
    /* ---------------- Metodos Setting --------------- */
    
    public SettingElement getSettingsBoard(String idBoard);
    
    /* ---------------- Metodos Activity --------------- */
    
    public List<ActivityElement> getBoardActivities(String idBoard, String fromDate, String toDate);
    
    public int getTotalActivities(String idBoard, String fromDate, String toDate);
    
    /* ---------------- Metodos Task --------------- */
    
    public List<TaskElement> getAllTask(String idBoard);
    
    public TaskElement getTaskDetail(String idBoard, String idTask);
    
}
