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


public abstract class tbl_underwriting_agent_backupBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_policy_number = "policy_number";
    public final static String ATTR_writing_agent_code = "writing_agent_code";
    public final static String ATTR_writing_agent_postion_code = "writing_agent_postion_code";
    public final static String ATTR_writing_agent_position_description = "writing_agent_position_description";
    public final static String ATTR_writing_agent_fname = "writing_agent_fname";
    public final static String ATTR_writing_agent_lname = "writing_agent_lname";
    public final static String ATTR_territory_mgr_agent_code = "territory_mgr_agent_code";
    public final static String ATTR_territory_mgr_postion_code = "territory_mgr_postion_code";
    public final static String ATTR_territory_mgr_position_description = "territory_mgr_position_description";
    public final static String ATTR_territory_mgr_fname = "territory_mgr_fname";
    public final static String ATTR_territory_mgr_lname = "territory_mgr_lname";
    public final static String ATTR_marketing_director_agent_code = "marketing_director_agent_code";
    public final static String ATTR_marketing_director_postion_code = "marketing_director_postion_code";
    public final static String ATTR_marketing_director_position_description = "marketing_director_position_description";
    public final static String ATTR_marketing_director_fname = "marketing_director_fname";
    public final static String ATTR_marketing_director_lname = "marketing_director_lname";
    public final static String ATTR_reporting_branch_agent_code = "reporting_branch_agent_code";
    public final static String ATTR_reporting_branch_postion_code = "reporting_branch_postion_code";
    public final static String ATTR_reporting_branch_position_description = "reporting_branch_position_description";
    public final static String ATTR_reporting_branch_fname = "reporting_branch_fname";
    public final static String ATTR_reporting_branch_lname = "reporting_branch_lname";
    public final static String ATTR_divisional_mgr_agent_code = "divisional_mgr_agent_code";
    public final static String ATTR_divisional_mgr_postion_code = "divisional_mgr_postion_code";
    public final static String ATTR_divisional_mgr_position_description = "divisional_mgr_position_description";
    public final static String ATTR_divisional_mgr_fname = "divisional_mgr_fname";
    public final static String ATTR_divisional_mgr_lname = "divisional_mgr_lname";
    public final static String ATTR_natl_sm_agent_code = "natl_sm_agent_code";
    public final static String ATTR_natl_sm_postion_code = "natl_sm_postion_code";
    public final static String ATTR_natl_sm_position_description = "natl_sm_position_description";
    public final static String ATTR_natl_sm_fname = "natl_sm_fname";
    public final static String ATTR_natl_sm_lname = "natl_sm_lname";
    public final static String ATTR_agent_code7 = "agent_code7";
    public final static String ATTR_agent_level7 = "agent_level7";
    public final static String ATTR_position_code7 = "position_code7";
    public final static String ATTR_first_name7 = "first_name7";
    public final static String ATTR_last_name7 = "last_name7";
    public final static String ATTR_agent_code8 = "agent_code8";
    public final static String ATTR_agent_level8 = "agent_level8";
    public final static String ATTR_position_code8 = "position_code8";
    public final static String ATTR_first_name8 = "first_name8";
    public final static String ATTR_last_name8 = "last_name8";
    public final static String ATTR_company_code = "company_code";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwriting_agent_backup.class);
            s_classInfo.setTableName("tbl_underwriting_agent_backup");
            s_classInfo.setUIDElements(new String[]{});
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
                AttributeInfo ai = new AttributeInfo(ATTR_writing_agent_code);
                ai.setJavaName(ATTR_writing_agent_code);
                ai.setColumnName(ATTR_writing_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_writing_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_writing_agent_postion_code);
                ai.setJavaName(ATTR_writing_agent_postion_code);
                ai.setColumnName(ATTR_writing_agent_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_writing_agent_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_writing_agent_position_description);
                ai.setJavaName(ATTR_writing_agent_position_description);
                ai.setColumnName(ATTR_writing_agent_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_writing_agent_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_writing_agent_fname);
                ai.setJavaName(ATTR_writing_agent_fname);
                ai.setColumnName(ATTR_writing_agent_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_writing_agent_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_writing_agent_lname);
                ai.setJavaName(ATTR_writing_agent_lname);
                ai.setColumnName(ATTR_writing_agent_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_writing_agent_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_territory_mgr_agent_code);
                ai.setJavaName(ATTR_territory_mgr_agent_code);
                ai.setColumnName(ATTR_territory_mgr_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_territory_mgr_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_territory_mgr_postion_code);
                ai.setJavaName(ATTR_territory_mgr_postion_code);
                ai.setColumnName(ATTR_territory_mgr_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_territory_mgr_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_territory_mgr_position_description);
                ai.setJavaName(ATTR_territory_mgr_position_description);
                ai.setColumnName(ATTR_territory_mgr_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_territory_mgr_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_territory_mgr_fname);
                ai.setJavaName(ATTR_territory_mgr_fname);
                ai.setColumnName(ATTR_territory_mgr_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_territory_mgr_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_territory_mgr_lname);
                ai.setJavaName(ATTR_territory_mgr_lname);
                ai.setColumnName(ATTR_territory_mgr_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_territory_mgr_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_marketing_director_agent_code);
                ai.setJavaName(ATTR_marketing_director_agent_code);
                ai.setColumnName(ATTR_marketing_director_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_marketing_director_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_marketing_director_postion_code);
                ai.setJavaName(ATTR_marketing_director_postion_code);
                ai.setColumnName(ATTR_marketing_director_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_marketing_director_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_marketing_director_position_description);
                ai.setJavaName(ATTR_marketing_director_position_description);
                ai.setColumnName(ATTR_marketing_director_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_marketing_director_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_marketing_director_fname);
                ai.setJavaName(ATTR_marketing_director_fname);
                ai.setColumnName(ATTR_marketing_director_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_marketing_director_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_marketing_director_lname);
                ai.setJavaName(ATTR_marketing_director_lname);
                ai.setColumnName(ATTR_marketing_director_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_marketing_director_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_reporting_branch_agent_code);
                ai.setJavaName(ATTR_reporting_branch_agent_code);
                ai.setColumnName(ATTR_reporting_branch_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_reporting_branch_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_reporting_branch_postion_code);
                ai.setJavaName(ATTR_reporting_branch_postion_code);
                ai.setColumnName(ATTR_reporting_branch_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_reporting_branch_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_reporting_branch_position_description);
                ai.setJavaName(ATTR_reporting_branch_position_description);
                ai.setColumnName(ATTR_reporting_branch_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_reporting_branch_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_reporting_branch_fname);
                ai.setJavaName(ATTR_reporting_branch_fname);
                ai.setColumnName(ATTR_reporting_branch_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_reporting_branch_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_reporting_branch_lname);
                ai.setJavaName(ATTR_reporting_branch_lname);
                ai.setColumnName(ATTR_reporting_branch_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_reporting_branch_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_divisional_mgr_agent_code);
                ai.setJavaName(ATTR_divisional_mgr_agent_code);
                ai.setColumnName(ATTR_divisional_mgr_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_divisional_mgr_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_divisional_mgr_postion_code);
                ai.setJavaName(ATTR_divisional_mgr_postion_code);
                ai.setColumnName(ATTR_divisional_mgr_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_divisional_mgr_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_divisional_mgr_position_description);
                ai.setJavaName(ATTR_divisional_mgr_position_description);
                ai.setColumnName(ATTR_divisional_mgr_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_divisional_mgr_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_divisional_mgr_fname);
                ai.setJavaName(ATTR_divisional_mgr_fname);
                ai.setColumnName(ATTR_divisional_mgr_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_divisional_mgr_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_divisional_mgr_lname);
                ai.setJavaName(ATTR_divisional_mgr_lname);
                ai.setColumnName(ATTR_divisional_mgr_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_divisional_mgr_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_natl_sm_agent_code);
                ai.setJavaName(ATTR_natl_sm_agent_code);
                ai.setColumnName(ATTR_natl_sm_agent_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_natl_sm_agent_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_natl_sm_postion_code);
                ai.setJavaName(ATTR_natl_sm_postion_code);
                ai.setColumnName(ATTR_natl_sm_postion_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_natl_sm_postion_code);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_natl_sm_position_description);
                ai.setJavaName(ATTR_natl_sm_position_description);
                ai.setColumnName(ATTR_natl_sm_position_description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_natl_sm_position_description);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_natl_sm_fname);
                ai.setJavaName(ATTR_natl_sm_fname);
                ai.setColumnName(ATTR_natl_sm_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_natl_sm_fname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_natl_sm_lname);
                ai.setJavaName(ATTR_natl_sm_lname);
                ai.setColumnName(ATTR_natl_sm_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_natl_sm_lname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_agent_code7);
                ai.setJavaName(ATTR_agent_code7);
                ai.setColumnName(ATTR_agent_code7);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_agent_code7);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_agent_level7);
                ai.setJavaName(ATTR_agent_level7);
                ai.setColumnName(ATTR_agent_level7);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_agent_level7);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_position_code7);
                ai.setJavaName(ATTR_position_code7);
                ai.setColumnName(ATTR_position_code7);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_position_code7);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_first_name7);
                ai.setJavaName(ATTR_first_name7);
                ai.setColumnName(ATTR_first_name7);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_first_name7);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_last_name7);
                ai.setJavaName(ATTR_last_name7);
                ai.setColumnName(ATTR_last_name7);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_last_name7);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_agent_code8);
                ai.setJavaName(ATTR_agent_code8);
                ai.setColumnName(ATTR_agent_code8);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_agent_code8);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_agent_level8);
                ai.setJavaName(ATTR_agent_level8);
                ai.setColumnName(ATTR_agent_level8);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_agent_level8);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_position_code8);
                ai.setJavaName(ATTR_position_code8);
                ai.setColumnName(ATTR_position_code8);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_position_code8);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_first_name8);
                ai.setJavaName(ATTR_first_name8);
                ai.setColumnName(ATTR_first_name8);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_first_name8);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_last_name8);
                ai.setJavaName(ATTR_last_name8);
                ai.setColumnName(ATTR_last_name8);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_last_name8);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
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
        }
        return s_classInfo;
    }

    public tbl_underwriting_agent_backupBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getPolicy_number()
    {
        return getStringProperty(ATTR_policy_number);
    }

    public void setPolicy_number(String value)
    {
        setProperty(ATTR_policy_number, value, 0);
    }

    public String getWriting_agent_code()
    {
        return getStringProperty(ATTR_writing_agent_code);
    }

    public void setWriting_agent_code(String value)
    {
        setProperty(ATTR_writing_agent_code, value, 0);
    }

    public String getWriting_agent_postion_code()
    {
        return getStringProperty(ATTR_writing_agent_postion_code);
    }

    public void setWriting_agent_postion_code(String value)
    {
        setProperty(ATTR_writing_agent_postion_code, value, 0);
    }

    public String getWriting_agent_position_description()
    {
        return getStringProperty(ATTR_writing_agent_position_description);
    }

    public void setWriting_agent_position_description(String value)
    {
        setProperty(ATTR_writing_agent_position_description, value, 0);
    }

    public String getWriting_agent_fname()
    {
        return getStringProperty(ATTR_writing_agent_fname);
    }

    public void setWriting_agent_fname(String value)
    {
        setProperty(ATTR_writing_agent_fname, value, 0);
    }

    public String getWriting_agent_lname()
    {
        return getStringProperty(ATTR_writing_agent_lname);
    }

    public void setWriting_agent_lname(String value)
    {
        setProperty(ATTR_writing_agent_lname, value, 0);
    }

    public String getTerritory_mgr_agent_code()
    {
        return getStringProperty(ATTR_territory_mgr_agent_code);
    }

    public void setTerritory_mgr_agent_code(String value)
    {
        setProperty(ATTR_territory_mgr_agent_code, value, 0);
    }

    public String getTerritory_mgr_postion_code()
    {
        return getStringProperty(ATTR_territory_mgr_postion_code);
    }

    public void setTerritory_mgr_postion_code(String value)
    {
        setProperty(ATTR_territory_mgr_postion_code, value, 0);
    }

    public String getTerritory_mgr_position_description()
    {
        return getStringProperty(ATTR_territory_mgr_position_description);
    }

    public void setTerritory_mgr_position_description(String value)
    {
        setProperty(ATTR_territory_mgr_position_description, value, 0);
    }

    public String getTerritory_mgr_fname()
    {
        return getStringProperty(ATTR_territory_mgr_fname);
    }

    public void setTerritory_mgr_fname(String value)
    {
        setProperty(ATTR_territory_mgr_fname, value, 0);
    }

    public String getTerritory_mgr_lname()
    {
        return getStringProperty(ATTR_territory_mgr_lname);
    }

    public void setTerritory_mgr_lname(String value)
    {
        setProperty(ATTR_territory_mgr_lname, value, 0);
    }

    public String getMarketing_director_agent_code()
    {
        return getStringProperty(ATTR_marketing_director_agent_code);
    }

    public void setMarketing_director_agent_code(String value)
    {
        setProperty(ATTR_marketing_director_agent_code, value, 0);
    }

    public String getMarketing_director_postion_code()
    {
        return getStringProperty(ATTR_marketing_director_postion_code);
    }

    public void setMarketing_director_postion_code(String value)
    {
        setProperty(ATTR_marketing_director_postion_code, value, 0);
    }

    public String getMarketing_director_position_description()
    {
        return getStringProperty(ATTR_marketing_director_position_description);
    }

    public void setMarketing_director_position_description(String value)
    {
        setProperty(ATTR_marketing_director_position_description, value, 0);
    }

    public String getMarketing_director_fname()
    {
        return getStringProperty(ATTR_marketing_director_fname);
    }

    public void setMarketing_director_fname(String value)
    {
        setProperty(ATTR_marketing_director_fname, value, 0);
    }

    public String getMarketing_director_lname()
    {
        return getStringProperty(ATTR_marketing_director_lname);
    }

    public void setMarketing_director_lname(String value)
    {
        setProperty(ATTR_marketing_director_lname, value, 0);
    }

    public String getReporting_branch_agent_code()
    {
        return getStringProperty(ATTR_reporting_branch_agent_code);
    }

    public void setReporting_branch_agent_code(String value)
    {
        setProperty(ATTR_reporting_branch_agent_code, value, 0);
    }

    public String getReporting_branch_postion_code()
    {
        return getStringProperty(ATTR_reporting_branch_postion_code);
    }

    public void setReporting_branch_postion_code(String value)
    {
        setProperty(ATTR_reporting_branch_postion_code, value, 0);
    }

    public String getReporting_branch_position_description()
    {
        return getStringProperty(ATTR_reporting_branch_position_description);
    }

    public void setReporting_branch_position_description(String value)
    {
        setProperty(ATTR_reporting_branch_position_description, value, 0);
    }

    public String getReporting_branch_fname()
    {
        return getStringProperty(ATTR_reporting_branch_fname);
    }

    public void setReporting_branch_fname(String value)
    {
        setProperty(ATTR_reporting_branch_fname, value, 0);
    }

    public String getReporting_branch_lname()
    {
        return getStringProperty(ATTR_reporting_branch_lname);
    }

    public void setReporting_branch_lname(String value)
    {
        setProperty(ATTR_reporting_branch_lname, value, 0);
    }

    public String getDivisional_mgr_agent_code()
    {
        return getStringProperty(ATTR_divisional_mgr_agent_code);
    }

    public void setDivisional_mgr_agent_code(String value)
    {
        setProperty(ATTR_divisional_mgr_agent_code, value, 0);
    }

    public String getDivisional_mgr_postion_code()
    {
        return getStringProperty(ATTR_divisional_mgr_postion_code);
    }

    public void setDivisional_mgr_postion_code(String value)
    {
        setProperty(ATTR_divisional_mgr_postion_code, value, 0);
    }

    public String getDivisional_mgr_position_description()
    {
        return getStringProperty(ATTR_divisional_mgr_position_description);
    }

    public void setDivisional_mgr_position_description(String value)
    {
        setProperty(ATTR_divisional_mgr_position_description, value, 0);
    }

    public String getDivisional_mgr_fname()
    {
        return getStringProperty(ATTR_divisional_mgr_fname);
    }

    public void setDivisional_mgr_fname(String value)
    {
        setProperty(ATTR_divisional_mgr_fname, value, 0);
    }

    public String getDivisional_mgr_lname()
    {
        return getStringProperty(ATTR_divisional_mgr_lname);
    }

    public void setDivisional_mgr_lname(String value)
    {
        setProperty(ATTR_divisional_mgr_lname, value, 0);
    }

    public String getNatl_sm_agent_code()
    {
        return getStringProperty(ATTR_natl_sm_agent_code);
    }

    public void setNatl_sm_agent_code(String value)
    {
        setProperty(ATTR_natl_sm_agent_code, value, 0);
    }

    public String getNatl_sm_postion_code()
    {
        return getStringProperty(ATTR_natl_sm_postion_code);
    }

    public void setNatl_sm_postion_code(String value)
    {
        setProperty(ATTR_natl_sm_postion_code, value, 0);
    }

    public String getNatl_sm_position_description()
    {
        return getStringProperty(ATTR_natl_sm_position_description);
    }

    public void setNatl_sm_position_description(String value)
    {
        setProperty(ATTR_natl_sm_position_description, value, 0);
    }

    public String getNatl_sm_fname()
    {
        return getStringProperty(ATTR_natl_sm_fname);
    }

    public void setNatl_sm_fname(String value)
    {
        setProperty(ATTR_natl_sm_fname, value, 0);
    }

    public String getNatl_sm_lname()
    {
        return getStringProperty(ATTR_natl_sm_lname);
    }

    public void setNatl_sm_lname(String value)
    {
        setProperty(ATTR_natl_sm_lname, value, 0);
    }

    public String getAgent_code7()
    {
        return getStringProperty(ATTR_agent_code7);
    }

    public void setAgent_code7(String value)
    {
        setProperty(ATTR_agent_code7, value, 0);
    }

    public String getAgent_level7()
    {
        return getStringProperty(ATTR_agent_level7);
    }

    public void setAgent_level7(String value)
    {
        setProperty(ATTR_agent_level7, value, 0);
    }

    public String getPosition_code7()
    {
        return getStringProperty(ATTR_position_code7);
    }

    public void setPosition_code7(String value)
    {
        setProperty(ATTR_position_code7, value, 0);
    }

    public String getFirst_name7()
    {
        return getStringProperty(ATTR_first_name7);
    }

    public void setFirst_name7(String value)
    {
        setProperty(ATTR_first_name7, value, 0);
    }

    public String getLast_name7()
    {
        return getStringProperty(ATTR_last_name7);
    }

    public void setLast_name7(String value)
    {
        setProperty(ATTR_last_name7, value, 0);
    }

    public String getAgent_code8()
    {
        return getStringProperty(ATTR_agent_code8);
    }

    public void setAgent_code8(String value)
    {
        setProperty(ATTR_agent_code8, value, 0);
    }

    public String getAgent_level8()
    {
        return getStringProperty(ATTR_agent_level8);
    }

    public void setAgent_level8(String value)
    {
        setProperty(ATTR_agent_level8, value, 0);
    }

    public String getPosition_code8()
    {
        return getStringProperty(ATTR_position_code8);
    }

    public void setPosition_code8(String value)
    {
        setProperty(ATTR_position_code8, value, 0);
    }

    public String getFirst_name8()
    {
        return getStringProperty(ATTR_first_name8);
    }

    public void setFirst_name8(String value)
    {
        setProperty(ATTR_first_name8, value, 0);
    }

    public String getLast_name8()
    {
        return getStringProperty(ATTR_last_name8);
    }

    public void setLast_name8(String value)
    {
        setProperty(ATTR_last_name8, value, 0);
    }

    public String getCompany_code()
    {
        return getStringProperty(ATTR_company_code);
    }

    public void setCompany_code(String value)
    {
        setProperty(ATTR_company_code, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_agent_backup> getTbl_underwriting_agent_backupObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_agent_backup\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_underwriting_agent_backup.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_agent_backup> getTbl_underwriting_agent_backupObjects()
    {
        String queryText = "select * from \"tbl_underwriting_agent_backup\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_underwriting_agent_backup.class);
        return query.getObjects();
    }

}
