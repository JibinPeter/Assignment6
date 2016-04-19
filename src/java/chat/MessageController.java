/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author c0662366
 */
@ApplicationScoped 
public class MessageController {
    private List<Message> msgs = new ArrayList<>();
    public Message getById(int id) {
        for (Message m : msgs) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    
    public List<Message> getByDate(Date from, Date to) {
        List<Message> result = new ArrayList<>();
       for (Message m : msgs) {
            if (m.getSentTime().compareTo(from) >= 0 && m.getSentTime().compareTo(to) <= 0) {
                result.add(m);
            }
        }
        return result;
    }
    
    public List<Message> getAll() {
        List<Message> result = new ArrayList<>();
        for (Message m : msgs) {
            result.add(m);
        }
        return result;
    }
    
    public void add(Message msg) { 
        msgs.add(msg);
    }
    
    public void edit(int id, Message msg) { 
        List<Message> result = new ArrayList<>();
        for (Message m : msgs) {
            if (m.getId() == id) {
                result.add(msg);
            }
        }
        // return result;
    }
    
    public void remove(int id) {
        List<Message> result = new ArrayList<>();
        for (Message m : msgs) {
            if (m.getId() == id) {
                result.removeAll(msgs);
            }
        }
    }
}
