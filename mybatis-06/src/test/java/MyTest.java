import com.kuang.dao.StudentMapper;
import com.kuang.dao.TeacherMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: MyTesst
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Date: 2023-03-18 018 14:05
 * @Author: wangkejing
 */
public class MyTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher instance = mapper.getInstance(1);
        System.out.println(instance);
        sqlSession.close();
    }


    @Test
    public void testStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> studentList = mapper.getStudent();
        for(Student s : studentList) {
            System.out.println(s);
        }

        sqlSession.close();
    }
}
