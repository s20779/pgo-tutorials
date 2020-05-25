package zadanie01;

public interface Figure {
    double getPerimeter();
    double getArea();
    default String getType() {
        return this.getClass().getSimpleName();
    }
}
