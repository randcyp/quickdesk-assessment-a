import java.util.Arrays;
import java.util.List;

public class Main {
    private static final int SIZE = 10;

    public static void main(String[] args) throws Exception {
        /*
         * A.a. Write 2 classes to implement the following
         * IQueueable interface
         */
        partAQuestionA(SIZE);

        /*
        A.b. If you've written your enqueue and dequeue using
        array methods, how would you rewrite the same functions
        without using any array methods?

        No methods from the built-in Arrays library were used,
        but if the question is asking about non-array implementations,
        multiple options are available, such as with linked lists or
        hash tables.
         */

        /*
        A.c. Show how you would improve the design of your classes,
        apply various design patterns and techniques as you see fit

        Not much was done due to time constraints (I have other
        assessments that were given to me in the same context as this
        assessment, as well as multiple university projects to worry
        about), but some exception handling is implemented within the
        queue implementations.
         */
    }

    private static void partAQuestionA(int size) throws Exception {
        List<IQueuable> queuesToTest = List.of(
                new FIFOQUEUE(size),
                new LIFOQUEUE(size)
        );

        for (IQueuable implementation : queuesToTest) {
            testImplementation(implementation, size);
        }
    }

    private static void testImplementation(IQueuable implementation,
                                           int size) throws Exception {
        // Queue things up!
        for (int i = 0; i < size; i++) {
            String integerString = Integer.valueOf(i).toString();
            implementation.enqueue(integerString);
        }

        // Try calling other methods!
        System.out.printf(
                "queue.size(): %d\n",
                implementation.size()
        );
        System.out.printf(
                "queue.getQueue(): %s\n",
                Arrays.toString(implementation.getQueue())
        );

        // Keep dequeueing until the queue is empty
        while (implementation.size() != 0) {
            System.out.printf(
                    "queue.deQueue(): %s\n",
                    implementation.dequeue()
            );
        }

        // Some blank lines for clarity
        System.out.print("\n\n");
    }
}