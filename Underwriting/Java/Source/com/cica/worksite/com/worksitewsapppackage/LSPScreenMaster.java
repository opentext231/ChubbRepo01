/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.eibus.xml.nom.Node;
import com.eibus.xml.xpath.XPath;
import com.cordys.cpc.bsf.busobject.BusObject;


public class LSPScreenMaster extends LSPScreenMasterBase
{
    public LSPScreenMaster()
    {
        this((BusObjectConfig)null);
    }

    public LSPScreenMaster(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.cordys.cpc.bsf.busobject.BusObject> getOnlyCompleteOrNA_Using_MtrAppNo(String Master_App_No)
    {
        		BusObjectIterator <BusObject> resp1 = null;
		String queryText = "select * from LSPScreenMaster where Status not in ('Completed','Not Received') and MasterAppNumber='"+Master_App_No+"' ";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("MasterAppNumber", "LSPScreenMaster.MasterAppNumber", QueryObject.PARAM_STRING, Master_App_No);
        query.setResultClass(LSPScreenMaster.class);
      //  int resp= query.getObjects();
		BusObject busObj = query.getObject();
	//	String Screen_Name = busObj.getStringProperty("ScreenName");
		
		if(busObj == null ) 
		{
		String queryText1 = "select * from LSPScreenMaster where Status in ('Completed','Not Received') and MasterAppNumber='"+Master_App_No+"' ";
        QueryObject query1 = new QueryObject(queryText1);
        query1.addParameter("MasterAppNumber", "LSPScreenMaster.MasterAppNumber", QueryObject.PARAM_STRING, Master_App_No);
        query1.setResultClass(LSPScreenMaster.class);
      resp1= query1.getObjects();
		}
		
		return resp1;
    }

    public static BusObjectIterator<com.cordys.cpc.bsf.busobject.BusObject> getLSPWimsData_Count_MatchedRows(String Master_App_No)
    {
        String queryText1 = "select * from LSPScreenMaster LSM join WIMSDataRequest WDR on WDR.MasterAppNumber=LSM.MasterAppNumber and WDR.header=LSM.Header where LSM.Status in ('Screen Error','Data Error') and LSM.MasterAppNumber='"+Master_App_No+"'";
        QueryObject query1 = new QueryObject(queryText1);
       query1.addParameter("MasterAppNumber", "LSPScreenMaster.MasterAppNumber", QueryObject.PARAM_STRING, Master_App_No);
        query1.setResultClass(LSPScreenMaster.class);
      return query1.getObjects();
    }

}
