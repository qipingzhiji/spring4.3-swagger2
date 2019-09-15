package com.swagger.entity.teacher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    private Byte id;

    private String first_name;

    private Integer sex;

    private String subject;

    private Byte deptNum;

    private String comment;
}