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
public class TaskElement {
    
    String taskid;
    String position;
    String type;
    String assignee;
    String title;
    String description;
    String subtasks;
    String subtaskscomplete;
    String color;
    String priority;
    String size;
    String deadline;
    String deadlineoriginalformat;
    String extlink;
    String tags;
    String columnid;
    String laneid;
    int leadtime;
    String blocked;
    String blockedreason;
    String subtaskdetails;
    String columnname;
    String lanename;
    String columnpath;
    String logedtime;
    String links;

    /**
     *
     * @param jsono
     * @throws JSONException
     */
    public TaskElement(JSONObject jsono) throws JSONException {
        if(!jsono.isNull("taskid")) this.taskid = jsono.getString("taskid");
        if(!jsono.isNull("position")) this.position = jsono.getString("position");
        if(!jsono.isNull("type")) this.type = jsono.getString("type");
        if(!jsono.isNull("assignee")) this.assignee = jsono.getString("assignee");
        if(!jsono.isNull("title")) this.title = jsono.getString("title");
        if(!jsono.isNull("description")) this.description = jsono.getString("description");
        if(!jsono.isNull("subtasks")) this.subtasks = jsono.getString("subtasks");
        if(!jsono.isNull("subtaskscomplete")) this.subtaskscomplete = jsono.getString("subtaskscomplete");
        if(!jsono.isNull("color")) this.color = jsono.getString("color");
        if(!jsono.isNull("priority")) this.priority = jsono.getString("priority");
        if(!jsono.isNull("size")) this.size = jsono.getString("size");
        if(!jsono.isNull("deadline")) this.deadline = jsono.getString("deadline");
        if(!jsono.isNull("deadlineoriginalformat")) this.deadlineoriginalformat = jsono.getString("deadlineoriginalformat");
        if(!jsono.isNull("extlink")) this.extlink = jsono.getString("extlink");
        if(!jsono.isNull("tags")) this.tags = jsono.getString("tags");
        if(!jsono.isNull("columnid")) this.columnid = jsono.getString("columnid");
        if(!jsono.isNull("laneid")) this.laneid = jsono.getString("laneid");
        if(!jsono.isNull("leadtime")) this.leadtime = jsono.getInt("leadtime");
        if(!jsono.isNull("blocked")) this.blocked = jsono.getString("blocked");
        if(!jsono.isNull("blockedreason")) this.blockedreason = jsono.getString("blockedreason");
        if(!jsono.isNull("subtaskdetails")) this.subtaskdetails = jsono.getString("subtaskdetails");
        if(!jsono.isNull("columnname")) this.columnname = jsono.getString("columnname");
        if(!jsono.isNull("lanename")) this.lanename = jsono.getString("lanename");
        if(!jsono.isNull("columnpath")) this.columnpath = jsono.getString("columnpath");
        if(!jsono.isNull("logedtime")) this.logedtime = jsono.getString("logedtime");
        if(!jsono.isNull("links")) this.links = jsono.getString("links");
    }

    /**
     *
     * @return
     */
    public String getTaskid() {
        return taskid;
    }

    /**
     *
     * @param taskid
     */
    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    /**
     *
     * @return
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     *
     * @param assignee
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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
    public String getSubtasks() {
        return subtasks;
    }

    /**
     *
     * @param subtasks
     */
    public void setSubtasks(String subtasks) {
        this.subtasks = subtasks;
    }

    /**
     *
     * @return
     */
    public String getSubtaskscomplete() {
        return subtaskscomplete;
    }

