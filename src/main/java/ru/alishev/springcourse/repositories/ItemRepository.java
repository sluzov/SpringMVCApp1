package ru.alishev.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alishev.springcourse.models.Item;
import ru.alishev.springcourse.models.Person;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByItemName(String itemName);

    //person.getItems()
    List<Item> findByOwner(Person owner);




}
