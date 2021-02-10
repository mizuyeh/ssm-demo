package chenyx.dao;

import chenyx.entity.Dept;


public interface DeptDao {
    Dept selectDept(Integer deptId);
    int insertDept(Dept dept);
}
