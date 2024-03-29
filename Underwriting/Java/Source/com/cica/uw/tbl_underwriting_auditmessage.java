/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.AnonymousBusObject;
import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class tbl_underwriting_auditmessage extends tbl_underwriting_auditmessageBase
{
    public tbl_underwriting_auditmessage()
    {
        this((BusObjectConfig)null);
    }

    public tbl_underwriting_auditmessage(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_auditmessage> GetOriginalAuditMessages(String title)
    {
        String queryText = "select * from \"tbl_underwriting_auditmessage\" where \"title\" = :title";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("title", "tbl_underwriting_auditmessage.title", QueryObject.PARAM_STRING, title);//NOPMD
        query.setResultClass(tbl_underwriting_auditmessage.class);
        return query.getObjects();
    }

    public static int GetPolicySeverityCount(String companyPolicy)
    {
        String queryText = "select COUNT(*) as countVal from tbl_underwriting_auditmessage where Company_Policy=:companyPolicy and hot>1";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("companyPolicy", "tbl_underwriting_auditmessage.Company_Policy", QueryObject.PARAM_STRING, companyPolicy);//NOPMD
        query.setResultClass(AnonymousBusObject.class);
		AnonymousBusObject result=(AnonymousBusObject) query.getObject();
        return result.getIntProperty("countVal");
    }

}
