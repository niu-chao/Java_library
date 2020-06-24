package springIocT.demo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: nc
 * @description：
 */
@Service
public class BookService {
    @Resource
    BookDaoImpl bookDao;

    public void storeBook(String bookName) {
        String result = bookDao.addBook(bookName);
        System.out.println(result);
    }

}
