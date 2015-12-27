package com.ramya;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ramya.exception.InvalidInputException;
/**
* @author
* Ramya Lanka
*/
@WebService
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String property) throws InvalidInputException {
		String response = null;
		if("name".equals(property))
			response = "WS Mart";
		else if("year".equals(property))
			response = "2014";
		else {
			throw new InvalidInputException("Invalid Property", property + " is not a valid input.");
		}
		return response;
	}
}
