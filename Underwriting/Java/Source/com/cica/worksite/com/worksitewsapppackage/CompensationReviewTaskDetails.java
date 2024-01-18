/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.soap.SOAPRequestObject;
import java.util.*;
import java.text.*;


public class CompensationReviewTaskDetails extends CompensationReviewTaskDetailsBase
{
    public CompensationReviewTaskDetails()
    {
        this((BusObjectConfig)null);
    }


    public CompensationReviewTaskDetails(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.CompensationReviewTaskDetails> getCompReviewTaskDetailsByMA(String masterAppNo)
    {
String queryText = "SELECT * FROM CompensationReviewTaskDetails WHERE MasterAppNo= :masterAppNo ORDER BY CreatedDateTime DESC";
                        QueryObject query = new QueryObject(queryText);
			query.addParameter("masterAppNo", "CompensationReviewTaskDetails.MasterAppNo", QueryObject.PARAM_STRING, masterAppNo);//NOPMD
        query.setResultClass(CompensationReviewTaskDetails.class);
        return query.getObjects();
     }
	 
	 		
	public static BusObjectIterator<com.worksitewsapppackage.CompensationReviewTaskDetails> GetCompCasesToBeCreated()
    {

        String queryText = "select * from CompensationReviewTaskDetails where TaskCreated IS NULL Order by CreatedDateTime DESC";
        QueryObject query = new QueryObject(queryText);        
        query.setResultClass(CompensationReviewTaskDetails.class);       
        return query.getObjects();
    }

}
