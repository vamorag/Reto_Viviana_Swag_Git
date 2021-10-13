package com.choucair.moviles.app.models;

public class DatosCompraModel {
    private String nombre;
    private String apellido;
    private String codigo;
    private String producto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {return codigo; }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {return producto;
    }
}

