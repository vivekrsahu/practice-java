package practice.corejava.designpatterns.creational;

import java.io.Serializable;

/**
 * It is used for creating a single instance that can be accessed anywhere.
 * <p>
 * It contains logic for preventing various contract-breakers:
 * <ul>
 *     <li>Multi-threading: Creating a Java static inner class to handle the instantiation
 *     ensures lazy loading and thread-safety.</li>
 *     <li>Cloning: Overriding {@link Object#clone() clone} method to intentionally
 *     throw {@link CloneNotSupportedException}</li>
 *     <li>Serialization: If it implements {@link Serializable} interface, then below method can be maintained.</li>
 *      <pre>{@code
 *      private Object readResolve() {
 *          return getInstance();
 *      }
 *      }</pre>
 * </ul>
 *
 * If lazy-loading is not a mandatory requirement, then enum must be preferred over Singleton classes.
 *
 * @author Vivek Ranjan Sahu
 */
public class Singleton {

    private static boolean isInstantiated = false;

    private Singleton() {
        if (isInstantiated) {
            throw new RuntimeException("Reflection is not allowed.");
        }
        isInstantiated = true;
    }

    /**
     * It handles the creation of the single instance.<p>
     * Inner static class is not loaded until it is referenced, hence it provides lazy loading.<br>
     * And as only one thread can initialize a class at a time, so it makes this thread-safe.
     */
    private static class SingleInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * To retrieve the single instance of this class.
     *
     * @return single instance
     */
    public static Singleton getInstance() {
        return SingleInstance.INSTANCE;
    }

    /**
     * To prevent cloning of this class.
     *
     * @throws CloneNotSupportedException to prevent cloning
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This is a Singleton class, hence Cloning is not allowed.");
    }

}
