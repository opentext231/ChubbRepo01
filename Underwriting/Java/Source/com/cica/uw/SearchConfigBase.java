/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class SearchConfigBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Id = "Id";
    public final static String ATTR_TaskType = "TaskType";
    public final static String ATTR_CaseOrTaskName = "CaseOrTaskName";
    public final static String ATTR_ElementType = "ElementType";
    public final static String ATTR_ElementName = "ElementName";
    public final static String ATTR_ElementPath = "ElementPath";
    public final static String ATTR_ElementLabel = "ElementLabel";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(SearchConfig.class);
            s_classInfo.setTableName("SearchConfig");
            s_classInfo.setUIDElements(new String[]{ATTR_Id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Id);
                ai.setJavaName(ATTR_Id);
                ai.setColumnName(ATTR_Id);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_Id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskType);
                ai.setJavaName(ATTR_TaskType);
                ai.setColumnName(ATTR_TaskType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskType);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseOrTaskName);
                ai.setJavaName(ATTR_CaseOrTaskName);
                ai.setColumnName(ATTR_CaseOrTaskName);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseOrTaskName);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ElementType);
                ai.setJavaName(ATTR_ElementType);
                ai.setColumnName(ATTR_ElementType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ElementType);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ElementName);
                ai.setJavaName(ATTR_ElementName);
                ai.setColumnName(ATTR_ElementName);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ElementName);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ElementPath);
                ai.setJavaName(ATTR_ElementPath);
                ai.setColumnName(ATTR_ElementPath);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ElementPath);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ElementLabel);
                ai.setJavaName(ATTR_ElementLabel);
                ai.setColumnName(ATTR_ElementLabel);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ElementLabel);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public SearchConfigBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getId()
    {
        return getLongProperty(ATTR_Id);
    }

    public void setId(long value)
    {
        setProperty(ATTR_Id, value, 0);
    }

    public String getTaskType()
    {
        return getStringProperty(ATTR_TaskType);
    }

    public void setTaskType(String value)
    {
        setProperty(ATTR_TaskType, value, 0);
    }

    public String getCaseOrTaskName()
    {
        return getStringProperty(ATTR_CaseOrTaskName);
    }

    public void setCaseOrTaskName(String value)
    {
        setProperty(ATTR_CaseOrTaskName, value, 0);
    }

    public String getElementType()
    {
        return getStringProperty(ATTR_ElementType);
    }

    public void setElementType(String value)
    {
        setProperty(ATTR_ElementType, value, 0);
    }

    public String getElementName()
    {
        return getStringProperty(ATTR_ElementName);
    }

    public void setElementName(String value)
    {
        setProperty(ATTR_ElementName, value, 0);
    }

    public String getElementPath()
    {
        return getStringProperty(ATTR_ElementPath);
    }

    public void setElementPath(String value)
    {
        setProperty(ATTR_ElementPath, value, 0);
    }

    public String getElementLabel()
    {
        return getStringProperty(ATTR_ElementLabel);
    }

    public void setElementLabel(String value)
    {
        setProperty(ATTR_ElementLabel, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.SearchConfig> getNextSearchConfigObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchConfig\" where (\"Id\" > :Id) order by \"Id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchConfig.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.SearchConfig> getPreviousSearchConfigObjects(long Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchConfig\" where (\"Id\" < :Id) order by \"Id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchConfig.class);
        query.setCursor(cursor);
        return query.getObjects();
    }



    public static com.cica.uw.SearchConfig getSearchConfigObject(long Id)
    {
        String queryText = "select * from \"SearchConfig\" where \"Id\" = :Id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(Id));//NOPMD
        query.setResultClass(SearchConfig.class);
        return (SearchConfig)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigObjects(long fromId, long toId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"SearchConfig\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(SearchConfig.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.SearchConfig> getSearchConfigObjects(long fromId, long toId)
    {
        String queryText = "select * from \"SearchConfig\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(fromId));
        query.addParameter("toId", "SearchConfig.Id", QueryObject.PARAM_INT, new Long(toId));
        query.setResultClass(SearchConfig.class);
        return query.getObjects();
    }




}
