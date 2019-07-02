package com.cx.mybatis.dao.mapper;

import com.cx.mybatis.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmployeeById(Integer id);

    public void addEmp(Employee employee);

    public void updateEmp(Employee employee);

    public void deleteEmpById(Integer id);
}
