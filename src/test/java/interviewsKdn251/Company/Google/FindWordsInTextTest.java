package interviewsKdn251.Company.Google;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 28.05.2017.
 */
public class FindWordsInTextTest {
    @Test
    public void findSubstring() throws Exception {
        String text = "relevant data-access methods are exposed through the interface. This makes for a\n" +
                "flexible application design and allows the chosen persistence framework to be\n" +
                "swapped out with minimal impact on the rest of the application. If the implementation\n" +
                "details of the data-access tier were to leak into other parts of the application, the\n" +
                "entire application would become coupled with the data-access tier, leading to a rigid\n" +
        /*        "application design.\n" +
                "INTERFACES AND SPRING If, after reading the last couple of paragraphs,\n" +
                "you feel that I have a strong bias toward hiding the persistence layer behind\n" +
                "interfaces, then I’m happy I was able to get that point across. I believe that\n" +
                "interfaces are key to writing loosely coupled code and that they should be\n" +
                "used at all layers of an application, not just at the data-access layer. That said,\n" +
                "it’s also important to note that though Spring encourages the use of interfaces,\n" +
                "Spring doesn’t require them—you’re welcome to use Spring to wire a\n" +
                "bean (repository or otherwise) directly into a property of another bean without\n" +
                "an interface between them.\n" +
                "One way Spring helps you insulate your data-access tier from the rest of your application\n" +
                "is by providing a consistent exception hierarchy that’s used across all of its supported\n" +
                "persistence options.\n" +
                "10.1.1 Getting to know Spring’s data-access exception hierarchy\n" +
                "There’s an old joke about a skydiver who’s blown off course and ends up landing in a\n" +
                "tree, dangling above the ground. After a while, someone walks by, and the skydiver\n" +
                "asks where he is. The passerby answers, “You’re about 20 feet off the ground.” The skydiver\n" +
                "replies, “You must be a software analyst.” “You’re right. How did you know?” asks\n" +
                "the passerby. “Because what you told me was 100% accurate but completely worthless.”\n" +
                "That story has been told several times, with the profession or nationality of\n" +
                "the passerby different each time. But the story reminds me of JDBC’s SQLException.\n" +
                "If you’ve ever written JDBC code (without Spring), you’re probably keenly aware that\n" +
                "you can’t do anything with JDBC without being forced to catch SQLException. SQLException\n" +
                "means something went wrong while trying to access a database. But there’s\n" +
                "little about that exception that tells you what went wrong or how to deal with it.\n" +
                "Some common problems that might cause a SQLException to be thrown include\n" +
                "these:\n" +
                "constraint.\n" +
                "The big question surrounding SQLException is how it should be handled when it’s\n" +
                "caught. As it turns out, many of the problems that trigger a SQLException can’t be\n" +
                "284 CHAPTER 10 Hitting the database with Spring and JDBC\n" +
                "remedied in a catch block. Most SQLExceptions that are thrown indicate a fatal condition.\n" +
                "If the application can’t connect to the database, that usually means the application\n" +
                "will be unable to continue. Likewise, if there are errors in the query, little can be\n" +
                "done about it at runtime.\n" +
                "If nothing can be done to recover from a SQLException, why are you forced to\n" +
                "catch it?\n" +
                "Even if you have a plan for dealing with some SQLExceptions, you’ll have to catch\n" +
                "the SQLException and dig around in its properties for more information about the\n" +
                "nature of the problem. That’s because SQLException is treated as a one-size-fits-all\n" +
                "exception for problems related to data access. Rather than have a different exception\n" +
                "type for each possible problem, SQLException is the exception that’s thrown for all\n" +
                "data-access problems.\n" +
                "Some persistence frameworks offer a richer hierarchy of exceptions. Hibernate,\n" +
                "for example, offers almost two dozen different exceptions, each targeting a specific\n" +
                "data-access problem. This makes it possible to write catch blocks for the exceptions\n" +
                "that you want to deal with.\n" +
                "Even so, Hibernate’s exceptions are specific to Hibernate. As stated before,\n" +
                "we’d like to isolate the specifics of the persistence mechanism to the data-access layer.\n" +
                "If Hibernate-specific exceptions are being thrown, then the fact that you’re dealing\n" +
                "with Hibernate will leak into the rest of the application. Either that, or you’ll be\n" +
                "forced to catch persistence platform exceptions and rethrow them as platformagnostic\n" +
                "exceptions.\n" +
                "On one hand, JDBC’s exception hierarchy is too generic—it’s not much of a hierarchy\n" +
                "at all. On the other hand, Hibernate’s exception hierarchy is proprietary to Hibernate.\n" +
                "What we need is a hierarchy of data-access exceptions that are descriptive but\n" +
                "not directly associated with a specific persistence framework.\n" +
                "SPRING’S PERSISTENCE PLATFORM–AGNOSTIC EXCEPTIONS\n" +

                "Spring JDBC provides a hierarchy of data-access exceptions that solve both problems.\n" +
                "In contrast to JDBC, Spring provides several data-access exceptions, each descriptive of\n" +
                "the problem for which they’re thrown. Table 10.1 shows some of Spring’s data-access\n" +
                "exceptions lined up against the exceptions offered by JDBC.\n" +
                "As you can see, Spring has an exception for virtually anything that could go wrong\n" +
                "when reading from or writing to a database. And the list of Spring’s data-access exceptions\n" +
                "is more vast than what’s shown in table 10.1. (I would have listed them all, but I\n" +
                "didn’t want JDBC to get an inferiority complex.)\n" +
                "Even though Spring’s exception hierarchy is far richer than JDBC’s simple SQLException,\n" +
                "it isn’t associated with any particular persistence solution. This means you\n" +
                "can count on Spring to throw a consistent set of exceptions, regardless of which persistence\n" +
                "provider you choose. This helps to keep your persistence choice confined to the\n" +
                "data-access layer.\n" +
                "Learning Spring’s data-access philosophy 285\n" +
                "LOOK, MA! NO CATCH BLOCKS!\n" +
                "What isn’t evident from table 10.1 is that all of those exceptions are rooted with\n" +
                "DataAccessException. What makes DataAccessException special is that it’s an\n" +
                "unchecked exception. In other words, you don’t have to catch any of the data-access\n" +
                "exceptions thrown from Spring (although you’re welcome to if you’d like).\n" +
                "DataAccessException is just one example of Spring’s across-the-board philosophy\n" +
                "of checked versus unchecked exceptions. Spring takes the stance that many exceptions\n" +
                "are the result of problems that can’t be addressed in a catch block. Instead of\n" +
                "forcing developers to write catch blocks (which are often left empty), Spring promotes\n" +
                "the use of unchecked exceptions. This leaves the decision of whether or not to\n" +
                "catch an exception in your hands.\n" +
                "Table 10.1 JDBC’s exception hierarchy versus Spring’s data-access exceptions\n" +
                "JDBC’s exceptions Spring’s data-access exceptions\n" +
                "BatchUpdateException\n" +
                "DataTruncation\n" +
                "SQLException\n" +
                "SQLWarning\n" +
                "BadSqlGrammarException\n" +
                "CannotAcquireLockException\n" +
                "CannotSerializeTransactionException\n" +
                "CannotGetJdbcConnectionException\n" +
                "CleanupFailureDataAccessException\n" +
                "ConcurrencyFailureException\n" +
                "DataAccessException\n" +
                "DataAccessResourceFailureException\n" +
                "DataIntegrityViolationException\n" +
                "DataRetrievalFailureException\n" +
                "DataSourceLookupApiUsageException\n" +
                "DeadlockLoserDataAccessException\n" +
                "DuplicateKeyException\n" +
                "EmptyResultDataAccessException\n" +
                "IncorrectResultSizeDataAccessException\n" +
                "IncorrectUpdateSemanticsDataAccessException\n" +
                "InvalidDataAccessApiUsageException\n" +
                "InvalidDataAccessResourceUsageException\n" +
                "InvalidResultSetAccessException\n" +
                "JdbcUpdateAffectedIncorrectNumberOfRowsException\n" +
                "LobRetrievalFailureException\n" +
                "NonTransientDataAccessResourceException\n" +
                "OptimisticLockingFailureException\n" +
                "PermissionDeniedDataAccessException\n" +
                "PessimisticLockingFailureException\n" +
                "QueryTimeoutException\n" +
                "RecoverableDataAccessException\n" +
                "SQLWarningException\n" +
                "SqlXmlFeatureNotImplementedException\n" +
                "TransientDataAccessException\n" +
                "TransientDataAccessResourceException\n" +
                "TypeMismatchDataAccessException\n" +
                "UncategorizedDataAccessException\n" +
                "UncategorizedSQLException\n" +
                "286 CHAPTER 10 Hitting the database with Spring and JDBC\n" +
                "To take advantage of Spring’s data-access exceptions, you must use one of Spring’s\n" +
                "supported data-access templates. Let’s look at how Spring templates can greatly simplify\n" +
                "data access.\n" +
                "10.1.2 Templating data access\n" +
                "You’ve probably traveled by plane before. If so, you’ll surely agree that one of the most\n" +
                "important parts of traveling is getting your luggage from point A to point B. There are\n" +
                "many steps to this process: When you arrive at the terminal, your first stop is at the\n" +
                "counter to check your luggage. Next, security scans it to ensure the safety of the flight.\n" +
                "Then it takes a ride on the luggage train on its way to being placed on the plane. If\n" +
                "you need to catch a connecting flight, your luggage needs to be moved, as well. When\n" +
                "you arrive at your final destination, the luggage has to be removed from the plane and\n" +
                "placed on the carousel. Finally, you go down to the baggage claim area and pick it up.\n" +
                "Even though there are many steps to this process, you’re actively involved in only a\n" +
                "couple of them. The carrier is responsible for driving the process. You’re involved\n" +
                "only when you need to be; the rest is taken care of. This mirrors a powerful design pattern:\n" +
                "the template method pattern.\n" +
                "A template method defines the skeleton of a process. In the example, the process\n" +
                "is moving luggage from departure city to arrival city. The process itself is fixed; it never\n" +
                "changes. The overall sequence of events for handling luggage occurs the same way\n" +
                "every time: luggage is checked in, luggage is loaded onto the plane, and so forth.\n" +
                "Some steps of the process are fixed as well—they happen the same way every time.\n" +
                "When the plane arrives at its destination, every piece of luggage is unloaded one at a\n" +
                "time and placed on a carousel to be taken to baggage claim.\n" +
                "At certain points, the process delegates its work to a subclass to fill in some implementation-\n" +
                "specific details. This is the variable part of the process. For example, the\n" +
                "handling of luggage starts with a passenger checking in the luggage at the counter.\n" +
*/
                "This part of the process always has to happen at the beginning, so its sequence";

 //       List<String> toFind = Arrays.asList("rest","Finally","before");
        List<String> toFind = Arrays.asList("This","be","implementation");
        System.out.println(FindWordsInText.findSubstring(text, toFind));
    }

}