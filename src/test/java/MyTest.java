import cn.lrc.pojo.Books;
import cn.lrc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: MyTest
 * @Description TODO
 * @ProjectName: ssmbuild
 * @Author: lrc2020
 * @Date 2022/6/14 14:48
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for(Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
