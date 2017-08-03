package ru.javabegin.training.fastjava2.javafx.interfaces.impls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.javabegin.training.fastjava2.javafx.interfaces.AddressBook;
import ru.javabegin.training.fastjava2.javafx.objects.Person;

import java.util.ArrayList;

// класс реализовывает интерфейс с помощью коллекции
public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    // для коллекции не используется, но пригодится для случая, когда данные хранятся в БД и пр.
    public void update(Person person) {
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void print(){
        int number = 0;
        System.out.println();
        for(Person person : personList){
            number++;
            System.out.println(number+") zadacha = "+person.getZadacha()+"; time = "+person.getTime());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Обед", "13:30"));
        personList.add(new Person("Пойти купить молоко", "14:30"));
        personList.add(new Person("Сходить забрать вещь", "15:30"));
        personList.add(new Person("Посмотреть сериал", "16:30"));
        personList.add(new Person("Поченить машину", "17:30"));
        personList.add(new Person("Сходить в бар", "18:30"));
        personList.add(new Person("Ужин", "19:30"));
    }



}

