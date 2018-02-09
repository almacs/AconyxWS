package com.acc.tibco.interfaceAconyx.util;

import com.acc.tibco.interfaceAconyx.ws.Account;
import com.acc.tibco.interfaceAconyx.ws.AccountInfo;
//import com.agnity.ngin.sms.webservice.common.AccountInfo;
import com.acc.tibco.interfaceAconyx.ws.AuthInfo;
import com.acc.tibco.interfaceAconyx.ws.UnitOfWork;

public class GenericObject {
 
	Object result;
	
	 public GenericObject(String name, String xml){
		 
		 if(name.equals("AuthInfo"))
			this.setResult( new AuthInfo(xml)); 
		  
		 if(name.equals("UnitOfWork"))
			 this.setResult( new UnitOfWork(xml));
		 
		 if(name.equals("Account"))
			 this.setResult(new Account(xml));
		 
		 if(name.equals("AccountInfo"))
			 this.setResult(new AccountInfo(xml));
		  
	 }

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	
}
