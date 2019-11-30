package ru.avalon.java.j20.labs.tasks;

import java.io.*;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {

        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * TODO(Студент): Выполнить задание №6
         *
         * 1. Реализовать метод read.
         *
         * 2. При реализации следует пользоваться классами:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    private Collection<Country> read(File file) throws IOException {
       try (Reader reader = new FileReader(file);
            BufferedReader input = new BufferedReader(reader)){
       
       Collection<Country> buffer = new ArrayList<>();
       String line;
       while ((line = input.readLine()) != null){
           try {
               Country country = Country.valueOf(line);
               buffer.add(country);
           } catch (ParseException e) {
               e.printStackTrace();
           }

       }
       return buffer;
       }
    }
}
