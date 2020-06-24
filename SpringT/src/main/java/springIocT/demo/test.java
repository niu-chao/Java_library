package springIocT.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: nc
 * @description：
 */

public class test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.storeBook("周杰伦");
        User user = ctx.getBean("getUser" , User.class);
        user.show();
    }
}
