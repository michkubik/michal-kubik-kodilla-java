package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Character.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {

/*        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Litwo ojczyzno ty moja", (poem -> "AAA " + poem + " BBB"));
        poemBeautifier.beautify("Cóż to za chłopak piękny i młody", (poem -> poem.toUpperCase()));
        poemBeautifier.beautify("LA LA LALALA", (poem -> poem.toLowerCase()));
        poemBeautifier.beautify("Mimozami jesień się zaczyna ", (poem -> poem.repeat(2)));
        poemBeautifier.beautify("Mimozami jesień się zaczyna", (poem -> poem.replace("jesień", "wiosna")));

        System.out.println("Printing expressions with method references");
        poemBeautifier.beautify("To jest nowy wiersz", FunctionalBeautifier::addABC);
        poemBeautifier.beautify("Nana nana na na na", FunctionalBeautifier::upperCasePoem);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        LocalDate now = LocalDate.now();

        Map<Integer, ForumUser> theResultUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() =='m')
                .filter(forumUser -> (now.getYear() - forumUser.getBirthDate().getYear()) > 20)
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .collect(Collectors.toMap(forumUser -> forumUser.getUserID(), forumUser -> forumUser));

        System.out.println("# users: " + theResultUserMap.size());
        theResultUserMap.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": " + integerForumUserEntry.getValue())
                .forEach(System.out::println);
    }
}