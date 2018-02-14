/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.object;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;

/**
 *
 * @author Admin
 */
public class Categorie extends RootMongoObject{
    
    protected String id;
    protected String nom;
    protected String description;

    public String getCollectionName(){
        return "categorie";
    }
    public BasicDBObject getDocument(){
        BasicDBObject document = new BasicDBObject();
        document.put("nom", this.nom);
        document.put("description", this.description);
        return document;
    }
    
    public RootMongoObject construct(DBObject mongoElement){
        
        ObjectId oid  = (ObjectId)(mongoElement.get("_id"));
        String arg_id = oid.toString();
        String arg_nom = String.valueOf(mongoElement.get("nom"));
        String arg_description = String.valueOf(mongoElement.get("description"));
        Categorie result = new Categorie ( arg_id , arg_nom , arg_description );
        return result;
    }
    public Categorie(String arg_id, String arg_nom, String arg_description) {
        this.setId (arg_id);
        this.setNom (arg_nom);
        this.setDescription (arg_description);
    }

    
    
    public void setId(String arg_id) {
        this.id = arg_id;
    }

    public void setNom(String arg_nom) {
        this.nom = arg_nom;
    }

    public void setDescription(String arg_description) {
        this.description = arg_description;
    }
    
    

    public String getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getDescription() {
        return this.description;
    }
    
    
    
}
