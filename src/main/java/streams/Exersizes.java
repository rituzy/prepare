package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by user on 03.06.2017.
 */
public class Exersizes {
    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario","Milan");
    static Trader alan = new Trader("Alan","Cambridge");
    static Trader brian = new Trader("Brian","Cambridge");
    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    /*
    Find all transactions in the year 2011 and sort them by value (small to high).
    
    right answer:
    transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::gtValue))
                .collect(Collectors.toList());
    }
    
     */
    public static List<Transaction> findTran2011(){
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()))
                .collect(Collectors.toList());
    }
    /*
        What are all the unique cities where the traders work?
        right answer:
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(toList());

    */
    public static List<String> uniqueCities(){
        return transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    /*
    Find all traders from Cambridge and sort them by name
        
    right answer:
    transactions.stream()
                .map(t -> t.getTrader())
                .filter(tr -> tr.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
    */
    public static List<Trader> findCambridgeTraders(){
        return transactions.stream()
                .map(t -> t.getTrader())
                .filter(tr -> tr.getCity().equals("Cambridge"))
                .distinct()
                .sorted((tr1, tr2) -> tr1.getName().compareTo(tr2.getName()))
                .collect(Collectors.toList());
    }

    /*
    Return a string of all traders’ names sorted alphabetically.
        
    right answer:
    String tradeStr =
    transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2)
    */
    public static String getAllNames (){

        List<String> names = transactions.stream()
                .map(t -> t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        StringBuilder toReturn = new StringBuilder();

        for (String n : names){
            toReturn.append(n + " ");
        }
        return toReturn.toString().trim();
    }

    /*
    Are any traders based in Milan?
    
    right answer:
    boolean milanBased = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
     */

    public static void isInMilan(){
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Milan"))
                .findAny()
                .ifPresent(t -> System.out.println(t.getTrader().getName()));
    }

    /*
    Print all transactions’ values from the traders living in Cambridge.
    
    right answer:
      transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

     */
    public static void printCambridgeTrans(){
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .forEach(t -> System.out.println(t.getValue()));
    }

    /*
    What’s the highest value of all the transactions?
    
    right answer:
    Optional<Integer> highVal = transactions.stream().map(t -> t.getValue()).reduce(Integer::max);
    */
    public static int findHighestVal(){
        return transactions.stream().map(t -> t.getValue()).reduce(Integer::max).get();
    }

    /*
    Find the transaction with the smallest value
    
    right answer:
    transactions.stream()
    .reduce( (t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
    */
    public static Transaction getSmallestTran(){
        return transactions.stream().
                filter(t -> t.getValue()
                        == (transactions.stream().map(t1 -> t1.getValue()).reduce(Integer::min).get())
                ).findFirst()
                .get();
    }

}
