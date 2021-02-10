package chenyx.dao.impl;

import chenyx.dao.DeptDao;
import chenyx.entity.Dept;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author mizuyeh
 */
@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public Dept selectDept(Integer deptId) {
        Dept dept = sqlSessionTemplate.selectOne("chenyx.dao.DeptDao.selectDept", deptId);
        return dept;
    }

    @Override
    public int insertDept(Dept dept) {
       return sqlSessionTemplate.insert("chenyx.dao.DeptDao.insertDept", dept);
    }
}
