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
 * @author ITU
 */
public class Chapitre extends RootMongoObject{
        protected String id;
        protected String num;
        protected String titre;
        protected String dossier;
    
    public String getCollectionName(){
        return "chapitre";
    }
    public BasicDBObject getDocument(){
        BasicDBObject document = new BasicDBObject();
        document.put("num", this.num);
        document.put("titre", this.titre);
        document.put("dossier", this.dossier);
        return document;
    }
    public RootMongoObject construct(DBObject mongoElement){
        
        ObjectId oid  = (ObjectId)(mongoElement.get("_id"));
        String arg_id = oid.toString();
        String arg_nom = String.valueOf(mongoElement.get("num"));
        String arg_titre = String.valueOf(mongoElement.get("titre"));
        String arg_dossier = String.valueOf(mongoElement.get("dossier"));
        Chapitre result = new Chapitre ( arg_id , arg_nom , arg_titre , arg_dossier );
        return result;
    }
    public Chapitre(String arg_id, String arg_num, String arg_titre, String arg_dossier) {
        this.setId (arg_id);
        this.setNum (arg_num);
        this.setTitre (arg_titre);
        this.setDossier (arg_dossier);
    }

        
    
    public void setId(String arg_id) {
        this.id = arg_id;
    }

    public void setNum(String arg_num) {
        this.num = arg_num;
    }

    public void setTitre(String arg_titre) {
        this.titre = arg_titre;
    }

    public void setDossier(String arg_dossier) {
        this.dossier = arg_dossier;
    }

        
        
    public String getId() {
        return this.id;
    }

    public String getNum() {
        return this.num;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getDossier() {
        return this.dossier;
    }
        
        
    
}
