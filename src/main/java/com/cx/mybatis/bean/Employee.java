package com.cx.mybatis.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("employee")
public class Employee {

    private Integer id;
    private String last_name;

    public Employee(Integer id, String last_name, String gender, String email) {
        this.id = id;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
    }

    private String gender;
    private String email;



    public Employee() {
    }

}
