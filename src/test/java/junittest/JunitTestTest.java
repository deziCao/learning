package junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import socketIO.BIOClientTest;

import static org.junit.Assert.*;

public class JunitTestTest extends BIOClientTest {

    @Test
    public void sayHello() {
        JunitTest junitTest = new JunitTest();
        junitTest.sayHello();
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testSayHello() {
        JunitTest junitTest = new JunitTest();
        junitTest.sayHello();
    }

    @Test
    public void getMethod() {
        JunitTest junitTest = new JunitTest();
        System.out.println(junitTest.getMethod());
    }
}