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


public abstract class tbl_pi_contactBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_objid = "objid";
    public final static String ATTR_dev = "dev";
    public final static String ATTR_x_fname = "x_fname";
    public final static String ATTR_x_mi = "x_mi";
    public final static String ATTR_x_lname = "x_lname";
    public final static String ATTR_x_suffix = "x_suffix";
    public final static String ATTR_x_dob = "x_dob";
    public final static String ATTR_x_ssn = "x_ssn";
    public final static String ATTR_x_gender = "x_gender";
    public final static String ATTR_x_res_phone = "x_res_phone";
    public final static String ATTR_x_cell_phone = "x_cell_phone";
    public final static String ATTR_x_default_phone = "x_default_phone";
    public final static String ATTR_x_email = "x_email";
    public final static String ATTR_x_bene_eff_date = "x_bene_eff_date";
    public final static String ATTR_x_relation_to_insured = "x_relation_to_insured";
    public final static String ATTR_x_pi_type = "x_pi_type";
    public final static String ATTR_x_bene_percent = "x_bene_percent";
    public final static String ATTR_x_comm_prop_state = "x_comm_prop_state";
    public final static String ATTR_x_group_beneficiary = "x_group_beneficiary";
    public final static String ATTR_x_res_addr_flag = "x_res_addr_flag";
    public final static String ATTR_x_mail_addr_flag = "x_mail_addr_flag";
    public final static String ATTR_x_default_addr = "x_default_addr";
    public final static String ATTR_x_pref_contact = "x_pref_contact";
    public final static String ATTR_x_company_code = "x_company_code";
    public final static String ATTR_x_mname = "x_mname";
    public final static String ATTR_x_prefix = "x_prefix";
    public final static String ATTR_x_comments = "x_comments";
    public final static String ATTR_x_create_date = "x_create_date";
    public final static String ATTR_x_create_user = "x_create_user";
    public final static String ATTR_x_update_date = "x_update_date";
    public final static String ATTR_x_update_user = "x_update_user";
    public final static String ATTR_x_mailaddr2x_piaddr = "x_mailaddr2x_piaddr";
    public final static String ATTR_x_resaddr2x_piaddr = "x_resaddr2x_piaddr";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_pi_contact.class);
            s_classInfo.setTableName("tbl_pi_contact");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_objid);
                ai.setJavaName(ATTR_objid);
                ai.setColumnName(ATTR_objid);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_objid);
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
                AttributeInfo ai = new AttributeInfo(ATTR_x_fname);
                ai.setJavaName(ATTR_x_fname);
                ai.setColumnName(ATTR_x_fname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_fname);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_mi);
                ai.setJavaName(ATTR_x_mi);
                ai.setColumnName(ATTR_x_mi);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_mi);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_lname);
                ai.setJavaName(ATTR_x_lname);
                ai.setColumnName(ATTR_x_lname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_lname);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_suffix);
                ai.setJavaName(ATTR_x_suffix);
                ai.setColumnName(ATTR_x_suffix);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_suffix);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_dob);
                ai.setJavaName(ATTR_x_dob);
                ai.setColumnName(ATTR_x_dob);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_ssn);
                ai.setJavaName(ATTR_x_ssn);
                ai.setColumnName(ATTR_x_ssn);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_ssn);
                v.setMaxLength(11);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_gender);
                ai.setJavaName(ATTR_x_gender);
                ai.setColumnName(ATTR_x_gender);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_gender);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_res_phone);
                ai.setJavaName(ATTR_x_res_phone);
                ai.setColumnName(ATTR_x_res_phone);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_res_phone);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_cell_phone);
                ai.setJavaName(ATTR_x_cell_phone);
                ai.setColumnName(ATTR_x_cell_phone);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_cell_phone);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_default_phone);
                ai.setJavaName(ATTR_x_default_phone);
                ai.setColumnName(ATTR_x_default_phone);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_default_phone);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_email);
                ai.setJavaName(ATTR_x_email);
                ai.setColumnName(ATTR_x_email);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_email);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_bene_eff_date);
                ai.setJavaName(ATTR_x_bene_eff_date);
                ai.setColumnName(ATTR_x_bene_eff_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_relation_to_insured);
                ai.setJavaName(ATTR_x_relation_to_insured);
                ai.setColumnName(ATTR_x_relation_to_insured);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_relation_to_insured);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_pi_type);
                ai.setJavaName(ATTR_x_pi_type);
                ai.setColumnName(ATTR_x_pi_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_pi_type);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_bene_percent);
                ai.setJavaName(ATTR_x_bene_percent);
                ai.setColumnName(ATTR_x_bene_percent);
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_x_bene_percent);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_comm_prop_state);
                ai.setJavaName(ATTR_x_comm_prop_state);
                ai.setColumnName(ATTR_x_comm_prop_state);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_comm_prop_state);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_group_beneficiary);
                ai.setJavaName(ATTR_x_group_beneficiary);
                ai.setColumnName(ATTR_x_group_beneficiary);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_group_beneficiary);
                v.setMaxLength(70);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_res_addr_flag);
                ai.setJavaName(ATTR_x_res_addr_flag);
                ai.setColumnName(ATTR_x_res_addr_flag);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_res_addr_flag);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_mail_addr_flag);
                ai.setJavaName(ATTR_x_mail_addr_flag);
                ai.setColumnName(ATTR_x_mail_addr_flag);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_mail_addr_flag);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_default_addr);
                ai.setJavaName(ATTR_x_default_addr);
                ai.setColumnName(ATTR_x_default_addr);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_default_addr);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_pref_contact);
                ai.setJavaName(ATTR_x_pref_contact);
                ai.setColumnName(ATTR_x_pref_contact);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_pref_contact);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_company_code);
                ai.setJavaName(ATTR_x_company_code);
                ai.setColumnName(ATTR_x_company_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_company_code);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_mname);
                ai.setJavaName(ATTR_x_mname);
                ai.setColumnName(ATTR_x_mname);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_mname);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_prefix);
                ai.setJavaName(ATTR_x_prefix);
                ai.setColumnName(ATTR_x_prefix);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_prefix);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_comments);
                ai.setJavaName(ATTR_x_comments);
                ai.setColumnName(ATTR_x_comments);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_comments);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_create_date);
                ai.setJavaName(ATTR_x_create_date);
                ai.setColumnName(ATTR_x_create_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_create_user);
                ai.setJavaName(ATTR_x_create_user);
                ai.setColumnName(ATTR_x_create_user);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_create_user);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_update_date);
                ai.setJavaName(ATTR_x_update_date);
                ai.setColumnName(ATTR_x_update_date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_update_user);
                ai.setJavaName(ATTR_x_update_user);
                ai.setColumnName(ATTR_x_update_user);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_x_update_user);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_mailaddr2x_piaddr);
                ai.setJavaName(ATTR_x_mailaddr2x_piaddr);
                ai.setColumnName(ATTR_x_mailaddr2x_piaddr);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_x_mailaddr2x_piaddr);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_x_resaddr2x_piaddr);
                ai.setJavaName(ATTR_x_resaddr2x_piaddr);
                ai.setColumnName(ATTR_x_resaddr2x_piaddr);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_x_resaddr2x_piaddr);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_pi_contactBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getObjid()
    {
        return getIntProperty(ATTR_objid);
    }

    public void setObjid(int value)
    {
        setProperty(ATTR_objid, value, 0);
    }

    public int getDev()
    {
        return getIntProperty(ATTR_dev);
    }

    public void setDev(int value)
    {
        setProperty(ATTR_dev, value, 0);
    }

    public String getX_fname()
    {
        return getStringProperty(ATTR_x_fname);
    }

    public void setX_fname(String value)
    {
        setProperty(ATTR_x_fname, value, 0);
    }

    public String getX_mi()
    {
        return getStringProperty(ATTR_x_mi);
    }

    public void setX_mi(String value)
    {
        setProperty(ATTR_x_mi, value, 0);
    }

    public String getX_lname()
    {
        return getStringProperty(ATTR_x_lname);
    }

    public void setX_lname(String value)
    {
        setProperty(ATTR_x_lname, value, 0);
    }

    public String getX_suffix()
    {
        return getStringProperty(ATTR_x_suffix);
    }

    public void setX_suffix(String value)
    {
        setProperty(ATTR_x_suffix, value, 0);
    }

    public java.util.Date getX_dob()
    {
        return getDateTimestampProperty(ATTR_x_dob);
    }

    public void setX_dob(java.util.Date value)
    {
        setProperty(ATTR_x_dob, value, 0);
    }

    public String getX_ssn()
    {
        return getStringProperty(ATTR_x_ssn);
    }

    public void setX_ssn(String value)
    {
        setProperty(ATTR_x_ssn, value, 0);
    }

    public String getX_gender()
    {
        return getStringProperty(ATTR_x_gender);
    }

    public void setX_gender(String value)
    {
        setProperty(ATTR_x_gender, value, 0);
    }

    public String getX_res_phone()
    {
        return getStringProperty(ATTR_x_res_phone);
    }

    public void setX_res_phone(String value)
    {
        setProperty(ATTR_x_res_phone, value, 0);
    }

    public String getX_cell_phone()
    {
        return getStringProperty(ATTR_x_cell_phone);
    }

    public void setX_cell_phone(String value)
    {
        setProperty(ATTR_x_cell_phone, value, 0);
    }

    public String getX_default_phone()
    {
        return getStringProperty(ATTR_x_default_phone);
    }

    public void setX_default_phone(String value)
    {
        setProperty(ATTR_x_default_phone, value, 0);
    }

    public String getX_email()
    {
        return getStringProperty(ATTR_x_email);
    }

    public void setX_email(String value)
    {
        setProperty(ATTR_x_email, value, 0);
    }

    public java.util.Date getX_bene_eff_date()
    {
        return getDateTimestampProperty(ATTR_x_bene_eff_date);
    }

    public void setX_bene_eff_date(java.util.Date value)
    {
        setProperty(ATTR_x_bene_eff_date, value, 0);
    }

    public String getX_relation_to_insured()
    {
        return getStringProperty(ATTR_x_relation_to_insured);
    }

    public void setX_relation_to_insured(String value)
    {
        setProperty(ATTR_x_relation_to_insured, value, 0);
    }

    public String getX_pi_type()
    {
        return getStringProperty(ATTR_x_pi_type);
    }

    public void setX_pi_type(String value)
    {
        setProperty(ATTR_x_pi_type, value, 0);
    }

    public double getX_bene_percent()
    {
        return getDoubleProperty(ATTR_x_bene_percent);
    }

    public void setX_bene_percent(double value)
    {
        setProperty(ATTR_x_bene_percent, value, 0);
    }

    public String getX_comm_prop_state()
    {
        return getStringProperty(ATTR_x_comm_prop_state);
    }

    public void setX_comm_prop_state(String value)
    {
        setProperty(ATTR_x_comm_prop_state, value, 0);
    }

    public String getX_group_beneficiary()
    {
        return getStringProperty(ATTR_x_group_beneficiary);
    }

    public void setX_group_beneficiary(String value)
    {
        setProperty(ATTR_x_group_beneficiary, value, 0);
    }

    public String getX_res_addr_flag()
    {
        return getStringProperty(ATTR_x_res_addr_flag);
    }

    public void setX_res_addr_flag(String value)
    {
        setProperty(ATTR_x_res_addr_flag, value, 0);
    }

    public String getX_mail_addr_flag()
    {
        return getStringProperty(ATTR_x_mail_addr_flag);
    }

    public void setX_mail_addr_flag(String value)
    {
        setProperty(ATTR_x_mail_addr_flag, value, 0);
    }

    public String getX_default_addr()
    {
        return getStringProperty(ATTR_x_default_addr);
    }

    public void setX_default_addr(String value)
    {
        setProperty(ATTR_x_default_addr, value, 0);
    }

    public String getX_pref_contact()
    {
        return getStringProperty(ATTR_x_pref_contact);
    }

    public void setX_pref_contact(String value)
    {
        setProperty(ATTR_x_pref_contact, value, 0);
    }

    public String getX_company_code()
    {
        return getStringProperty(ATTR_x_company_code);
    }

    public void setX_company_code(String value)
    {
        setProperty(ATTR_x_company_code, value, 0);
    }

    public String getX_mname()
    {
        return getStringProperty(ATTR_x_mname);
    }

    public void setX_mname(String value)
    {
        setProperty(ATTR_x_mname, value, 0);
    }

    public String getX_prefix()
    {
        return getStringProperty(ATTR_x_prefix);
    }

    public void setX_prefix(String value)
    {
        setProperty(ATTR_x_prefix, value, 0);
    }

    public String getX_comments()
    {
        return getStringProperty(ATTR_x_comments);
    }

    public void setX_comments(String value)
    {
        setProperty(ATTR_x_comments, value, 0);
    }

    public java.util.Date getX_create_date()
    {
        return getDateTimestampProperty(ATTR_x_create_date);
    }

    public void setX_create_date(java.util.Date value)
    {
        setProperty(ATTR_x_create_date, value, 0);
    }

    public String getX_create_user()
    {
        return getStringProperty(ATTR_x_create_user);
    }

    public void setX_create_user(String value)
    {
        setProperty(ATTR_x_create_user, value, 0);
    }

    public java.util.Date getX_update_date()
    {
        return getDateTimestampProperty(ATTR_x_update_date);
    }

    public void setX_update_date(java.util.Date value)
    {
        setProperty(ATTR_x_update_date, value, 0);
    }

    public String getX_update_user()
    {
        return getStringProperty(ATTR_x_update_user);
    }

    public void setX_update_user(String value)
    {
        setProperty(ATTR_x_update_user, value, 0);
    }

    public int getX_mailaddr2x_piaddr()
    {
        return getIntProperty(ATTR_x_mailaddr2x_piaddr);
    }

    public void setX_mailaddr2x_piaddr(int value)
    {
        setProperty(ATTR_x_mailaddr2x_piaddr, value, 0);
    }

    public int getX_resaddr2x_piaddr()
    {
        return getIntProperty(ATTR_x_resaddr2x_piaddr);
    }

    public void setX_resaddr2x_piaddr(int value)
    {
        setProperty(ATTR_x_resaddr2x_piaddr, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_pi_contact> GetBeneficiaryContactDetails(int objid)
    {
        String queryText = "select * from \"tbl_pi_contact\" where \"objid\" = :objid";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("objid", "tbl_pi_contact.objid", QueryObject.PARAM_INT, new Integer(objid));//NOPMD
        query.setResultClass(tbl_pi_contact.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_pi_contact> getTbl_pi_contactObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_pi_contact\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_pi_contact.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_pi_contact> getTbl_pi_contactObjects()
    {
        String queryText = "select * from \"tbl_pi_contact\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_pi_contact.class);
        return query.getObjects();
    }

}
