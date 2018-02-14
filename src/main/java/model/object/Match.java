/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.object;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author ITU
 */
public class Match extends RootMongoObject{
    protected String id;
    protected Date dateDuMatch;
    protected String joueur1;
    protected String joueur2;
    protected float scoreJoueur1;
    protected float scoreJoueur2;

    public String getCollectionName(){
        return "match";
    }
    public BasicDBObject getDocument(){
        BasicDBObject document = new BasicDBObject();
        document.put("dateDuMatch", this.dateDuMatch);
        document.put("joueur1", this.joueur1);
        document.put("joueur2", this.joueur2);
        document.put("scoreJoueur1", this.scoreJoueur1);
        document.put("scoreJoueur2", this.scoreJoueur2);
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
    public Match(String arg_id, Date arg_dateDuMatch, String arg_joueur1, String arg_joueur2, float arg_scoreJoueur1, float arg_scoreJoueur2) {
        this.setId (arg_id);
        this.setDateDuMatch (arg_dateDuMatch);
        this.setJoueur1 (arg_joueur1);
        this.setJoueur2 (arg_joueur2);
        this.setScoreJoueur1 (arg_scoreJoueur1);
        this.setScoreJoueur2 (arg_scoreJoueur2);
    }


    public String getId() {
        return this.id;
    }

    public Date getDateDuMatch() {
        return this.dateDuMatch;
    }

    public String getJoueur1() {
        return this.joueur1;
    }

    public String getJoueur2() {
        return this.joueur2;
    }

    public float getScoreJoueur1() {
        return this.scoreJoueur1;
    }

    public float getScoreJoueur2() {
        return this.scoreJoueur2;
    }

    public void setId(String arg_id) {
        this.id = arg_id;
    }

    public void setDateDuMatch(Date arg_dateDuMatch) {
        this.dateDuMatch = arg_dateDuMatch;
    }

    public void setJoueur1(String arg_joueur1) {
        this.joueur1 = arg_joueur1;
    }

    public void setJoueur2(String arg_joueur2) {
        this.joueur2 = arg_joueur2;
    }

    public void setScoreJoueur1(float arg_scoreJoueur1) {
        this.scoreJoueur1 = arg_scoreJoueur1;
    }

    public void setScoreJoueur2(float arg_scoreJoueur2) {
        this.scoreJoueur2 = arg_scoreJoueur2;
    }


    
    
}
