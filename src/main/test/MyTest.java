import chenyx.dao.DeptDao;
import chenyx.dao.impl.DeptDaoImpl;
import chenyx.entity.Dept;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    static private DeptDao deptDao;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        deptDao = (DeptDaoImpl) context.getBean("deptDao");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{}

    @Test
    public void testSelectDept() {
        System.out.println(deptDao.selectDept(1));
    }

    @Test
    public void testInsertDept() {
        Dept dept = new Dept();
        dept.setDeptName("zhangsan");
        dept.setDeptAddress("西河口乡");
        System.out.println("受影响行数：" + deptDao.insertDept(dept));
    }
}
