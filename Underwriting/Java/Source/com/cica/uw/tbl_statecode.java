/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class tbl_statecode extends tbl_statecodeBase
{
    public tbl_statecode()
    {
        this((BusObjectConfig)null);
    }

    public tbl_statecode(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.cica.uw.tbl_statecode> getTbl_statecodeList(String Country)
    {
	String queryText = "select * from tbl_statecode where Country = :Country";
        QueryObject query = new QueryObject(queryText);
		query.addParameter("Country", "tbl_statecode .Country", QueryObject.PARAM_STRING, Country);
        query.setResultClass(tbl_statecode .class);
        return query.getObjects();
    }

}
