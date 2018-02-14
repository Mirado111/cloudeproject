/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.database;

import com.mongodb.BasicDBObject;
import model.object.RootMongoObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
//import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.ArrayList;
//import com.mongodb.MongoClientURI;
//import com.mongodb.MongoException;
//import com.mongodb.QueryBuilder;


/**
 *
 * @author ITU
 */
public class MongoDBInterface {
    public DB getconnection() throws Exception{
        MongoClient mongo = new MongoClient("localhost", 27017);
        //MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://abraham:123456789@ds127888.mlab.com:27888"));
	DB db = mongo.getDB("cloudproject");
        return db;
    }
    public 
    public ArrayList<RootMongoObject> select(RootMongoObject type , DBObject query)throws Exception{
        ArrayList<RootMongoObject> result = new ArrayList<RootMongoObject>();
        DBCursor cursor = null;
        try {
            DB db = this.getconnection();
            DBCollection table = db.getCollection(type.getCollectionName());
            BasicDBObject searchQuery = new BasicDBObject();
            
            cursor = table.find(query);
            
            int a=0;
          
            while (cursor.hasNext()) 
            {
                DBObject obj = cursor.next();
                RootMongoObject element = type.construct(obj);
                result.add(element);
            }
            
            
        } catch (MongoException e) {
            e.printStackTrace();
        }
        return result ;
    }
    
    public void insert(RootMongoObject type)throws Exception{
        try {
            DB db = this.getconnection();
            DBCollection table = db.getCollection(type.getCollectionName());
            BasicDBObject document = type.getDocument();
            table.insert(document);
            
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
    
    /**
     *
     * @param before
     * @param after
     * @throws Exception
     */
    public void update(RootMongoObject before , RootMongoObject after )throws Exception{
        
    }
    
}
