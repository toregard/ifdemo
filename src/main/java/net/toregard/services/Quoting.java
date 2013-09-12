/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.toregard.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author TG3
 */
@WebService(serviceName = "Quoting")
public class Quoting {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "NetbeansMetode")
    public String hello(@WebParam(name = "KallMegArgument") String txt) {
        return "Hello NetbeansKalling" + txt + " !";
    }
    
    @WebMethod(operationName = "NetbeansMetode2")
    public String hello2(@WebParam(name = "KallMeg2Argument") String txt) {
        return "Hello 2 Netbeans2Kalling" + txt + " !";
    }
}
