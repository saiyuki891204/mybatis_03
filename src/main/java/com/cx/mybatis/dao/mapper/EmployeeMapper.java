package com.cx.mybatis.dao.mapper;

import com.cx.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public void addEmp(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(Integer id);

    public Employee getEmployeeByIdAndLastname(@Param("id")Integer id,@Param("last_name")String lastName);

    public Employee getEmployeeByMap(Map map);
}
