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
 * @author Admin
 */
public class Joueur extends RootMongoObject{
    protected String id;
    protected String nom;
    protected String motdepasse;
    protected ArrayList<String> listeDesAmis;
    protected ArrayList<String> listeMangaVu;
    protected ArrayList<String> listeCartePossedee;
    protected ArrayList<String> listeMatch;

    public String getCollectionName(){
        return "joueur";
    }
    public BasicDBObject getDocument(){
        BasicDBObject document = new BasicDBObject();
        document.put("nom", this.nom);
        document.put("motdepasse", this.motdepasse);
        return document;
    }
    
    public RootMongoObject construct(DBObject mongoElement){
        
        ObjectId oid  = (ObjectId)(mongoElement.get("_id"));
        String arg_id = oid.toString();
        String arg_nom = String.valueOf(mongoElement.get("nom"));
        String arg_motDePasse = String.valueOf(mongoElement.get("motdepasse"));
        Joueur result = new Joueur ( arg_id , arg_nom , arg_motDePasse , null , null , null , null );
        return result;
    }
    public Joueur(String arg_id , String arg_nom , String arg_motDePasse , ArrayList<String> arg_listeDesAmis , ArrayList<String> arg_listeMangaVu , ArrayList<String> arg_listeCartePossedee , ArrayList<String> arg_listeMatch ){
        this.setId(arg_id);
        this.setNom(arg_nom);
        this.setMotdepasse(arg_motDePasse);
        this.setListeDesAmis(arg_listeDesAmis);
        this.setListeMangaVu(arg_listeMangaVu);
        this.setListeCartePossedee(arg_listeCartePossedee);
        this.setListeMatch(arg_listeMatch);
    }

    public void setId(String arg_id) {
        this.id = arg_id;
    }

    public void setNom(String arg_nom) {
        this.nom = arg_nom;
    }

    public void setMotdepasse(String arg_motdepasse) {
        this.motdepasse = arg_motdepasse;
    }

    public void setListeDesAmis(ArrayList<String> arg_listeDesAmis) {
        this.listeDesAmis = arg_listeDesAmis;
    }

    public void setListeMangaVu(ArrayList<String> arg_listeMangaVu) {
        this.listeMangaVu = arg_listeMangaVu;
    }

    public void setListeCartePossedee(ArrayList<String> arg_listeCartePossedee) {
        this.listeCartePossedee = arg_listeCartePossedee;
    }

    public void setListeMatch(ArrayList<String> arg_listeMatch) {
        this.listeMatch = arg_listeMatch;
    }

    
    public String getId() {
        return this.id;
    }
    
    public String getNom() {
        return this.nom;
    }

    public String getMotdepasse() {
        return this.motdepasse;
    }

    public ArrayList<String> getListeDesAmis() {
        return this.listeDesAmis;
    }

    public ArrayList<String> getListeMangaVu() {
        return this.listeMangaVu;
    }

    public ArrayList<String> getListeCartePossedee() {
        return this.listeCartePossedee;
    }

    public ArrayList<String> getListeMatch() {
        return this.listeMatch;
    }
    
    
}
