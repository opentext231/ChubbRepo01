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


public abstract class tbl_underwriting_worksheetBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_obj_id = "obj_id";
    public final static String ATTR_policy_number = "policy_number";
    public final static String ATTR_interaction_type = "interaction_type";
    public final static String ATTR_interaction_detail = "interaction_detail";
    public final static String ATTR_comment = "comment";
    public final static String ATTR_case_id = "case_id";
    public final static String ATTR_task_id = "task_id";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwriting_worksheet.class);
            s_classInfo.setTableName("tbl_underwriting_worksheet");
            s_classInfo.setUIDElements(new String[]{ATTR_obj_id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_obj_id);
                ai.setJavaName(ATTR_obj_id);
                ai.setColumnName(ATTR_obj_id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_obj_id);
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
                AttributeInfo ai = new AttributeInfo(ATTR_interaction_type);
                ai.setJavaName(ATTR_interaction_type);
                ai.setColumnName(ATTR_interaction_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_interaction_type);
                v.setMaxLength(300);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_interaction_detail);
                ai.setJavaName(ATTR_interaction_detail);
                ai.setColumnName(ATTR_interaction_detail);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_interaction_detail);
                v.setMaxLength(300);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_comment);
                ai.setJavaName(ATTR_comment);
                ai.setColumnName(ATTR_comment);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_comment);
                v.setMaxLength(3000);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_case_id);
                ai.setJavaName(ATTR_case_id);
                ai.setColumnName(ATTR_case_id);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_case_id);
                v.setMaxLength(300);
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

    public tbl_underwriting_worksheetBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getObj_id()
    {
        return getIntProperty(ATTR_obj_id);
    }

    public void setObj_id(int value)
    {
        setProperty(ATTR_obj_id, value, 0);
    }

    public String getPolicy_number()
    {
        return getStringProperty(ATTR_policy_number);
    }

    public void setPolicy_number(String value)
    {
        setProperty(ATTR_policy_number, value, 0);
    }

    public String getInteraction_type()
    {
        return getStringProperty(ATTR_interaction_type);
    }

    public void setInteraction_type(String value)
    {
        setProperty(ATTR_interaction_type, value, 0);
    }

    public String getInteraction_detail()
    {
        return getStringProperty(ATTR_interaction_detail);
    }

    public void setInteraction_detail(String value)
    {
        setProperty(ATTR_interaction_detail, value, 0);
    }

    public String getComment()
    {
        return getStringProperty(ATTR_comment);
    }

    public void setComment(String value)
    {
        setProperty(ATTR_comment, value, 0);
    }

    public String getCase_id()
    {
        return getStringProperty(ATTR_case_id);
    }

    public void setCase_id(String value)
    {
        setProperty(ATTR_case_id, value, 0);
    }

    public String getTask_id()
    {
        return getStringProperty(ATTR_task_id);
    }

    public void setTask_id(String value)
    {
        setProperty(ATTR_task_id, value, 0);
    }


    public static BusObjectIterator<com.cica.uw.tbl_underwriting_worksheet> getNextTbl_underwriting_worksheetObjects(int Obj_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_worksheet\" where (\"obj_id\" > :Obj_id) order by \"obj_id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Obj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(Obj_id));//NOPMD
        query.setResultClass(tbl_underwriting_worksheet.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_worksheet> getPreviousTbl_underwriting_worksheetObjects(int Obj_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_worksheet\" where (\"obj_id\" < :Obj_id) order by \"obj_id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Obj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(Obj_id));//NOPMD
        query.setResultClass(tbl_underwriting_worksheet.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tbl_underwriting_worksheet getTbl_underwriting_worksheetObject(int Obj_id)
    {
        String queryText = "select * from \"tbl_underwriting_worksheet\" where \"obj_id\" = :Obj_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Obj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(Obj_id));//NOPMD
        query.setResultClass(tbl_underwriting_worksheet.class);
        return (tbl_underwriting_worksheet)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_worksheet> getTbl_underwriting_worksheetObjects(int fromObj_id, int toObj_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_worksheet\" where \"obj_id\" between :fromObj_id and :toObj_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromObj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(fromObj_id));
        query.addParameter("toObj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(toObj_id));
        query.setResultClass(tbl_underwriting_worksheet.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_worksheet> getTbl_underwriting_worksheetObjects(int fromObj_id, int toObj_id)
    {
        String queryText = "select * from \"tbl_underwriting_worksheet\" where \"obj_id\" between :fromObj_id and :toObj_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromObj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(fromObj_id));
        query.addParameter("toObj_id", "tbl_underwriting_worksheet.obj_id", QueryObject.PARAM_INT, new Integer(toObj_id));
        query.setResultClass(tbl_underwriting_worksheet.class);
        return query.getObjects();
    }


}
