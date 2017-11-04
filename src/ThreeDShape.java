/**
 * Assignment 7: Type Compatibility and Generics <br />
 * The {@code ThreeDShape} interface
 */
public interface ThreeDShape<T extends ThreeDShape<T>> extends GeometricShape {
    double volume();

    T supersize();
}
