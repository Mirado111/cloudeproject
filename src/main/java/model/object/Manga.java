/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.object;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import org.bson.types.ObjectId;

/**
 *
 * @author ITU
 */
public class Manga extends RootMongoObject{
    protected String id;
    protected String nom;
    protected String description;
    protected String categorie;
    protected ArrayList<String> listeDesVus;
    protected ArrayList<String> listeDesNotes;
    protected ArrayList<String> listeDesChapitres;

    public String getCollectionName(){
        return "manga";
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
        String arg_categorie = String.valueOf(mongoElement.get("categorie"));
        Manga result = new Manga ( arg_id , arg_nom , arg_description , arg_categorie , null , null , null );
        return result;
    }
    public Manga(String arg_id, String arg_nom, String arg_description, String arg_categorie, ArrayList<String> arg_listeDesVus, ArrayList<String> arg_listeDesNotes, ArrayList<String> arg_listeDesChapitres) {
        this.setId (arg_id);
        this.setNom (arg_nom);
        this.setDescription( arg_description);
        this.setCategorie(arg_categorie);
        this.setListeDesVus(arg_listeDesVus);
        this.setListeDesNotes (arg_listeDesNotes);
        this.setListeDesChapitres (arg_listeDesChapitres);
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

    public void setListeDesVus(ArrayList<String> arg_listeDesVus) {
        this.listeDesVus = arg_listeDesVus;
    }

    public void setListeDesNotes(ArrayList<String> arg_listeDesNotes) {
        this.listeDesNotes = arg_listeDesNotes;
    }

    public void setListeDesChapitres(ArrayList<String> arg_listeDesChapitres) {
        this.listeDesChapitres = arg_listeDesChapitres;
    }

    public String getCategorie() {
        return this.categorie;
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

    public ArrayList<String> getListeDesVus() {
        return this.listeDesVus;
    }

    public ArrayList<String> getListeDesNotes() {
        return this.listeDesNotes;
    }

    public ArrayList<String> getListeDesChapitres() {
        return this.listeDesChapitres;
    }

    public void setCategorie(String arg_categorie) {
        this.categorie = arg_categorie;
    }
    
    
    
    
}
