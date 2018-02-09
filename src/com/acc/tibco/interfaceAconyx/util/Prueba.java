package com.acc.tibco.interfaceAconyx.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import com.acc.tibco.interfaceAconyx.VO.VOLoadData;
import com.acc.tibco.interfaceAconyx.VO.VOBuildHashProperties;
import com.acc.tibco.interfaceAconyx.VO.VOBuildHashTable;
import com.acc.tibco.interfaceAconyx.VO.VODataToProcess;
import com.acc.tibco.interfaceAconyx.dao.DAODataToProcess;
import com.acc.tibco.interfaceAconyx.exception.InternalErrorException;
import com.acc.tibco.interfaceAconyx.motor.SequencesProvisioningManager;

public class Prueba {
	
	public static void main(String[] args) {	    	
   	 try {
	    	 SequencesProvisioningManager ejecutarSecuencia = new SequencesProvisioningManager();
	    	 Vector<VODataToProcess> voDataToProcess = new Vector<VODataToProcess>();
	    	 
//	    	 voDataToProcess = DAODataToProcess.getDataToProcessByQuery();
	   		 
	   		 
	    	 /// transaccion
			voDataToProcess = DAODataToProcess.getDataToProcessByQuery();
			//voDataToProcess = DAODataToProcess.getDataToProcessByTransaction("ValMigratedCustomer");
	    	 VODataToProcess[] arreglo = new VODataToProcess[voDataToProcess.size()];
	    	 for (int i = 0; i < arreglo.length; i++) {
	    		 arreglo[i]= voDataToProcess.elementAt(i);
			}

	    	 VOBuildHashProperties  param1 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param2 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param3 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param4 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param5 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param6 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param7 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param8 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param9 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param10 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  param11 = new VOBuildHashProperties();
	    	 VOBuildHashProperties  []paramTable = new VOBuildHashProperties[11];

	    	 
	    	 // Prueba sin NIP
	    	 /*
	    	 param1.setKey("idRequest");
	    	 param1.setValue ("1-4JTPTS");//("1-VACBYE");//("1-61AXQ1");
	    	 paramTable[0] = param1;
	    	 
	    	 param2.setKey("serviceType");
	    	 param2.setValue("SI-01250");
	    	 paramTable[1] = param2;

	    	 param3.setKey("customerId");
	    	 param3.setValue("4000000004"); //("6161610001");
	    	 paramTable[2] = param3;

	    	 param4.setKey("crmUser");
	    	 param4.setValue("JALEJANDRO");//("JALEJANDRO");
	    	 paramTable[3] = param4;
   	 
	    	 param5.setKey("operation");
//	    	 param5.setValue("P");
	    	 param5.setValue("Add");//("Modify");
	    	 paramTable[4] = param5;

	    	 param6.setKey("projectId");
	    	 param6.setValue("4");//("33");
	    	 paramTable[5] = param6;

	    	 param7.setKey("soUniqId");
	    	 param7.setValue("6403");//("5383");
	    	 paramTable[6] = param7;
	    	 
	    	 param8.setKey("accountNo");
	    	 param8.setValue("21798"); //("7");
	    	 paramTable[7] = param8;

	    	 param9.setKey("uowId");
	    	 param9.setValue("5126");//("1030");
	    	 paramTable[8] = param9;
	    	 
	    	 param10.setKey("assetByProjADD");
	    	 param10.setValue("8005533115");//("4499229008");
	    	 paramTable[9] = param10;
	    	 
	    	 param11.setKey("assetNumberLocFP");
	    	 param11.setValue("8005533115");//("4499229008");
	    	 paramTable[10] = param11;
	    	 */
	    	 // Prueba con NIP
	    	 
	    	 param1.setKey("idRequest");
	    	 param1.setValue ("1-1N7VV1E");//("1-VACBYE");//("1-61AXQ1");
	    	 paramTable[0] = param1;
	    	 
	    	 param2.setKey("serviceType");
	    	 param2.setValue("SI-0004");
	    	 paramTable[1] = param2;

	    	 param3.setKey("customerId");
	    	 param3.setValue("AcnmeTelco6"); // ("4000000665");//("6161610001");
	    	 paramTable[2] = param3;

	    	 param4.setKey("crmUser");
	    	 param4.setValue("TIBCO");//("JALEJANDRO");
	    	 paramTable[3] = param4;
   	 
	    	 param5.setKey("operation");	    	 
//	    	 param5.setValue("P");
	    	 param5.setValue("Add");//("Modify");
	    	 paramTable[4] = param5;

	    	 param6.setKey("password");
	    	 param6.setValue("Abc!12345");//("33");
	    	 paramTable[5] = param6;

	    	 param7.setKey("parentAccountNumber");
	    	 param7.setValue("41033");//("5383");
	    	 paramTable[6] = param7;
	    	 
	    	 param8.setKey("userIdAccountNumber");
	    	 param8.setValue("41201"); //("7");
	    	 paramTable[7] = param8;
	    	 

	    	 param9.setKey("userId");
	    	 param9.setValue("sistemas@axtelatf.net.mx");//("1030");
	    	 paramTable[8] = param9;
	    	 
	    	 param10.setKey("projectId");
	    	 param10.setValue("1");//("4499229008");
	    	 paramTable[9] = param10;
	    	 
	    	 param11.setKey("soUniqId");
	    	 param11.setValue("17589");//("4499229008");
	    	 paramTable[10] = param11;

	    	 VOBuildHashTable table = new VOBuildHashTable();
	    	 table.setBuildHashPropeties(paramTable);
	    	 
	    	 VOLoadData  loadData = new VOLoadData();
	    	 loadData.setVODataToProcess(arreglo);
	    	// String salida = ejecutarSecuencia.provisioningProcess("1-1PRLU7","8183220042","SI-00450","2","1473",loadData);
	    	 ejecutarSecuencia.provisioningProcess(table, loadData);
	    	// System.out.println (salida);
   	 } catch (InternalErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}