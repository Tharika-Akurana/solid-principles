import java.util.List;

class AreaCalculator {
    public double calculateTotalArea (List<Shape>shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}