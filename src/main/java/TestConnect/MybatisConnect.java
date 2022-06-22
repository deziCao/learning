package TestConnect;

import entity.Detail1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @ClassName MybatisConnect
 * @Author caodz
 * @Date 2022/6/20
 **/
public class MybatisConnect {

    public static void main(String[] args) {
        Reader reader;
        SqlSession sqlSession = null;
        try {
            //1、获得sqlSessionFactory
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //2、获得sqlSession
            sqlSession = sqlSessionFactory.openSession();
            List<Detail1> o = sqlSession.selectList("aaa.cc");
            for (Detail1 detail1 : o) {
                System.out.println("" + detail1.getChannel() + detail1.getUserId());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
