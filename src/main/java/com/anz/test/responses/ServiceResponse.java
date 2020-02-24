package com.anz.test.responses;

import java.io.Serializable;

public class ServiceResponse implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 5780354700263336394L;
    private String responseMessage;
    private int responseStatus;
    
    
    
    
    public ServiceResponse(String responseMessage, int responseStatus)
    {
        super();
        this.responseMessage = responseMessage;
        this.responseStatus = responseStatus;
    }
    public String getResponseMessage()
    {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage)
    {
        this.responseMessage = responseMessage;
    }
    public int getResponseStatus()
    {
        return responseStatus;
    }
    public void setResponseStatus(int responseStatus)
    {
        this.responseStatus = responseStatus;
    }
    
    
    
}
