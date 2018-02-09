package com.acc.tibco.interfaceAconyx.ws;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Account.class,
			AccountInfo.class,
			AuthInfo.class,
			Address.class,
			Uow.class,
			UnitOfWork.class,
			UnPublishedUowList.class,
			UowDetail.class,
			UowDetailList.class,
			UowJob.class,
			UowStatus.class})
public class Response implements Serializable{
	public WSGenericObject wsGenericObject;

	public WSGenericObject getWsGenericObject() {
		return wsGenericObject;
	}

	public void setWsGenericObject(WSGenericObject wsGenericObject) {
		this.wsGenericObject = wsGenericObject;
	}
	
	@Override
	public String toString(){
		StringBuffer result = new StringBuffer();
		
		result.append(this.getWsGenericObject() != null? "<Response>" + this.getWsGenericObject().toString()+"</Response>":"");
		
		return result.toString();
	}
	
}
