import java.util.LinkedList;
import java.util.Queue;

public class QueueTimeCalculator {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(26);
        queue.add(5);
        queue.add(6);
        queue.add(25);
        queue.add(4);
        queue.add(6);

        Queue<Integer> output = calculateTime(queue);

        // Print the output
        while (!output.isEmpty()) {
            System.out.println(output.poll());
        }
    }

    public static Queue<Integer> calculateTime(Queue<Integer> queue) {
        Queue<Integer> output = new LinkedList<>();

        while (!queue.isEmpty()) {
            int items = queue.poll();
            int time;

            if (items < 4) {
                time = 2;
            } else {
                time = 7;
            }

            output.add(time);

            if (items > 0) {
                queue.add(items - 6);
            }
        }

        return output;
    }
}
