package interviewsKdn251.Company.Google;

/**
 * Created by user on 08.05.2017.
 */

import java.util.HashMap;
// Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.

// Given a message and a timestamp (in seconds granularity), return true if the message should
// be printed in the given timestamp, otherwise returns false.

// It is possible that several messages arrive roughly at the same time.

// Example:

// Logger logger = new Logger();

// // logging string "foo" at timestamp 1
// logger.shouldPrintMessage(1, "foo"); returns true;

// // logging string "bar" at timestamp 2
// logger.shouldPrintMessage(2,"bar"); returns true;

// // logging string "foo" at timestamp 3
// logger.shouldPrintMessage(3,"foo"); returns false;

// // logging string "bar" at timestamp 8
// logger.shouldPrintMessage(8,"bar"); returns false;

// // logging string "foo" at timestamp 10
// logger.shouldPrintMessage(10,"foo"); returns false;

// // logging string "foo" at timestamp 11
// logger.shouldPrintMessage(11,"foo"); returns true;

public class LoggerRateLimiter {

    public static class Logger {
        HashMap<String, Integer> messages;

        public Logger() {
            this.messages = new HashMap<>();
        }

        public boolean shouldPrintMessage(int ts, String message){
            if (messages.containsKey(message)){
                if (ts - messages.get(message) > 10 ){
                    messages.put(message, ts);
                    return true;
                }else{
                    return false;
                }
            }else{
                messages.put(message, ts);
                return true;
            }
        }
    }
}
