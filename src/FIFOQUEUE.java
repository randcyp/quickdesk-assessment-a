import java.util.Arrays;

public class FIFOQUEUE implements IQueuable{
    private int size;

    // Points to the newest item in the queue
    private int cursor = 0;
    private String[] queue;

    /**
     * Creates a First In First Out queue
     * @param size The size of the queue
     */
    public FIFOQUEUE(int size) throws Exception{
        if (size < 0) {
            throw new Exception("Size cannot be negative");
        }
        this.size = size;
        this.queue = new String[this.size];
    }

    @Override
    public String[] enqueue(String value) throws Exception {
        if (this.size() == size) {
            // No spaces left, throw an Exception
            throw new Exception("Array is full!");
        }
        queue[cursor] = value;
        cursor++;
        return ArrayUtils.copyStringArray(this.queue);
    }

    @Override
    public String dequeue() throws Exception {
        if (this.size() == 0) {
            // No spaces left, throw an Exception
            throw new Exception("Array is empty!");
        }

        // Store the dequeued element to be returned
        // later
        String dequeued_element = queue[0];

        // Shift elements to the left
        cursor--;
        for (int i = 0; i < cursor; i++) {
            queue[i] = queue[i + 1];
        }
        return dequeued_element;
    }

    @Override
    public String[] getQueue() {
        return ArrayUtils.copyStringArray(this.queue);
    }

    @Override
    public int size() {
        return this.cursor;
    }
}
