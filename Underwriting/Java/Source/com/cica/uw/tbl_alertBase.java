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


public abstract class tbl_alertBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_id = "id";
    public final static String ATTR_type = "type";
    public final static String ATTR_alert_text = "alert_text";
    public final static String ATTR_start_date = "start_date";
    public final static String ATTR_end_date = "end_date";
    public final static String ATTR_active = "active";
    public final static String ATTR_title = "title";
    public final static String ATTR_hot = "hot";
    public final static String ATTR_dev = "dev";
    public final static String ATTR_modify_stmp = "modify_stmp";
    public final static String ATTR_last_update_date = "last_update_date";
    public final static String ATTR_last_update2user = "last_update2user";
    public final static String ATTR_alert2contact = "alert2contact";
    public final static String ATTR_alert2site = "alert2site";
    public final static String ATTR_alert2contract = "alert2contract";
    public final static String ATTR_alert2bus_org = "alert2bus_org";
    public final static String ATTR_alert2opportunity = "alert2opportunity";
    public final static String ATTR_alert2lead = "alert2lead";
    public final static String ATTR_focus_type = "focus_type";
    public final static String ATTR_focus_lowid = "focus_lowid";
    public final static String ATTR_Company_Policy = "Company_Policy";
    public final static String ATTR_audittext = "audittext";
    public final static String ATTR_auditvalue = "auditvalue";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_alert.class);
            s_classInfo.setTableName("tbl_alert");
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
                AttributeInfo ai = new AttributeInfo(ATTR_type);
                ai.setJavaName(ATTR_type);
                ai.setColumnName(ATTR_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_type);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert_text);
                ai.setJavaName(ATTR_alert_text);
                ai.setColumnName(ATTR_alert_text);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_alert_text);
                v.setMaxLength(1073741823);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_start_date);
                ai.setJavaName(ATTR_start_date);
                ai.setColumnName(ATTR_start_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_end_date);
                ai.setJavaName(ATTR_end_date);
                ai.setColumnName(ATTR_end_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_active);
                ai.setJavaName(ATTR_active);
                ai.setColumnName(ATTR_active);
                ai.setAttributeClass(com.cordys.cpc.bsf.types.UnsignedByte.class);
                NumberValidator v = new NumberValidator(ATTR_active);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_title);
                ai.setJavaName(ATTR_title);
                ai.setColumnName(ATTR_title);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_title);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_hot);
                ai.setJavaName(ATTR_hot);
                ai.setColumnName(ATTR_hot);
                ai.setAttributeClass(com.cordys.cpc.bsf.types.UnsignedByte.class);
                NumberValidator v = new NumberValidator(ATTR_hot);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_dev);
                ai.setJavaName(ATTR_dev);
                ai.setColumnName(ATTR_dev);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_dev);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_modify_stmp);
                ai.setJavaName(ATTR_modify_stmp);
                ai.setColumnName(ATTR_modify_stmp);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_last_update_date);
                ai.setJavaName(ATTR_last_update_date);
                ai.setColumnName(ATTR_last_update_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_last_update2user);
                ai.setJavaName(ATTR_last_update2user);
                ai.setColumnName(ATTR_last_update2user);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_last_update2user);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2contact);
                ai.setJavaName(ATTR_alert2contact);
                ai.setColumnName(ATTR_alert2contact);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2contact);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2site);
                ai.setJavaName(ATTR_alert2site);
                ai.setColumnName(ATTR_alert2site);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2site);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2contract);
                ai.setJavaName(ATTR_alert2contract);
                ai.setColumnName(ATTR_alert2contract);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2contract);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2bus_org);
                ai.setJavaName(ATTR_alert2bus_org);
                ai.setColumnName(ATTR_alert2bus_org);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2bus_org);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2opportunity);
                ai.setJavaName(ATTR_alert2opportunity);
                ai.setColumnName(ATTR_alert2opportunity);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2opportunity);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_alert2lead);
                ai.setJavaName(ATTR_alert2lead);
                ai.setColumnName(ATTR_alert2lead);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_alert2lead);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_focus_type);
                ai.setJavaName(ATTR_focus_type);
                ai.setColumnName(ATTR_focus_type);
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_focus_type);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_focus_lowid);
                ai.setJavaName(ATTR_focus_lowid);
                ai.setColumnName(ATTR_focus_lowid);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_focus_lowid);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Company_Policy);
                ai.setJavaName(ATTR_Company_Policy);
                ai.setColumnName(ATTR_Company_Policy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Company_Policy);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_audittext);
                ai.setJavaName(ATTR_audittext);
                ai.setColumnName(ATTR_audittext);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_audittext);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_auditvalue);
                ai.setJavaName(ATTR_auditvalue);
                ai.setColumnName(ATTR_auditvalue);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_auditvalue);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_alertBase(BusObjectConfig config)
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

    public String getType()
    {
        return getStringProperty(ATTR_type);
    }

    public void setType(String value)
    {
        setProperty(ATTR_type, value, 0);
    }

    public String getAlert_text()
    {
        return getStringProperty(ATTR_alert_text);
    }

    public void setAlert_text(String value)
    {
        setProperty(ATTR_alert_text, value, 0);
    }

    public java.util.Date getStart_date()
    {
        return getDateTimestampProperty(ATTR_start_date);
    }

    public void setStart_date(java.util.Date value)
    {
        setProperty(ATTR_start_date, value, 0);
    }

    public java.util.Date getEnd_date()
    {
        return getDateTimestampProperty(ATTR_end_date);
    }

    public void setEnd_date(java.util.Date value)
    {
        setProperty(ATTR_end_date, value, 0);
    }

    public com.cordys.cpc.bsf.types.UnsignedByte getActive()
    {
        return getUi1Property(ATTR_active);
    }

    public void setActive(com.cordys.cpc.bsf.types.UnsignedByte value)
    {
        setProperty(ATTR_active, value, 0);
    }

    public String getTitle()
    {
        return getStringProperty(ATTR_title);
    }

    public void setTitle(String value)
    {
        setProperty(ATTR_title, value, 0);
    }

    public com.cordys.cpc.bsf.types.UnsignedByte getHot()
    {
        return getUi1Property(ATTR_hot);
    }

    public void setHot(com.cordys.cpc.bsf.types.UnsignedByte value)
    {
        setProperty(ATTR_hot, value, 0);
    }

    public int getDev()
    {
        return getIntProperty(ATTR_dev);
    }

    public void setDev(int value)
    {
        setProperty(ATTR_dev, value, 0);
    }

    public java.util.Date getModify_stmp()
    {
        return getDateTimestampProperty(ATTR_modify_stmp);
    }

    public void setModify_stmp(java.util.Date value)
    {
        setProperty(ATTR_modify_stmp, value, 0);
    }

    public java.util.Date getLast_update_date()
    {
        return getDateTimestampProperty(ATTR_last_update_date);
    }

    public void setLast_update_date(java.util.Date value)
    {
        setProperty(ATTR_last_update_date, value, 0);
    }

    public int getLast_update2user()
    {
        return getIntProperty(ATTR_last_update2user);
    }

    public void setLast_update2user(int value)
    {
        setProperty(ATTR_last_update2user, value, 0);
    }

    public int getAlert2contact()
    {
        return getIntProperty(ATTR_alert2contact);
    }

    public void setAlert2contact(int value)
    {
        setProperty(ATTR_alert2contact, value, 0);
    }

    public int getAlert2site()
    {
        return getIntProperty(ATTR_alert2site);
    }

    public void setAlert2site(int value)
    {
        setProperty(ATTR_alert2site, value, 0);
    }

    public int getAlert2contract()
    {
        return getIntProperty(ATTR_alert2contract);
    }

    public void setAlert2contract(int value)
    {
        setProperty(ATTR_alert2contract, value, 0);
    }

    public int getAlert2bus_org()
    {
        return getIntProperty(ATTR_alert2bus_org);
    }

    public void setAlert2bus_org(int value)
    {
        setProperty(ATTR_alert2bus_org, value, 0);
    }

    public int getAlert2opportunity()
    {
        return getIntProperty(ATTR_alert2opportunity);
    }

    public void setAlert2opportunity(int value)
    {
        setProperty(ATTR_alert2opportunity, value, 0);
    }

    public int getAlert2lead()
    {
        return getIntProperty(ATTR_alert2lead);
    }

    public void setAlert2lead(int value)
    {
        setProperty(ATTR_alert2lead, value, 0);
    }

    public short getFocus_type()
    {
        return getShortProperty(ATTR_focus_type);
    }

    public void setFocus_type(short value)
    {
        setProperty(ATTR_focus_type, value, 0);
    }

    public int getFocus_lowid()
    {
        return getIntProperty(ATTR_focus_lowid);
    }

    public void setFocus_lowid(int value)
    {
        setProperty(ATTR_focus_lowid, value, 0);
    }

    public String getCompany_Policy()
    {
        return getStringProperty(ATTR_Company_Policy);
    }

    public void setCompany_Policy(String value)
    {
        setProperty(ATTR_Company_Policy, value, 0);
    }

    public String getAudittext()
    {
        return getStringProperty(ATTR_audittext);
    }

    public void setAudittext(String value)
    {
        setProperty(ATTR_audittext, value, 0);
    }

    public String getAuditvalue()
    {
        return getStringProperty(ATTR_auditvalue);
    }

    public void setAuditvalue(String value)
    {
        setProperty(ATTR_auditvalue, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_alert> GetAuditMessagesForPolicy(String title)
    {
        String queryText = "select * from \"tbl_alert\" where \"title\" = :title";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("title", "tbl_alert.title", QueryObject.PARAM_STRING, title);//NOPMD
        query.setResultClass(tbl_alert.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_alert> getTbl_alertObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_alert\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_alert.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_alert> getTbl_alertObjects()
    {
        String queryText = "select * from \"tbl_alert\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_alert.class);
        return query.getObjects();
    }

}
