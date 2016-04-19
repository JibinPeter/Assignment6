/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author c0662366
 */
@ApplicationScoped 
@Path("/messages/{startDate}/{endDate}")
public class MessageService {
    List<Message> lists = new ArrayList<Message>();
    @GET
    @Path("{id}")
    @Produces("application/json")    
    public JsonArray getAll() {
        JsonArrayBuilder json = Json.createArrayBuilder();
        for (String todo : lists.getTodoList()) {
            json.add(todo);
        }
        return json.build();
    }
    
//    @POST
//    @Consumes("application/json")    
//    @Produces("application/json")
//    public JsonArray add(String str) {
//        JsonObject json = Json.createReader(new StringReader(str)).readObject();
//        List<Message> lists = new ArrayList<>();
//        lists.add(json.getInt("id"));
//        lists.add(json.getString("title"));
//        lists.add(json.getString("contents"));
//        lists.add(json.getString("author"));
//        lists.add(json.getString("sentTime"));
//        return getAll();
//    }
}
