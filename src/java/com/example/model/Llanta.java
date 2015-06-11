/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author adsi2
 */
@Entity
@Table(name="llanta_automovil")
@NamedQueries({@NamedQuery(name="Llanta.findAll",query="SELECT s FROM Llanta s")})
public class Llanta implements Serializable{
    
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int idllanta;
  private String fabricante;
  private String fecha_fabricacion;
  private String tipo;
  private int ancho;
  private int relacion;
  private char construccion;
  private int diametro;

    public int getIdllanta() {
        return idllanta;
    }

    public void setIdllanta(int idllanta) {
        this.idllanta = idllanta;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(String fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    public char getConstruccion() {
        return construccion;
    }

    public void setConstruccion(char construccion) {
        this.construccion = construccion;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
  
  
}
