package com.info.exception;

/**
 * 
 * @author Sandhya
 * Data Not Found Exception
 *
 */

public class DataNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 6897622288930896339L;

	public DataNotFoundException(String message) {
		super(message);
	}
	

}
