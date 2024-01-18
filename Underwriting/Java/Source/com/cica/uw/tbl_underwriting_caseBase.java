/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class tbl_underwriting_caseBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_id = "id";
    public final static String ATTR_Company_policy = "Company_policy";
    public final static String ATTR_Process_type = "Process_type";
    public final static String ATTR_task_id = "task_id";
    public final static String ATTR_Policy_number = "Policy_number";
    public final static String ATTR_Policy_status = "Policy_status";
    public final static String ATTR_Decision = "Decision";
    private final static String REL_Company_policyObject = "FK:tbl_underwriting_case[Company_policy]:tbl_underwriting[company_policy]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwriting_case.class);
            s_classInfo.setTableName("tbl_underwriting_case");
            s_classInfo.setUIDElements(new String[]{ATTR_task_id});
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
                AttributeInfo ai = new AttributeInfo(ATTR_Company_policy);
                ai.setJavaName(ATTR_Company_policy);
                ai.setColumnName(ATTR_Company_policy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Company_policy);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Process_type);
                ai.setJavaName(ATTR_Process_type);
                ai.setColumnName(ATTR_Process_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Process_type);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_task_id);
                ai.setJavaName(ATTR_task_id);
                ai.setColumnName(ATTR_task_id);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_task_id);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Policy_number);
                ai.setJavaName(ATTR_Policy_number);
                ai.setColumnName(ATTR_Policy_number);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Policy_number);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Policy_status);
                ai.setJavaName(ATTR_Policy_status);
                ai.setColumnName(ATTR_Policy_status);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Policy_status);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Decision);
                ai.setJavaName(ATTR_Decision);
                ai.setColumnName(ATTR_Decision);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Decision);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation Company_policyObject (FK:tbl_underwriting_case[Company_policy]:tbl_underwriting[company_policy])
                RelationInfo_FK ri = new RelationInfo_FK(REL_Company_policyObject);
                ri.setName("Company_policyObject");
                ri.setLocalAttributes(new String[]{ATTR_Company_policy});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.cica.uw.tbl_underwriting.class);
                ri.setRelatedAttributes(new String[]{"company_policy"});//NOPMD
                ri.setRelatedIdentifier("FK:tbl_underwriting[company_policy]:tbl_underwriting_case[Company_policy]");
                ri.setLoadMethod("loadCompany_policyObject");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public tbl_underwriting_caseBase(BusObjectConfig config)
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

    public String getCompany_policy()
    {
        return getStringProperty(ATTR_Company_policy);
    }

    public void setCompany_policy(String value)
    {
        String[] relations = new String[]{REL_Company_policyObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_Company_policy, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public String getProcess_type()
    {
        return getStringProperty(ATTR_Process_type);
    }

    public void setProcess_type(String value)
    {
        setProperty(ATTR_Process_type, value, 0);
    }

    public String getTask_id()
    {
        return getStringProperty(ATTR_task_id);
    }

    public void setTask_id(String value)
    {
        setProperty(ATTR_task_id, value, 0);
    }

    public String getPolicy_number()
    {
        return getStringProperty(ATTR_Policy_number);
    }

    public void setPolicy_number(String value)
    {
        setProperty(ATTR_Policy_number, value, 0);
    }

    public String getPolicy_status()
    {
        return getStringProperty(ATTR_Policy_status);
    }

    public void setPolicy_status(String value)
    {
        setProperty(ATTR_Policy_status, value, 0);
    }

    public String getDecision()
    {
        return getStringProperty(ATTR_Decision);
    }

    public void setDecision(String value)
    {
        setProperty(ATTR_Decision, value, 0);
    }

    public tbl_underwriting getCompany_policyObject()
    {
        return (tbl_underwriting)getSingleRelationObject(REL_Company_policyObject);
    }
    public tbl_underwriting loadCompany_policyObject()
    {
        String queryText = "select * from \"tbl_underwriting\" where \"company_policy\" = :Company_policy";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Company_policy", "tbl_underwriting.company_policy", QueryObject.PARAM_STRING, getCompany_policy());//NOPMD
        query.setResultClass(tbl_underwriting.class);
        return (tbl_underwriting)query.getObject();
    }


    public void setCompany_policyObject(tbl_underwriting a_tbl_underwriting)
    {
        if (a_tbl_underwriting == null)
        {
            this.setNull("Company_policy");
        }
        else
        {
            this.setCompany_policy(a_tbl_underwriting.getCompany_policy());
        }
    }

    public void setNull(String element)
    {
        super.setNull(element);
        if (ATTR_Company_policy.equals(element))
        {
            this.updateSingleRelation(REL_Company_policyObject, false);
        }
    }
    public static BusObjectIterator<com.cica.uw.tbl_underwriting_case> getNextTbl_underwriting_caseObjects(String Task_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where (\"task_id\" > :Task_id) order by \"task_id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Task_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, Task_id);//NOPMD
        query.setResultClass(tbl_underwriting_case.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_case> getPreviousTbl_underwriting_caseObjects(String Task_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where (\"task_id\" < :Task_id) order by \"task_id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Task_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, Task_id);//NOPMD
        query.setResultClass(tbl_underwriting_case.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tbl_underwriting_case getTbl_underwriting_caseObject(String Task_id)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where \"task_id\" = :Task_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Task_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, Task_id);//NOPMD
        query.setResultClass(tbl_underwriting_case.class);
        return (tbl_underwriting_case)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_case> getTbl_underwriting_caseObjects(String fromTask_id, String toTask_id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where \"task_id\" between :fromTask_id and :toTask_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromTask_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, fromTask_id);
        query.addParameter("toTask_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, toTask_id);
        query.setResultClass(tbl_underwriting_case.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_case> getTbl_underwriting_caseObjects(String fromTask_id, String toTask_id)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where \"task_id\" between :fromTask_id and :toTask_id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromTask_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, fromTask_id);
        query.addParameter("toTask_id", "tbl_underwriting_case.task_id", QueryObject.PARAM_STRING, toTask_id);
        query.setResultClass(tbl_underwriting_case.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_case> getTbl_underwriting_caseObjectsForCompany_policy(String Company_policy)
    {
        String queryText = "select * from \"tbl_underwriting_case\" where \"Company_policy\" = :Company_policy";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Company_policy", "tbl_underwriting_case.Company_policy", QueryObject.PARAM_STRING, Company_policy);//NOPMD
        query.setResultClass(tbl_underwriting_case.class);
        return query.getObjects();
    }

}