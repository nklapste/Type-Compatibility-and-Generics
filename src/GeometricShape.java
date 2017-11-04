/**
 * Assignment 7: Type Compatibility and Generics <br />
 * The {@code GeometricShape} interface for all kinds of geometric shapes
 */
public interface GeometricShape<T extends GeometricShape<T>> {
    void describe();

    T supersize();

}
