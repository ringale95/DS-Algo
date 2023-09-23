public class Client{
    public static void main(String args[]){
        IQueue<String> queue = new Queue<>();
        // call enqueue "Raveena"
        queue.enqueue("Raveena");
        // call enqueue "Aniruddha"
        queue.enqueue("Aniruddha");
        // check size of queue
        System.out.println("Current size:"+queue.size());
        // call dequeue - expected is "Raveena"
        System.out.println(queue.dequeue());
        // check size of queue
        System.out.println("Current size:"+queue.size());
    }
}