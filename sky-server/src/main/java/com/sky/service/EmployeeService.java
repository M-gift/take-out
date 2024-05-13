package com.sky.service;

import com.sky.constant.PasswordConstant;
import com.sky.constant.StatusConstant;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;
import java.time.LocalTime;

// 函数声明
public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    //新增员工

    void save(EmployeeDTO employeeDTO);

}
