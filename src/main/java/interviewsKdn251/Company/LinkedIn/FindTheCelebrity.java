package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 16.05.2017.
 */
// Suppose you are at a party with n people (labeled from 0 to n - 1) and among them, there may exist one celebrity.
// The definition of a celebrity is that all the other n - 1 people know him/her but he/she does not know any of them.

// Now you want to find out who the celebrity is or verify that there is not one. The only thing you are allowed to do
// is to ask questions like: "Hi, A. Do you know B?" to get information of whether A knows B. You need to find out the
// celebrity (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).

// You are given a helper function bool knows(a, b) which tells you whether A knows B. Implement a function int
// findCelebrity(n), your function should minimize the number of calls to knows.

// Note: There will be exactly one celebrity if he/she is in the party. Return the celebrity's label if there is a celebrity in the party. If there is no celebrity, return -1.
/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */
public class FindTheCelebrity {
    private static boolean knows(int a, int b){
        return true;
    }

    public static int getCelebrity(int n){
        // assume celebrity is the first person from the list
        int celebrity = 0;

        for (int i = 1; i < n; i++){
            // if celebrity knows celebrity than i-th person celebrity must not be current celebrity and
            // thus it may be i
            if (knows(celebrity, i)){
                celebrity = i;
            }
        }

        // check that tis is right celebrity
        for (int i = 0 ; i < n; i++){
            // for non celebrity person if he does not know celebrity or celebrity knows him
            // we have wrong celebrity
            if (i != celebrity &&  (!knows(i, celebrity) || knows(celebrity, i))){
                return -1;
            }
        }

        // all checkings passed
        return celebrity;
    }
}
