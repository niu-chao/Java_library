package springIocT.demo;

import org.springframework.stereotype.Repository;

/**
 * @author: nc
 * @description：
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public String addBook(String bookName) {
        return "添加图书《" + bookName + "》成功";
    }
}
