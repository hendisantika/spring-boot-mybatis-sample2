package id.my.hendisantika.springbootmybatissample2;

import id.my.hendisantika.springbootmybatissample2.mapper.ToDoMapper;
import id.my.hendisantika.springbootmybatissample2.model.TODO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootMybatisSample2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisSample2Application.class, args);
    }

    @Autowired
    private ToDoMapper todoMapper;

    @Override
    public void run(String... args) throws Exception {

        TODO newItem = new TODO(2L, "title_2", "body_2");
        int createdCount = todoMapper.createNew(newItem);
        log.info("Created items count : " + createdCount);

        TODO item = todoMapper.findById(2L);
        log.info(String.valueOf(item));

        int deletedCount = todoMapper.deleteById(2L);
        log.info("Deleted items count : " + deletedCount);

        TODO deletedItem = todoMapper.findById(2L);
        log.info("Deleted item should be null : " + deletedItem);
    }
}
