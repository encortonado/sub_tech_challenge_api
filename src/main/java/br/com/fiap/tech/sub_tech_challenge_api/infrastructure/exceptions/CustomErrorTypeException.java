package br.com.fiap.tech.sub_tech_challenge_api.infrastructure.exceptions;


public class CustomErrorTypeException extends RuntimeException{

    public CustomErrorTypeException (String msg) {
        super(msg);
    }
}
