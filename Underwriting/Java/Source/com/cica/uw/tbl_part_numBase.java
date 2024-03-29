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


public abstract class tbl_part_numBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_id = "id";
    public final static String ATTR_description = "description";
    public final static String ATTR_part_number = "part_number";
    public final static String ATTR_active = "active";
    public final static String ATTR_family = "family";
    public final static String ATTR_notes = "notes";
    public final static String ATTR_service_center_code = "service_center_code";
    public final static String ATTR_domain = "domain";
    public final static String ATTR_form_description = "form_description";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_part_num.class);
            s_classInfo.setTableName("tbl_part_num");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_id);
                ai.setJavaName(ATTR_id);
                ai.setColumnName(ATTR_id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_description);
                ai.setJavaName(ATTR_description);
                ai.setColumnName(ATTR_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_description);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_part_number);
                ai.setJavaName(ATTR_part_number);
                ai.setColumnName(ATTR_part_number);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_part_number);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_active);
                ai.setJavaName(ATTR_active);
                ai.setColumnName(ATTR_active);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_active);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_family);
                ai.setJavaName(ATTR_family);
                ai.setColumnName(ATTR_family);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_family);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_notes);
                ai.setJavaName(ATTR_notes);
                ai.setColumnName(ATTR_notes);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_notes);
                v.setMaxLength(1073741823);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_service_center_code);
                ai.setJavaName(ATTR_service_center_code);
                ai.setColumnName(ATTR_service_center_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_service_center_code);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_domain);
                ai.setJavaName(ATTR_domain);
                ai.setColumnName(ATTR_domain);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_domain);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_form_description);
                ai.setJavaName(ATTR_form_description);
                ai.setColumnName(ATTR_form_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_form_description);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_part_numBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getId()
    {
        return getIntProperty(ATTR_id);
    }

    public void setId(int value)
    {
        setProperty(ATTR_id, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_description, value, 0);
    }

    public String getPart_number()
    {
        return getStringProperty(ATTR_part_number);
    }

    public void setPart_number(String value)
    {
        setProperty(ATTR_part_number, value, 0);
    }

    public String getActive()
    {
        return getStringProperty(ATTR_active);
    }

    public void setActive(String value)
    {
        setProperty(ATTR_active, value, 0);
    }

    public String getFamily()
    {
        return getStringProperty(ATTR_family);
    }

    public void setFamily(String value)
    {
        setProperty(ATTR_family, value, 0);
    }

    public String getNotes()
    {
        return getStringProperty(ATTR_notes);
    }

    public void setNotes(String value)
    {
        setProperty(ATTR_notes, value, 0);
    }

    public String getService_center_code()
    {
        return getStringProperty(ATTR_service_center_code);
    }

    public void setService_center_code(String value)
    {
        setProperty(ATTR_service_center_code, value, 0);
    }

    public String getDomain()
    {
        return getStringProperty(ATTR_domain);
    }

    public void setDomain(String value)
    {
        setProperty(ATTR_domain, value, 0);
    }

    public String getForm_description()
    {
        return getStringProperty(ATTR_form_description);
    }

    public void setForm_description(String value)
    {
        setProperty(ATTR_form_description, value, 0);
    }

    public static com.cica.uw.tbl_part_num GetPolicyTypeDetail(String partNumber, String domain)
    {
        String queryText = "select * from \"tbl_part_num\" where \"part_number\" = :partNumber and \"domain\" = :domain";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("partNumber", "tbl_part_num.part_number", QueryObject.PARAM_STRING, partNumber);//NOPMD
        query.addParameter("domain", "tbl_part_num.domain", QueryObject.PARAM_STRING, domain);//NOPMD
        query.setResultClass(tbl_part_num.class);
        return (tbl_part_num)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_part_num> getTbl_part_numObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_part_num\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_part_num.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_part_num> getTbl_part_numObjects()
    {
        String queryText = "select * from \"tbl_part_num\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_part_num.class);
        return query.getObjects();
    }

}
