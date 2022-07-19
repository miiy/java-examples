package org.example;

import org.example.config.SpringConfig;
import org.example.service.BookService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AppTest
{
    @Autowired
    private BookService bookService;

    @Test
    public void testBookServiceSave()
    {
        bookService.save();
    }

}
