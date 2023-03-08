package com.hr.app.jpaexample.repository;

import com.hr.app.jpaexample.entity.Employee;
import com.hr.app.jpaexample.responses.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ravibeli@gmail.com
 * @project jpa-example
 * @created on 06 Mar, 2023 10:25 PM
 */

@Repository
public interface EmployeeRepository extends JpaSpecificationExecutor<Employee>,
        JpaRepository<Employee, Long> {
//    @Query("select employees.* from employees inner join departments on (departments.department_name = 'Marketing' and employees.first_name like 'B%' and employees.hire_date between '1987-06-17' and '1999-11-16'")
//    public List<EmployeeDto> detailsOfEmp();

}




