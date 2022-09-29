public interface IQueuable {
    /**
     * Adds value to queue and returns new queue
     * @param value The item to be added
     * @return The queue with the added item
     */
    String[] enqueue(String value) throws Exception;

    /**
     * Removes item from queue
     * @return The item removed
     */
    String dequeue() throws Exception;

    /**
     * @return A list of all items in the queue
     */
    String[] getQueue();

    /**
     * @return The number of items in the queue
     */
    int size();
}