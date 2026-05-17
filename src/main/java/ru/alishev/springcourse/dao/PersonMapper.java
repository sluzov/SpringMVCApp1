package ru.alishev.springcourse.dao;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import ru.alishev.springcourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

 // Пример, как работает RowMapper изнутри (не используется в проектах, так как есть реализация в библиотеке)
public class PersonMapper implements RowMapper<Person> {
    @Nullable
    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }
}
