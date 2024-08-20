/** @author vivekkumar
 * @version 2.0
 * @since 2024
 */
package com.abdulbari.javaDoc;

/**
 * @author vivekKumar
 *
 * Class for Library Book
 */

public class Book {
    /**
     * @value 10 default value
     */
    static  int val = 10;

    /**
     *
     * @param s Book Name
     */
    public Book(String s) {
    }

    /**
     *  Issue a book to student
     * @param roll
     * @throws Exception if a book is not available throws exception
     */
    public void issue(int roll) throws Exception{
    }

    /**
     * Check if Book is available or not
     * @param str
     * @return
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id Book id
     * @return return book name
     */
    public String getName(int id){
        return "";
    }

}
