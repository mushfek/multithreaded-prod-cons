package net.therap.threadbasic.producerconsumer;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class ProducerConsumerMain {

    public static void main(String[] args) {

        final int SIZE = 5;
        final SharedQueue<Product> sharedBuffer = new SharedQueue<>(SIZE);

        /* instantiating producer and consumer threads */
        Thread producer = new Thread(new Producer(sharedBuffer), "Producer");
        Thread consumer = new Thread(new Consumer(sharedBuffer), "Consumer");

        /* starting threads */
        producer.start();
        consumer.start();
    }
}
