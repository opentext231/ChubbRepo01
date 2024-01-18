/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class WKS_dropdown_tableBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_company_code = "company_code";
    public final static String ATTR_language = "language";
    public final static String ATTR_identifier = "identifier";
    public final static String ATTR_description = "description";
    public final static String ATTR_value = "value";
    public final static String ATTR_CreatedBy = "CreatedBy";
    public final static String ATTR_CreatedDate = "CreatedDate";
    public final static String ATTR_UpdatedBy = "UpdatedBy";
    public final static String ATTR_UpdatedDate = "UpdatedDate";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(WKS_dropdown_table.class);
            s_classInfo.setTableName("WKS_dropdown_table");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_company_code);
                ai.setJavaName(ATTR_company_code);
                ai.setColumnName(ATTR_company_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_company_code);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_language);
                ai.setJavaName(ATTR_language);
                ai.setColumnName(ATTR_language);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_language);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_identifier);
                ai.setJavaName(ATTR_identifier);
                ai.setColumnName(ATTR_identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_identifier);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_description);
                ai.setJavaName(ATTR_description);
                ai.setColumnName(ATTR_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_description);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_value);
                ai.setJavaName(ATTR_value);
                ai.setColumnName(ATTR_value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_value);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedBy);
                ai.setJavaName(ATTR_CreatedBy);
                ai.setColumnName(ATTR_CreatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CreatedBy);
                v.setMaxLength(60);
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
                v.setMaxLength(60);
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

    public WKS_dropdown_tableBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getCompany_code()
    {
        return getStringProperty(ATTR_company_code);
    }

    public void setCompany_code(String value)
    {
        setProperty(ATTR_company_code, value, 0);
    }

    public String getLanguage()
    {
        return getStringProperty(ATTR_language);
    }

    public void setLanguage(String value)
    {
        setProperty(ATTR_language, value, 0);
    }

    public String getIdentifier()
    {
        return getStringProperty(ATTR_identifier);
    }

    public void setIdentifier(String value)
    {
        setProperty(ATTR_identifier, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_description, value, 0);
    }

    public String getValue()
    {
        return getStringProperty(ATTR_value);
    }

    public void setValue(String value)
    {
        setProperty(ATTR_value, value, 0);
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

    public static BusObjectIterator<com.worksitewsapppackage.WKS_dropdown_table> getWKS_dropdown_tableObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKS_dropdown_table\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(WKS_dropdown_table.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKS_dropdown_table> getWKS_dropdown_tableObjects()
    {
        String queryText = "select * from \"WKS_dropdown_table\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(WKS_dropdown_table.class);
        return query.getObjects();
    }

}
