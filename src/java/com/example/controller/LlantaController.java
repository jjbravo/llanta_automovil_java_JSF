/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.Llanta;
import com.example.sessions.LlantaSession;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author adsi2
 */
@Named
@ViewScoped
public class LlantaController implements Serializable {
    @EJB
   private LlantaSession llantaSession;
   
   private  Llanta currentLlanta;
   private List<Llanta> itemsLlantas=null;
   
   public Llanta getCurrentLlanta(){ //captura currentShirt tipo Shirt
       if(currentLlanta==null){ // currentShirt cuando carga la paginia es nulo, entonces se instancia a la clase Shirt()
           currentLlanta=new Llanta(); //cono es nulo, se instancia a la clase Shirt.
       }
       return currentLlanta; // retorna currentShirt
   }
   
   public void setCurrentLlanta(Llanta currentLlanta){
       this.currentLlanta=currentLlanta;
   }
   
   public void addLlanta(){
       try{
           llantaSession.create(currentLlanta);
           itemsLlantas=null;
       }catch(Exception ex){
           System.err.println(ex.getMessage());
       }
   }
   public List<Llanta> getItemsLlanta(){
       if(itemsLlantas==null){
           try{
               itemsLlantas=llantaSession.findAll();
               
           }catch(Exception ex){
               System.err.println(ex.getMessage());
           }
       }
       return itemsLlantas;
   }
}
