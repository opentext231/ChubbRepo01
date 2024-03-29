/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObject;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.eibus.util.logger.CordysLogger;


public class WKSOpsCase extends WKSOpsCaseBase
{
	public static CordysLogger logger=CordysLogger.getCordysLogger(WKSOpsCase.class);
    public WKSOpsCase()
    {
        this((BusObjectConfig)null);
    }

    public WKSOpsCase(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSOpsCase> getActiveDataUsingMasterAppNo(String Master_AppNo)
    {
String queryText = "select * from WKSOpsCase where Status='Active'";
if(Master_AppNo != null && !Master_AppNo.trim().isEmpty() && Master_AppNo!="PARAMETER") 
queryText=queryText+"and ApplicationType='"+Master_AppNo+"'";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("MasterAppNo", "WKSOpsCase.MasterAppNo", QueryObject.PARAM_STRING, Master_AppNo);
        query.setResultClass(WKSOpsCase.class);
        return query.getObjects();
    }

    public static BusObject getWksOpsCaseObjectByMasterAppNo(String MasterAppNo)
    {
    	String queryText = "select * from WKSOpsCase where Status='Active' and ApplicationType=:MasterAppNo";    
        QueryObject query = new QueryObject(queryText);
        query.addParameter("MasterAppNo", "WKSOpsCase.ApplicationType", QueryObject.PARAM_STRING, MasterAppNo);
        query.setResultClass(WKSOpsCase.class);
        return query.getObject();
    }

    public static WKSOpsCase getWksOpsCaseObjectByCaseInstance(String caseInstanceId)
    {
    	String queryText = "select * from WKSOpsCase where Status='Active' and CaseInstance=:CaseInstanceId";    
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CaseInstanceId", "WKSOpsCase.CaseInstance", QueryObject.PARAM_STRING, caseInstanceId);
        query.setResultClass(WKSOpsCase.class);
        return (WKSOpsCase)query.getObject();
    }

 public static BusObjectIterator<com.worksitewsapppackage.WKSOpsCase> GetActiveCases()
    {
String queryText = "select * from WKSOpsCase where Status='Active'";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(WKSOpsCase.class);
        return query.getObjects();
    }
    public static boolean updateWksOpsCaseStatus(String caseInstance,String status)
    {
    	boolean result=false;
    	try
    	{
    		// get case status
    		if(caseInstance!=null && !caseInstance.equalsIgnoreCase("") && !caseInstance.isEmpty())
    		{
    			WKSOpsCase caseObject=getWksOpsCaseObjectByCaseInstance(caseInstance);
    			if(caseObject!=null)
    			{
    				
    				caseObject.setStatus(status);
    				caseObject.update();
    				result=true;
    			}
    		}

    	}catch(Exception ex)
    	{
    		result=false;
    		logger.error("Error in updateWksOpsCaseStatus method:"+ex);
    	}
    	return result;
    }
	
	public static BusObjectIterator<com.worksitewsapppackage.WKSOpsCase> getWksOpsCaseByMasterApp(String MasterApp)
    {
        String queryText = "select * from WKSOpsCase where ApplicationType=:MasterApp";    
        QueryObject query = new QueryObject(queryText);
        query.addParameter("MasterApp", "WKSOpsCase.ApplicationType", QueryObject.PARAM_STRING, MasterApp);
        query.setResultClass(WKSOpsCase.class);
        return query.getObjects();
    }
}
