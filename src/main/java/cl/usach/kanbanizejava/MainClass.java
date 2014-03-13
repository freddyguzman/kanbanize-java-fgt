package cl.usach.kanbanizejava;

import cl.usach.elements.ActivityElement;
import cl.usach.elements.ColumnElement;
import cl.usach.elements.LaneElement;
import cl.usach.elements.ProjectElement;
import cl.usach.elements.SettingElement;
import cl.usach.elements.StructureElement;
import java.text.ParseException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main( String[] args ) throws JSONException, ParseException
    {
        String urlApiBase = "http://kanbanize.com/index.php/api/kanbanize/";
        
        HTTP http = new HTTP();
        http.setUrl(urlApiBase + "get_board_activities/boardid/4/fromdate/10-03-2014/todate/13-03-2014/format/json");
        String result = http.getResult();
        System.out.println(result);
        
        JSONObject js = new JSONObject("{\"author\":\"freddy.guzman\",\"event\":\"Task moved\",\"text\":\"From 'Requested' to 'In Progress'\",\"date\":\"2014-03-12 22:28:20\",\"taskid\":\"21\"}");
        ActivityElement activityElement = new ActivityElement(js);
        System.out.println(activityElement.toString());
    }
}
