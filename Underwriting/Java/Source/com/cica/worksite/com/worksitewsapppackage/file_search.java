/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;

public class file_search extends file_searchBase
{
    public file_search()
    {
        this((BusObjectConfig)null);
    }

    public file_search(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.worksitewsapppackage.file_search> Getfile_searchbyFileReceiverDate(String fromDate, String toDate)
    {
        
String queryText = "SELECT * FROM file_search WHERE (isDate(FileReceviedDate)=0) or isDate(FileReceviedDate)=1 and parse(FileReceviedDate as date) between :fromDate AND :toDate";
        QueryObject query = new QueryObject(queryText);
		query.addParameter("fromDate", "file_search.FileReceviedDate", QueryObject.PARAM_STRING, fromDate);           
		query.addParameter("toDate", "file_search.FileReceviedDate", QueryObject.PARAM_STRING, toDate);           
        query.setResultClass(file_search.class);
        return query.getObjects();
    }
	
	 public static BusObjectIterator<com.worksitewsapppackage.file_search> Getfile_searchforFolderandDates(String folderName, String fromDate, String toDate)
    {
        String queryText = "SELECT * FROM file_search WHERE Folder = :folderName AND (isDate(FileReceviedDate)=1 and parse(FileReceviedDate as date) between :fromDate AND :toDate )";
        QueryObject query = new QueryObject(queryText);
		query.addParameter("folderName", "file_search.Folder", QueryObject.PARAM_STRING, folderName);           
		query.addParameter("fromDate", "file_search.FileReceviedDate", QueryObject.PARAM_STRING, fromDate);           
		query.addParameter("toDate", "file_search.FileReceviedDate", QueryObject.PARAM_STRING, toDate);           
        query.setResultClass(file_search.class);
        return query.getObjects();
    }

}