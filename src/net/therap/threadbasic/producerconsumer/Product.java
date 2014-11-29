package net.therap.threadbasic.producerconsumer;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class Product {

    private int id;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
