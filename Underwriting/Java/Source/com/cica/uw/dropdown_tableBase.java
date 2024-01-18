/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class dropdown_tableBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_company_code = "company_code";
    public final static String ATTR_Language = "Language";
    public final static String ATTR_Identifier = "Identifier";
    public final static String ATTR_Description = "Description";
    public final static String ATTR_Value = "Value";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(dropdown_table.class);
            s_classInfo.setTableName("dropdown_table");
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
                AttributeInfo ai = new AttributeInfo(ATTR_Language);
                ai.setJavaName(ATTR_Language);
                ai.setColumnName(ATTR_Language);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Language);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Identifier);
                ai.setJavaName(ATTR_Identifier);
                ai.setColumnName(ATTR_Identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Identifier);
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
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Value);
                ai.setJavaName(ATTR_Value);
                ai.setColumnName(ATTR_Value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Value);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public dropdown_tableBase(BusObjectConfig config)
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
        return getStringProperty(ATTR_Language);
    }

    public void setLanguage(String value)
    {
        setProperty(ATTR_Language, value, 0);
    }

    public String getIdentifier()
    {
        return getStringProperty(ATTR_Identifier);
    }

    public void setIdentifier(String value)
    {
        setProperty(ATTR_Identifier, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_Description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_Description, value, 0);
    }

    public String getValue()
    {
        return getStringProperty(ATTR_Value);
    }

    public void setValue(String value)
    {
        setProperty(ATTR_Value, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.dropdown_table> getDropdown_tableObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"dropdown_table\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(dropdown_table.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.dropdown_table> getDropdown_tableObjects()
    {
        String queryText = "select * from \"dropdown_table\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(dropdown_table.class);
        return query.getObjects();
    }


}
