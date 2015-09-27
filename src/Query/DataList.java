/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

import com.mongodb.DBObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.List;
/**
 *
 * @author iamhy_000
 */
public class DataList implements java.io.Serializable{
    
    private List<DBObject> data;
    
    public DataList(DBCursor cursor){
        data = cursor.toArray();
    }
    
    public List getData(){
        return this.data;
    }
}
