package com.swagger.dao;

import com.swagger.entity.teacher.Teacher;
import com.swagger.entity.teacher.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExampleWithBLOBs(TeacherExample example);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExampleWithBLOBs(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKeyWithBLOBs(Teacher record);

    int updateByPrimaryKey(Teacher record);
}