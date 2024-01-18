/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class WKSOPSCaseTmpBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_MasterAppSFId = "MasterAppSFId";
    public final static String ATTR_CaseCreatedBy = "CaseCreatedBy";
    public final static String ATTR_CaseCreationDate = "CaseCreationDate";
    public final static String ATTR_CaseCloseDate = "CaseCloseDate";
    public final static String ATTR_CaseClosedBy = "CaseClosedBy";
    public final static String ATTR_CaseId = "CaseId";
    public final static String ATTR_Loaddate = "Loaddate";
    public final static String ATTR_Status = "Status";
    public final static String ATTR_CaseHandlingType = "CaseHandlingType";
    public final static String ATTR_CompanyCode = "CompanyCode";
    public final static String ATTR_MasterAppNumber = "MasterAppNumber";
    public final static String ATTR_CaseInstance = "CaseInstance";
    public final static String ATTR_CaseHandlingSubType = "CaseHandlingSubType";
    public final static String ATTR_CreatedBy = "CreatedBy";
    public final static String ATTR_CreatedDate = "CreatedDate";
    public final static String ATTR_UpdatedBy = "UpdatedBy";
    public final static String ATTR_UpdatedDate = "UpdatedDate";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(WKSOPSCaseTmp.class);
            s_classInfo.setTableName("WKSOPSCaseTmp");
            s_classInfo.setUIDElements(new String[]{ATTR_CaseId});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MasterAppSFId);
                ai.setJavaName(ATTR_MasterAppSFId);
                ai.setColumnName(ATTR_MasterAppSFId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MasterAppSFId);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseCreatedBy);
                ai.setJavaName(ATTR_CaseCreatedBy);
                ai.setColumnName(ATTR_CaseCreatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseCreatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseCreationDate);
                ai.setJavaName(ATTR_CaseCreationDate);
                ai.setColumnName(ATTR_CaseCreationDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseCloseDate);
                ai.setJavaName(ATTR_CaseCloseDate);
                ai.setColumnName(ATTR_CaseCloseDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseClosedBy);
                ai.setJavaName(ATTR_CaseClosedBy);
                ai.setColumnName(ATTR_CaseClosedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseClosedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseId);
                ai.setJavaName(ATTR_CaseId);
                ai.setColumnName(ATTR_CaseId);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_CaseId);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Loaddate);
                ai.setJavaName(ATTR_Loaddate);
                ai.setColumnName(ATTR_Loaddate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Status);
                ai.setJavaName(ATTR_Status);
                ai.setColumnName(ATTR_Status);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Status);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseHandlingType);
                ai.setJavaName(ATTR_CaseHandlingType);
                ai.setColumnName(ATTR_CaseHandlingType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseHandlingType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CompanyCode);
                ai.setJavaName(ATTR_CompanyCode);
                ai.setColumnName(ATTR_CompanyCode);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CompanyCode);
                v.setMaxLength(4);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MasterAppNumber);
                ai.setJavaName(ATTR_MasterAppNumber);
                ai.setColumnName(ATTR_MasterAppNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MasterAppNumber);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseInstance);
                ai.setJavaName(ATTR_CaseInstance);
                ai.setColumnName(ATTR_CaseInstance);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseInstance);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseHandlingSubType);
                ai.setJavaName(ATTR_CaseHandlingSubType);
                ai.setColumnName(ATTR_CaseHandlingSubType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseHandlingSubType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedBy);
                ai.setJavaName(ATTR_CreatedBy);
                ai.setColumnName(ATTR_CreatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CreatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedDate);
                ai.setJavaName(ATTR_CreatedDate);
                ai.setColumnName(ATTR_CreatedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UpdatedBy);
                ai.setJavaName(ATTR_UpdatedBy);
                ai.setColumnName(ATTR_UpdatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_UpdatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UpdatedDate);
                ai.setJavaName(ATTR_UpdatedDate);
                ai.setColumnName(ATTR_UpdatedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public WKSOPSCaseTmpBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getMasterAppSFId()
    {
        return getStringProperty(ATTR_MasterAppSFId);
    }

    public void setMasterAppSFId(String value)
    {
        setProperty(ATTR_MasterAppSFId, value, 0);
    }

    public String getCaseCreatedBy()
    {
        return getStringProperty(ATTR_CaseCreatedBy);
    }

    public void setCaseCreatedBy(String value)
    {
        setProperty(ATTR_CaseCreatedBy, value, 0);
    }

    public java.util.Date getCaseCreationDate()
    {
        return getDateTimestampProperty(ATTR_CaseCreationDate);
    }

    public void setCaseCreationDate(java.util.Date value)
    {
        setProperty(ATTR_CaseCreationDate, value, 0);
    }

    public java.util.Date getCaseCloseDate()
    {
        return getDateTimestampProperty(ATTR_CaseCloseDate);
    }

    public void setCaseCloseDate(java.util.Date value)
    {
        setProperty(ATTR_CaseCloseDate, value, 0);
    }

    public String getCaseClosedBy()
    {
        return getStringProperty(ATTR_CaseClosedBy);
    }

    public void setCaseClosedBy(String value)
    {
        setProperty(ATTR_CaseClosedBy, value, 0);
    }

    public long getCaseId()
    {
        return getLongProperty(ATTR_CaseId);
    }

    public void setCaseId(long value)
    {
        setProperty(ATTR_CaseId, value, 0);
    }

    public java.util.Date getLoaddate()
    {
        return getDateTimestampProperty(ATTR_Loaddate);
    }

    public void setLoaddate(java.util.Date value)
    {
        setProperty(ATTR_Loaddate, value, 0);
    }

    public String getStatus()
    {
        return getStringProperty(ATTR_Status);
    }

    public void setStatus(String value)
    {
        setProperty(ATTR_Status, value, 0);
    }

    public String getCaseHandlingType()
    {
        return getStringProperty(ATTR_CaseHandlingType);
    }

    public void setCaseHandlingType(String value)
    {
        setProperty(ATTR_CaseHandlingType, value, 0);
    }

    public String getCompanyCode()
    {
        return getStringProperty(ATTR_CompanyCode);
    }

    public void setCompanyCode(String value)
    {
        setProperty(ATTR_CompanyCode, value, 0);
    }

    public String getMasterAppNumber()
    {
        return getStringProperty(ATTR_MasterAppNumber);
    }

    public void setMasterAppNumber(String value)
    {
        setProperty(ATTR_MasterAppNumber, value, 0);
    }

    public String getCaseInstance()
    {
        return getStringProperty(ATTR_CaseInstance);
    }

    public void setCaseInstance(String value)
    {
        setProperty(ATTR_CaseInstance, value, 0);
    }

    public String getCaseHandlingSubType()
    {
        return getStringProperty(ATTR_CaseHandlingSubType);
    }

    public void setCaseHandlingSubType(String value)
    {
        setProperty(ATTR_CaseHandlingSubType, value, 0);
    }

    public String getCreatedBy()
    {
        return getStringProperty(ATTR_CreatedBy);
    }

    public void setCreatedBy(String value)
    {
        setProperty(ATTR_CreatedBy, value, 0);
    }

    public java.util.Date getCreatedDate()
    {
        return getDateTimestampProperty(ATTR_CreatedDate);
    }

    public void setCreatedDate(java.util.Date value)
    {
        setProperty(ATTR_CreatedDate, value, 0);
    }

    public String getUpdatedBy()
    {
        return getStringProperty(ATTR_UpdatedBy);
    }

    public void setUpdatedBy(String value)
    {
        setProperty(ATTR_UpdatedBy, value, 0);
    }

    public java.util.Date getUpdatedDate()
    {
        return getDateTimestampProperty(ATTR_UpdatedDate);
    }

    public void setUpdatedDate(java.util.Date value)
    {
        setProperty(ATTR_UpdatedDate, value, 0);
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSOPSCaseTmp> getNextWKSOPSCaseTmpObjects(long CaseId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSOPSCaseTmp\" where (\"CaseId\" > :CaseId) order by \"CaseId\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(CaseId));//NOPMD
        query.setResultClass(WKSOPSCaseTmp.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSOPSCaseTmp> getPreviousWKSOPSCaseTmpObjects(long CaseId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSOPSCaseTmp\" where (\"CaseId\" < :CaseId) order by \"CaseId\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(CaseId));//NOPMD
        query.setResultClass(WKSOPSCaseTmp.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.worksitewsapppackage.WKSOPSCaseTmp getWKSOPSCaseTmpObject(long CaseId)
    {
        String queryText = "select * from \"WKSOPSCaseTmp\" where \"CaseId\" = :CaseId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(CaseId));//NOPMD
        query.setResultClass(WKSOPSCaseTmp.class);
        return (WKSOPSCaseTmp)query.getObject();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSOPSCaseTmp> getWKSOPSCaseTmpObjects(long fromCaseId, long toCaseId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSOPSCaseTmp\" where \"CaseId\" between :fromCaseId and :toCaseId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(fromCaseId));
        query.addParameter("toCaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(toCaseId));
        query.setResultClass(WKSOPSCaseTmp.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSOPSCaseTmp> getWKSOPSCaseTmpObjects(long fromCaseId, long toCaseId)
    {
        String queryText = "select * from \"WKSOPSCaseTmp\" where \"CaseId\" between :fromCaseId and :toCaseId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(fromCaseId));
        query.addParameter("toCaseId", "WKSOPSCaseTmp.CaseId", QueryObject.PARAM_INT, new Long(toCaseId));
        query.setResultClass(WKSOPSCaseTmp.class);
        return query.getObjects();
    }

}
