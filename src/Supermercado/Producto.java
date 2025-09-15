/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Producto implements Comparable<Producto>{
     private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rubro; 
    private TreeSet<Producto> prod ;
   

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
        this.prod = new TreeSet<>();
    }
    
    public boolean agregarProductos(Producto producto){
        return prod.add(producto);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    public TreeSet<Producto> getProd() {
        return prod;
    }
    
    
//    public void Rubro(String rubro){
//        if (rubro.equalsIgnoreCase("comestible")||rubro.equalsIgnoreCase("perfumeria")||rubro.equalsIgnoreCase("limpieza")) {
//            this.rubro=rubro;
//        }else{
//            System.out.println("¡Rubro invalido!");
//        }
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.rubro, other.rubro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro + '}';
    }

    @Override
    public int compareTo(Producto t) {
        //compare to solo devuelve 1 o 0
        if(codigo == t.codigo){
            return 0;
        }else if(codigo > t.getCodigo()){
            return 1;
        }else{
            return -1;
        }
    }
     
     
}
