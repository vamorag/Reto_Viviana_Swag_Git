package com.choucair.moviles.app.exceptions;

public class CompraException extends AssertionError{

    private static final String ERROR_COMPRA = "Error realizando la compra de un articulo";

    public CompraException() {}

    public static String ErrorCompra() { return ERROR_COMPRA; }
}

