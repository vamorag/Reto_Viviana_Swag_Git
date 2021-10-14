package com.choucair.moviles.app.exceptions;

public class LoginException extends AssertionError{

    private static final String ERROR_LOGIN = "Error realizando la compra de un articulo";

    public LoginException() {}

    public static String ErrorLogin() { return ERROR_LOGIN; }
}

