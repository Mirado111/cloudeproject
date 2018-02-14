/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.object;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;


/**
 *
 * @author ITU
 */
public abstract class RootMongoObject {
    public abstract RootMongoObject construct(DBObject a);
    public abstract String getCollectionName();
    //public abstract String[] getColumnList();
    public abstract BasicDBObject getDocument();
}
