/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.object;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import static javafx.scene.Cursor.cursor;
import org.bson.types.ObjectId;

/**
 *
 * @author Admin
 */
public class Carte extends RootMongoObject {
    
    protected String id;
    protected String nom;
    protected String description;
    protected ArrayList<String> evolution;
    protected ArrayList<String> matierePremiere;
    protected float attaque;
    protected float defence;
    protected float puissance;
    protected float protection;

    public String getCollectionName(){
        return "carte";
    }
    public BasicDBObject getDocument(){
        BasicDBObject document = new BasicDBObject();
        document.put("nom", this.nom);
        document.put("description", this.description);
        document.put("attaque", this.attaque);
        document.put("defence", this.defence);
        document.put("puissance", this.puissance);
        document.put("protection", this.protection);
        return document;
    }
    
    public RootMongoObject construct(DBObject mongoElement){
        
        ObjectId oid  = (ObjectId)(mongoElement.get("_id"));
        String arg_id = oid.toString();
        String arg_nom = String.valueOf(mongoElement.get("nom"));
        String arg_description = String.valueOf(mongoElement.get("description"));
        float arg_attaque = (float)(mongoElement.get("attaque"));
        float arg_defence = (float)(mongoElement.get("deffence"));
        float arg_puissance = (float)(mongoElement.get("puissance"));
        float arg_protection = (float)(mongoElement.get("protection"));
        Carte result = new Carte(arg_id , arg_nom , arg_description , arg_attaque , arg_defence , arg_puissance , arg_protection , null , null );
        return result;
    }
    public Carte(String arg_id, String arg_nom, String arg_description, float arg_attaque, float arg_defence, float arg_puissance, float arg_protection , ArrayList<String> arg_evolution, ArrayList<String> arg_matierePremiere) {
        this.setId (arg_id);
        this.setNom (arg_nom);
        this.setDescription (arg_description);
        this.setEvolution (arg_evolution);
        this.setMatierePremiere (arg_matierePremiere);
        this.setAttaque (arg_attaque);
        this.setDefence (arg_defence);
        this.setPuissance (arg_puissance);
        this.setProtection (arg_protection);
    }

    
    
    
    public String getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public String getDescription(){
        return this.description;
    }
    public ArrayList<String> getEvolution(){
        return this.evolution;
    }
    public ArrayList<String> getMatierePremiere(){
        return this.matierePremiere;
    }
    public void setId(String arg_id){
        this.id=arg_id;
    }
    public void setNom(String arg_nom ){
        this.nom = arg_nom;
    }
    protected void setDescription(String arg_description){
        this.description = arg_description;
    }
    protected void setEvolution (ArrayList<String> arg_evolution){
        this.evolution = arg_evolution;
    }
    protected void setMatierePremiere(ArrayList<String> arg_matierepremiere){
        this.matierePremiere = arg_matierepremiere;
    }

    public void setAttaque(float arg_attaque) {
        this.attaque = arg_attaque;
    }

    public void setDefence(float arg_defence) {
        this.defence = arg_defence;
    }

    public void setPuissance(float arg_puissance) {
        this.puissance = arg_puissance;
    }

    public void setProtection(float arg_protection) {
        this.protection = arg_protection;
    }
    
    
    
    public  String[] getColumnList(){
        return null;
    }
    

    public float getAttaque() {
        return attaque;
    }

    public float getDefence() {
        return defence;
    }

    public float getPuissance() {
        return puissance;
    }

    public float getProtection() {
        return protection;
    }
    
    
}