    /**
     *
     * @param subtaskscomplete
     */
    public void setSubtaskscomplete(String subtaskscomplete) {
        this.subtaskscomplete = subtaskscomplete;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getPriority() {
        return priority;
    }

    /**
     *
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     *
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     * @return
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     *
     * @param deadline
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     *
     * @return
     */
    public String getDeadlineoriginalformat() {
        return deadlineoriginalformat;
    }

    /**
     *
     * @param deadlineoriginalformat
     */
    public void setDeadlineoriginalformat(String deadlineoriginalformat) {
        this.deadlineoriginalformat = deadlineoriginalformat;
    }

    /**
     *
     * @return
     */
    public String getExtlink() {
        return extlink;
    }

    /**
     *
     * @param extlink
     */
    public void setExtlink(String extlink) {
        this.extlink = extlink;
    }

    /**
     *
     * @return
     */
    public String getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     *
     * @return
     */
    public String getColumnid() {
        return columnid;
    }

    /**
     *
     * @param columnid
     */
    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    /**
     *
     * @return
     */
    public String getLaneid() {
        return laneid;
    }

    /**
     *
     * @param laneid
     */
    public void setLaneid(String laneid) {
        this.laneid = laneid;
    }

    /**
     *
     * @return
     */
    public int getLeadtime() {
        return leadtime;
    }

    /**
     *
     * @param leadtime
     */
    public void setLeadtime(int leadtime) {
        this.leadtime = leadtime;
    }

    /**
     *
     * @return
     */
    public String getBlocked() {
        return blocked;
    }

    /**
     *
     * @param blocked
     */
    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    /**
     *
     * @return
     */
    public String getBlockedreason() {
        return blockedreason;
    }

    /**
     *
     * @param blockedreason
     */
    public void setBlockedreason(String blockedreason) {
        this.blockedreason = blockedreason;
    }

    /**
     *
     * @return
     */
    public String getSubtaskdetails() {
        return subtaskdetails;
    }

    /**
     *
     * @param subtaskdetails
     */
    public void setSubtaskdetails(String subtaskdetails) {
        this.subtaskdetails = subtaskdetails;
    }

    /**
     *
     * @return
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     *
     * @param columnname
     */
    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    /**
     *
     * @return
     */
    public String getLanename() {
        return lanename;
    }

    /**
     *
     * @param lanename
     */
    public void setLanename(String lanename) {
        this.lanename = lanename;
    }

    /**
     *
     * @return
     */
    public String getColumnpath() {
        return columnpath;
    }

    /**
     *
     * @param columnpath
     */
    public void setColumnpath(String columnpath) {
        this.columnpath = columnpath;
    }

    /**
     *
     * @return
     */
    public String getLogedtime() {
        return logedtime;
    }

    /**
     *
     * @param logedtime
     */
    public void setLogedtime(String logedtime) {
        this.logedtime = logedtime;
    }

    /**
     *
     * @return
     */
    public String getLinks() {
        return links;
    }

    /**
     *
     * @param links
     */
    public void setLinks(String links) {
        this.links = links;
    }

    @Override
    public String toString() {
        String string;
        string = "taskid : " + this.taskid + "\n" +
                "position : " + this.position + "\n" +
                "type : " + this.type + "\n" +
                "assignee : " + this.assignee + "\n" +
                "title : " + this.title + "\n" +
                "description : " + this.description + "\n" +
                "subtasks : " + this.subtasks + "\n" +
                "subtaskscomplete : " + this.subtaskscomplete + "\n" +
                "color : " + this.color + "\n" +
                "priority : " + this.priority + "\n" +
                "size : " + this.size + "\n" +
                "deadline : " + this.deadline + "\n" +
                "deadlineoriginalformat : " + this.deadlineoriginalformat + "\n" +
                "extlink : " + this.extlink + "\n" +
                "tags : " + this.tags + "\n" +
                "columnid : " + this.columnid + "\n" +
                "laneid : " + this.laneid + "\n" +
                "leadtime : " + this.leadtime + "\n" +
                "blocked : " + this.blocked + "\n" +
                "blockedreason : " + this.blockedreason + "\n" +
                "subtaskdetails : " + this.subtaskdetails + "\n" +
                "columnname : " + this.columnname + "\n" +
                "lanename : " + this.lanename + "\n" +
                "columnpath : " + this.columnpath + "\n" +
                "logedtime : " + this.logedtime + "\n" +
                "links : " + this.links + "\n";
        return string;
    }   
    
}
