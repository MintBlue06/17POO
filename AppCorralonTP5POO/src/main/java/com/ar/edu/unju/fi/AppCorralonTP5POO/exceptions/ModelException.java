package com.ar.edu.unju.fi.AppCorralonTP5POO.exceptions;

public class ModelException extends RuntimeException {
    /**Cause (causa del error)*/
    private static final long serialVersionUID = 0;
    private Throwable cause;

    public ModelException(String message) {
        super(message);
    }

    public ModelException(Throwable cause) {
		super();
		this.cause = cause;
	} 

    @Override
    public Throwable getCause() {
        return this.cause;
    } 
}
