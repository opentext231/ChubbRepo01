/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class file_searchBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_filename = "filename";
    public final static String ATTR_fileid = "fileid";
    public final static String ATTR_GROUPNUMBER = "GROUPNUMBER";
    public final static String ATTR_Folder = "Folder";
    public final static String ATTR_FileReceviedDate = "FileReceviedDate";
    public final static String ATTR_TaskInstanceId = "TaskInstanceId";
    public final static String ATTR_PreProcessingErrorType = "PreProcessingErrorType";
    public final static String ATTR_PPETimeStamp = "PPETimeStamp";
    public final static String ATTR_CCProcessed_Int = "CCProcessed_Int";
    public final static String ATTR_CCProcessed = "CCProcessed";
    public final static String ATTR_NEW_INDIVIDUAL_Int = "NEW_INDIVIDUAL_Int";
    public final static String ATTR_NEW_INDIVIDUAL = "NEW_INDIVIDUAL";
    public final static String ATTR_CHANGE_Int = "CHANGE_Int";
    public final static String ATTR_CHANGE = "CHANGE";
    public final static String ATTR_TERMINATED_Int = "TERMINATED_Int";
    public final static String ATTR_TERMINATED = "TERMINATED";
    public final static String ATTR_REINSTATEMENTS_Int = "REINSTATEMENTS_Int";
    public final static String ATTR_REINSTATEMENTS = "REINSTATEMENTS";
    public final static String ATTR_DUPLICATES_Int = "DUPLICATES_Int";
    public final static String ATTR_Duplicates = "Duplicates";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(file_search.class);
            s_classInfo.setTableName("file_search");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_filename);
                ai.setJavaName(ATTR_filename);
                ai.setColumnName(ATTR_filename);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_filename);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_fileid);
                ai.setJavaName(ATTR_fileid);
                ai.setColumnName(ATTR_fileid);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_fileid);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GROUPNUMBER);
                ai.setJavaName(ATTR_GROUPNUMBER);
                ai.setColumnName(ATTR_GROUPNUMBER);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GROUPNUMBER);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Folder);
                ai.setJavaName(ATTR_Folder);
                ai.setColumnName(ATTR_Folder);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Folder);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FileReceviedDate);
                ai.setJavaName(ATTR_FileReceviedDate);
                ai.setColumnName(ATTR_FileReceviedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskInstanceId);
                ai.setJavaName(ATTR_TaskInstanceId);
                ai.setColumnName(ATTR_TaskInstanceId);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskInstanceId);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PreProcessingErrorType);
                ai.setJavaName(ATTR_PreProcessingErrorType);
                ai.setColumnName(ATTR_PreProcessingErrorType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PreProcessingErrorType);
                v.setMaxLength(121);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PPETimeStamp);
                ai.setJavaName(ATTR_PPETimeStamp);
                ai.setColumnName(ATTR_PPETimeStamp);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PPETimeStamp);
                v.setMaxLength(120);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CCProcessed_Int);
                ai.setJavaName(ATTR_CCProcessed_Int);
                ai.setColumnName(ATTR_CCProcessed_Int);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CCProcessed_Int);
                v.setMaxLength(9);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CCProcessed);
                ai.setJavaName(ATTR_CCProcessed);
                ai.setColumnName(ATTR_CCProcessed);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CCProcessed);
                v.setMaxLength(9);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_NEW_INDIVIDUAL_Int);
                ai.setJavaName(ATTR_NEW_INDIVIDUAL_Int);
                ai.setColumnName(ATTR_NEW_INDIVIDUAL_Int);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_NEW_INDIVIDUAL_Int);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_NEW_INDIVIDUAL);
                ai.setJavaName(ATTR_NEW_INDIVIDUAL);
                ai.setColumnName(ATTR_NEW_INDIVIDUAL);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_NEW_INDIVIDUAL);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CHANGE_Int);
                ai.setJavaName(ATTR_CHANGE_Int);
                ai.setColumnName(ATTR_CHANGE_Int);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_CHANGE_Int);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CHANGE);
                ai.setJavaName(ATTR_CHANGE);
                ai.setColumnName(ATTR_CHANGE);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_CHANGE);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TERMINATED_Int);
                ai.setJavaName(ATTR_TERMINATED_Int);
                ai.setColumnName(ATTR_TERMINATED_Int);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_TERMINATED_Int);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TERMINATED);
                ai.setJavaName(ATTR_TERMINATED);
                ai.setColumnName(ATTR_TERMINATED);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_TERMINATED);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_REINSTATEMENTS_Int);
                ai.setJavaName(ATTR_REINSTATEMENTS_Int);
                ai.setColumnName(ATTR_REINSTATEMENTS_Int);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_REINSTATEMENTS_Int);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_REINSTATEMENTS);
                ai.setJavaName(ATTR_REINSTATEMENTS);
                ai.setColumnName(ATTR_REINSTATEMENTS);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_REINSTATEMENTS);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DUPLICATES_Int);
                ai.setJavaName(ATTR_DUPLICATES_Int);
                ai.setColumnName(ATTR_DUPLICATES_Int);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_DUPLICATES_Int);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Duplicates);
                ai.setJavaName(ATTR_Duplicates);
                ai.setColumnName(ATTR_Duplicates);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_Duplicates);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public file_searchBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getFilename()
    {
        return getStringProperty(ATTR_filename);
    }

    public void setFilename(String value)
    {
        setProperty(ATTR_filename, value, 0);
    }

    public long getFileid()
    {
        return getLongProperty(ATTR_fileid);
    }

    public void setFileid(long value)
    {
        setProperty(ATTR_fileid, value, 0);
    }

    public String getGROUPNUMBER()
    {
        return getStringProperty(ATTR_GROUPNUMBER);
    }

    public void setGROUPNUMBER(String value)
    {
        setProperty(ATTR_GROUPNUMBER, value, 0);
    }

    public String getFolder()
    {
        return getStringProperty(ATTR_Folder);
    }

    public void setFolder(String value)
    {
        setProperty(ATTR_Folder, value, 0);
    }

    public java.util.Date getFileReceviedDate()
    {
        return getDateTimestampProperty(ATTR_FileReceviedDate);
    }

    public void setFileReceviedDate(java.util.Date value)
    {
        setProperty(ATTR_FileReceviedDate, value, 0);
    }

    public String getTaskInstanceId()
    {
        return getStringProperty(ATTR_TaskInstanceId);
    }

    public void setTaskInstanceId(String value)
    {
        setProperty(ATTR_TaskInstanceId, value, 0);
    }

    public String getPreProcessingErrorType()
    {
        return getStringProperty(ATTR_PreProcessingErrorType);
    }

    public void setPreProcessingErrorType(String value)
    {
        setProperty(ATTR_PreProcessingErrorType, value, 0);
    }

    public String getPPETimeStamp()
    {
        return getStringProperty(ATTR_PPETimeStamp);
    }

    public void setPPETimeStamp(String value)
    {
        setProperty(ATTR_PPETimeStamp, value, 0);
    }

    public String getCCProcessed_Int()
    {
        return getStringProperty(ATTR_CCProcessed_Int);
    }

    public void setCCProcessed_Int(String value)
    {
        setProperty(ATTR_CCProcessed_Int, value, 0);
    }

    public String getCCProcessed()
    {
        return getStringProperty(ATTR_CCProcessed);
    }

    public void setCCProcessed(String value)
    {
        setProperty(ATTR_CCProcessed, value, 0);
    }

    public int getNEW_INDIVIDUAL_Int()
    {
        return getIntProperty(ATTR_NEW_INDIVIDUAL_Int);
    }

    public void setNEW_INDIVIDUAL_Int(int value)
    {
        setProperty(ATTR_NEW_INDIVIDUAL_Int, value, 0);
    }

    public int getNEW_INDIVIDUAL()
    {
        return getIntProperty(ATTR_NEW_INDIVIDUAL);
    }

    public void setNEW_INDIVIDUAL(int value)
    {
        setProperty(ATTR_NEW_INDIVIDUAL, value, 0);
    }

    public int getCHANGE_Int()
    {
        return getIntProperty(ATTR_CHANGE_Int);
    }

    public void setCHANGE_Int(int value)
    {
        setProperty(ATTR_CHANGE_Int, value, 0);
    }

    public int getCHANGE()
    {
        return getIntProperty(ATTR_CHANGE);
    }

    public void setCHANGE(int value)
    {
        setProperty(ATTR_CHANGE, value, 0);
    }

    public int getTERMINATED_Int()
    {
        return getIntProperty(ATTR_TERMINATED_Int);
    }

    public void setTERMINATED_Int(int value)
    {
        setProperty(ATTR_TERMINATED_Int, value, 0);
    }

    public int getTERMINATED()
    {
        return getIntProperty(ATTR_TERMINATED);
    }

    public void setTERMINATED(int value)
    {
        setProperty(ATTR_TERMINATED, value, 0);
    }

    public int getREINSTATEMENTS_Int()
    {
        return getIntProperty(ATTR_REINSTATEMENTS_Int);
    }

    public void setREINSTATEMENTS_Int(int value)
    {
        setProperty(ATTR_REINSTATEMENTS_Int, value, 0);
    }

    public int getREINSTATEMENTS()
    {
        return getIntProperty(ATTR_REINSTATEMENTS);
    }

    public void setREINSTATEMENTS(int value)
    {
        setProperty(ATTR_REINSTATEMENTS, value, 0);
    }

    public int getDUPLICATES_Int()
    {
        return getIntProperty(ATTR_DUPLICATES_Int);
    }

    public void setDUPLICATES_Int(int value)
    {
        setProperty(ATTR_DUPLICATES_Int, value, 0);
    }

    public int getDuplicates()
    {
        return getIntProperty(ATTR_Duplicates);
    }

    public void setDuplicates(int value)
    {
        setProperty(ATTR_Duplicates, value, 0);
    }



    public static BusObjectIterator<com.worksitewsapppackage.file_search> getFile_searchObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"file_search\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(file_search.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.file_search> getFile_searchObjects()
    {
        String queryText = "select * from \"file_search\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(file_search.class);
        return query.getObjects();
    }

}
