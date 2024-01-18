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


public abstract class tbl_calllogBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Company_Policy = "Company_Policy";
    public final static String ATTR_policy_number = "policy_number";
    public final static String ATTR_phone_log_id = "phone_log_id";
    public final static String ATTR_title = "title";
    public final static String ATTR_creation_time = "creation_time";
    public final static String ATTR_hangup_time = "hangup_time";
    public final static String ATTR_notes = "notes";
    public final static String ATTR_action_type = "action_type";
    public final static String ATTR_due_date = "due_date";
    public final static String ATTR_logged_by = "logged_by";
    public final static String ATTR_logged_by_value = "logged_by_value";
    public final static String ATTR_uw_objid = "uw_objid";
    public final static String ATTR_outcome = "outcome";
    public final static String ATTR_task_id = "task_id";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_calllog.class);
            s_classInfo.setTableName("tbl_calllog");
            s_classInfo.setUIDElements(new String[]{ATTR_phone_log_id});
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
                AttributeInfo ai = new AttributeInfo(ATTR_policy_number);
                ai.setJavaName(ATTR_policy_number);
                ai.setColumnName(ATTR_policy_number);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_policy_number);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_phone_log_id);
                ai.setJavaName(ATTR_phone_log_id);
                ai.setColumnName(ATTR_phone_log_id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_phone_log_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_title);
                ai.setJavaName(ATTR_title);
                ai.setColumnName(ATTR_title);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_title);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_creation_time);
                ai.setJavaName(ATTR_creation_time);
                ai.setColumnName(ATTR_creation_time);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_hangup_time);
                ai.setJavaName(ATTR_hangup_time);
                ai.setColumnName(ATTR_hangup_time);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_notes);
                ai.setJavaName(ATTR_notes);
                ai.setColumnName(ATTR_notes);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_notes);
                v.setMaxLength(1500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_action_type);
                ai.setJavaName(ATTR_action_type);
                ai.setColumnName(ATTR_action_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_action_type);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_due_date);
                ai.setJavaName(ATTR_due_date);
                ai.setColumnName(ATTR_due_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_logged_by);
                ai.setJavaName(ATTR_logged_by);
                ai.setColumnName(ATTR_logged_by);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_logged_by);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_logged_by_value);
                ai.setJavaName(ATTR_logged_by_value);
                ai.setColumnName(ATTR_logged_by_value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_logged_by_value);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_uw_objid);
                ai.setJavaName(ATTR_uw_objid);
                ai.setColumnName(ATTR_uw_objid);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_uw_objid);
                v.setMaxLength(300);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_outcome);
                ai.setJavaName(ATTR_outcome);
                ai.setColumnName(ATTR_outcome);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_outcome);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_task_id);
                ai.setJavaName(ATTR_task_id);
                ai.setColumnName(ATTR_task_id);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_task_id);
                v.setMaxLength(300);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_calllogBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getCompany_Policy()
    {
        return getStringProperty(ATTR_Company_Policy);
    }

    public void setCompany_Policy(String value)
    {
        setProperty(ATTR_Company_Policy, value, 0);
    }

    public String getPolicy_number()
    {
        return getStringProperty(ATTR_policy_number);
    }

    public void setPolicy_number(String value)
    {
        setProperty(ATTR_policy_number, value, 0);
    }

    public int getPhone_log_id()
    {
        return getIntProperty(ATTR_phone_log_id);
    }

    public void setPhone_log_id(int value)
    {
        setProperty(ATTR_phone_log_id, value, 0);
    }

    public String getTitle()
    {
        return getStringProperty(ATTR_title);
    }

    public void setTitle(String value)
    {
        setProperty(ATTR_title, value, 0);
    }

    public java.util.Date getCreation_time()
    {
        return getDateTimestampProperty(ATTR_creation_time);
    }

    public void setCreation_time(java.util.Date value)
    {
        setProperty(ATTR_creation_time, value, 0);
    }

    public java.util.Date getHangup_time()
    {
        return getDateTimestampProperty(ATTR_hangup_time);
    }

    public void setHangup_time(java.util.Date value)
    {
        setProperty(ATTR_hangup_time, value, 0);
    }

    public String getNotes()
    {
        return getStringProperty(ATTR_notes);
    }

    public void setNotes(String value)
    {
        setProperty(ATTR_notes, value, 0);
    }

    public String getAction_type()
    {
        return getStringProperty(ATTR_action_type);
    }

    public void setAction_type(String value)
    {
        setProperty(ATTR_action_type, value, 0);
    }

    public java.util.Date getDue_date()
    {
        return getDateTimestampProperty(ATTR_due_date);
    }

    public void setDue_date(java.util.Date value)
    {
        setProperty(ATTR_due_date, value, 0);
    }

    public String getLogged_by()
    {
        return getStringProperty(ATTR_logged_by);
    }

    public void setLogged_by(String value)
    {
        setProperty(ATTR_logged_by, value, 0);
    }

    public String getLogged_by_value()
    {
        return getStringProperty(ATTR_logged_by_value);
    }

    public void setLogged_by_value(String value)
    {
        setProperty(ATTR_logged_by_value, value, 0);
    }

    public String getUw_objid()
    {
        return getStringProperty(ATTR_uw_objid);
    }

    public void setUw_objid(String value)
    {
        setProperty(ATTR_uw_objid, value, 0);
    }

    public String getOutcome()
    {
        return getStringProperty(ATTR_outcome);
    }

    public void setOutcome(String value)
    {
        setProperty(ATTR_outcome, value, 0);
    }

    public String getTask_id()
    {
        return getStringProperty(ATTR_task_id);
    }

    public void setTask_id(String value)
    {
        setProperty(ATTR_task_id, value, 0);
    }


    public static BusObjectIterator<com.cica.uw.tbl_calllog> getNextTbl_calllogObjects(int Phone_log_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_calllog\" where (\"phone_log_id\" > :Phone_log_id) order by \"phone_log_id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Phone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(Phone_log_id));//NOPMD
        query.setResultClass(tbl_calllog.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_calllog> getPreviousTbl_calllogObjects(int Phone_log_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_calllog\" where (\"phone_log_id\" < :Phone_log_id) order by \"phone_log_id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Phone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(Phone_log_id));//NOPMD
        query.setResultClass(tbl_calllog.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tbl_calllog getTbl_calllogObject(int Phone_log_id)
    {
        String queryText = "select * from \"tbl_calllog\" where \"phone_log_id\" = :Phone_log_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Phone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(Phone_log_id));//NOPMD
        query.setResultClass(tbl_calllog.class);
        return (tbl_calllog)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_calllog> getTbl_calllogObjects(int fromPhone_log_id, int toPhone_log_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_calllog\" where \"phone_log_id\" between :fromPhone_log_id and :toPhone_log_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromPhone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(fromPhone_log_id));
        query.addParameter("toPhone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(toPhone_log_id));
        query.setResultClass(tbl_calllog.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_calllog> getTbl_calllogObjects(int fromPhone_log_id, int toPhone_log_id)
    {
        String queryText = "select * from \"tbl_calllog\" where \"phone_log_id\" between :fromPhone_log_id and :toPhone_log_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromPhone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(fromPhone_log_id));
        query.addParameter("toPhone_log_id", "tbl_calllog.phone_log_id", QueryObject.PARAM_INT, new Integer(toPhone_log_id));
        query.setResultClass(tbl_calllog.class);
        return query.getObjects();
    }

}
