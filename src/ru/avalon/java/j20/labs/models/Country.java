package ru.avalon.java.j20.labs.models;

import java.text.ParseException;
import java.util.Objects;

/**
 * Модель представления о стране.
 */
public class Country {
    /**
     * Код страны.
     */
    private final String code;
    /**
     * Название страны.
     */
    private final String name;

    /**
     * Основное конструктор класса.
     *
     * @param code код страны
     * @param name название страны
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Возвращает код страны.
     *
     * @return строковый код страны
     */
    public String getCode() {
        return code;
    }

    /**
     * Возвращает название страны.
     *
     * @return название страны
     */
    public String getName() {
        return name;
    }

    /*
     * TODO(Студент): для класса Country переопределить методы equals и hashCode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Country){
            return ((Country) o).code.equals(this.code) && ((Country) o).name.equals(this.name);
        } else return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName());
    }

    /**
     * Возвращает экземпляр страны созданный из переданного
     * текста в формате 'Код:Название'.
     *
     * @param text тектс в формате 'Код:Название'
     * @return новый экземпляр типа {@Link Country}.
     * @throws ParseException в случае, если переданная строка
     * имеет неверный формат.
     */
    public static Country valueOf(String text) throws ParseException {
        /*
         * TODO(Студент): Реализовать метод valueOf класса Country
         */
        if (!text.contains(":")) {
            throw new ParseException("No country information", 0);
        }
        String[] str = text.split(":");
        Country country = new Country(str[0], str[1]);
        return country;
        //throw new UnsupportedOperationException("Not implemented yet!");
    }
}
