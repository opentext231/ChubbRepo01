/*
  This class has been generated by the Code Generator
*/

package com.chubb.pfp.pfpwsappserverpackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class PFP_ReviewActionSummaryBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_ActId = "ActId";
    public final static String ATTR_ActionType = "ActionType";
    public final static String ATTR_Description = "Description";
    public final static String ATTR_ActionBy = "ActionBy";
    public final static String ATTR_ActionDate = "ActionDate";
    public final static String ATTR_PolicyNbr = "PolicyNbr";
    public final static String ATTR_CaseNbr = "CaseNbr";
    public final static String ATTR_CaseInstId = "CaseInstId";
    public final static String ATTR_TaskId = "TaskId";
    public final static String ATTR_ScreenType = "ScreenType";
    public final static String ATTR_WorkItem = "WorkItem";
    public final static String ATTR_OldDescription = "OldDescription";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(PFP_ReviewActionSummary.class);
            s_classInfo.setTableName("PFP_ReviewActionSummary");
            s_classInfo.setUIDElements(new String[]{ATTR_ActId});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActId);
                ai.setJavaName(ATTR_ActId);
                ai.setColumnName(ATTR_ActId);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_ActId);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActionType);
                ai.setJavaName(ATTR_ActionType);
                ai.setColumnName(ATTR_ActionType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ActionType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Description);
                ai.setJavaName(ATTR_Description);
                ai.setColumnName(ATTR_Description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Description);
                v.setMaxLength(700);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActionBy);
                ai.setJavaName(ATTR_ActionBy);
                ai.setColumnName(ATTR_ActionBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ActionBy);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActionDate);
                ai.setJavaName(ATTR_ActionDate);
                ai.setColumnName(ATTR_ActionDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PolicyNbr);
                ai.setJavaName(ATTR_PolicyNbr);
                ai.setColumnName(ATTR_PolicyNbr);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PolicyNbr);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseNbr);
                ai.setJavaName(ATTR_CaseNbr);
                ai.setColumnName(ATTR_CaseNbr);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseNbr);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseInstId);
                ai.setJavaName(ATTR_CaseInstId);
                ai.setColumnName(ATTR_CaseInstId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseInstId);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskId);
                ai.setJavaName(ATTR_TaskId);
                ai.setColumnName(ATTR_TaskId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskId);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ScreenType);
                ai.setJavaName(ATTR_ScreenType);
                ai.setColumnName(ATTR_ScreenType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ScreenType);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_WorkItem);
                ai.setJavaName(ATTR_WorkItem);
                ai.setColumnName(ATTR_WorkItem);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_WorkItem);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_OldDescription);
                ai.setJavaName(ATTR_OldDescription);
                ai.setColumnName(ATTR_OldDescription);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_OldDescription);
                v.setMaxLength(800);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public PFP_ReviewActionSummaryBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getActId()
    {
        return getLongProperty(ATTR_ActId);
    }

    public void setActId(long value)
    {
        setProperty(ATTR_ActId, value, 0);
    }

    public String getActionType()
    {
        return getStringProperty(ATTR_ActionType);
    }

    public void setActionType(String value)
    {
        setProperty(ATTR_ActionType, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_Description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_Description, value, 0);
    }

    public String getActionBy()
    {
        return getStringProperty(ATTR_ActionBy);
    }

    public void setActionBy(String value)
    {
        setProperty(ATTR_ActionBy, value, 0);
    }

    public java.util.Date getActionDate()
    {
        return getDateTimestampProperty(ATTR_ActionDate);
    }

    public void setActionDate(java.util.Date value)
    {
        setProperty(ATTR_ActionDate, value, 0);
    }

    public String getPolicyNbr()
    {
        return getStringProperty(ATTR_PolicyNbr);
    }

    public void setPolicyNbr(String value)
    {
        setProperty(ATTR_PolicyNbr, value, 0);
    }

    public String getCaseNbr()
    {
        return getStringProperty(ATTR_CaseNbr);
    }

    public void setCaseNbr(String value)
    {
        setProperty(ATTR_CaseNbr, value, 0);
    }

    public String getCaseInstId()
    {
        return getStringProperty(ATTR_CaseInstId);
    }

    public void setCaseInstId(String value)
    {
        setProperty(ATTR_CaseInstId, value, 0);
    }

    public String getTaskId()
    {
        return getStringProperty(ATTR_TaskId);
    }

    public void setTaskId(String value)
    {
        setProperty(ATTR_TaskId, value, 0);
    }

    public String getScreenType()
    {
        return getStringProperty(ATTR_ScreenType);
    }

    public void setScreenType(String value)
    {
        setProperty(ATTR_ScreenType, value, 0);
    }

    public String getWorkItem()
    {
        return getStringProperty(ATTR_WorkItem);
    }

    public void setWorkItem(String value)
    {
        setProperty(ATTR_WorkItem, value, 0);
    }

    public String getOldDescription()
    {
        return getStringProperty(ATTR_OldDescription);
    }

    public void setOldDescription(String value)
    {
        setProperty(ATTR_OldDescription, value, 0);
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_ReviewActionSummary> getNextPFP_ReviewActionSummaryObjects(long ActId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_ReviewActionSummary\" where (\"ActId\" > :ActId) order by \"ActId\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(ActId));//NOPMD
        query.setResultClass(PFP_ReviewActionSummary.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.chubb.pfp.pfpwsappserverpackage.PFP_ReviewActionSummary getPFP_ReviewActionSummaryObject(long ActId)
    {
        String queryText = "select * from \"PFP_ReviewActionSummary\" where \"ActId\" = :ActId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(ActId));//NOPMD
        query.setResultClass(PFP_ReviewActionSummary.class);
        return (PFP_ReviewActionSummary)query.getObject();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_ReviewActionSummary> getPFP_ReviewActionSummaryObjects(long fromActId, long toActId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_ReviewActionSummary\" where \"ActId\" between :fromActId and :toActId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(fromActId));
        query.addParameter("toActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(toActId));
        query.setResultClass(PFP_ReviewActionSummary.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_ReviewActionSummary> getPFP_ReviewActionSummaryObjects(long fromActId, long toActId)
    {
        String queryText = "select * from \"PFP_ReviewActionSummary\" where \"ActId\" between :fromActId and :toActId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(fromActId));
        query.addParameter("toActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(toActId));
        query.setResultClass(PFP_ReviewActionSummary.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_ReviewActionSummary> getPreviousPFP_ReviewActionSummaryObjects(long ActId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_ReviewActionSummary\" where (\"ActId\" < :ActId) order by \"ActId\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ActId", "PFP_ReviewActionSummary.ActId", QueryObject.PARAM_INT, new Long(ActId));//NOPMD
        query.setResultClass(PFP_ReviewActionSummary.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

}
