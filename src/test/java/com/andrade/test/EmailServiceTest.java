//package com.andrade.test;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.andrade.Application;
//import com.andrade.email.model.Email;
//import com.andrade.email.service.EmailService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
//public class EmailServiceTest {
//
//    @Autowired
//    private EmailService emailService;
//
//    @Autowired
//    private ElasticsearchTemplate esTemplate;
//
//    @Before
//    public void before() {
//        esTemplate.deleteIndex(Email.class);
//        esTemplate.createIndex(Email.class);
//        esTemplate.putMapping(Email.class);
//        esTemplate.refresh(Email.class);
//    }
//
//    @Test
//    public void testSave() {
//
////        Email email = new Email("52af48b6d55148fa0c1996d9", "Ronaldo", "cr7@gmail.com", "messi@gmail.com", "Text", "masche@gmail.com", "13-MAR-2017", "Foot");
////        Email testBook = emailService.save(email);
//
////        assertNotNull(testBook.getId());
////        assertEquals(testBook.getTitle(), email.getTitle());
////        assertEquals(testBook.getAuthor(), email.getAuthor());
////        assertEquals(testBook.getReleaseDate(), email.getReleaseDate());
//
//    }
//
//    @Test
//    public void testFindOne() {
//
//        Email book = new Email("52af48b6d55148fa0c1996d9", "Ronaldo", "cr7@gmail.com", "messi@gmail.com", "Text", "masche@gmail.com", "13-MAR-2017", "Foot");
//        emailService.save(book);
//
//        Email testBook = emailService.findOne(book.getId());
//
//        assertNotNull(testBook.getId());
////        assertEquals(testBook.getTitle(), book.getTitle());
////        assertEquals(testBook.getAuthor(), book.getAuthor());
////        assertEquals(testBook.getReleaseDate(), book.getReleaseDate());
//
//    }
//
//    @Test
//    public void testFindByTitle() {
//
//        Email book = new Email("52af48b6d55148fa0c1996d9", "Ronaldo", "cr7@gmail.com", "messi@gmail.com", "Text", "masche@gmail.com", "13-MAR-2017", "Foot");
//        emailService.save(book);
//
////        List<Email> byTitle = emailService.findByTitle(book.getTitle());
////        assertThat(byTitle.size(), is(1));
//    }
//
////    @Test
////    public void testFindByAuthor() {
////
////        List<Email> bookList = new ArrayList<>();
////
////        bookList.add(new Email("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
////        bookList.add(new Email("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
////        bookList.add(new Email("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));
////        bookList.add(new Email("1007", "Spring Data + ElasticSearch", "Rambabu Posa", "01-APR-2017"));
////        bookList.add(new Email("1008", "Spring Boot + MongoDB", "Mkyong", "25-FEB-2017"));
////
////        for (Email book : bookList) {
////            emailService.save(book);
////        }
////
////        Page<Email> byAuthor = emailService.findByAuthor("Rambabu Posa", new PageRequest(0, 10));
////        assertThat(byAuthor.getTotalElements(), is(4L));
////
////        Page<Email> byAuthor2 = emailService.findByAuthor("Mkyong", new PageRequest(0, 10));
////        assertThat(byAuthor2.getTotalElements(), is(1L));
////
////    }
//
////    @Test
////    public void testDelete() {
////
////        Email book = new Email("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017");
////        emailService.save(book);
////        emailService.delete(book);
////        Email testBook = emailService.findOne(book.getId());
////        assertNull(testBook);
////    }
//
//}
