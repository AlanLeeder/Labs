public class Driver
{
    public static void main(String args[])
    { 
        ThreeDShape threeDShape;
        Shape shape;

        Circle circle = new Circle("Circle One", "Red", 10.0);
        Rectangle rectangle = new Rectangle("Rectangle One", "Yellow", 15.0, 20.0);
        Cylinder cylinder = new Cylinder("Cylinder One", "Green", 6, 8);
        Sphere sphere = new Sphere("Sphere One", "Blue", 77);

        // NEW Triangle object
        Triangle triangle = new Triangle("Triangle One", "Purple", 12, 9);

        // print them using references of the object type
        System.out.println("\n---Using circle reference" + circle.toString());
        System.out.println("\n---Using rectangle reference" + rectangle.toString());
        System.out.println("\n---Using cylinder reference" + cylinder.toString());
        System.out.println("\n---Using sphere reference" + sphere.toString());
        System.out.println("\n---Using triangle reference" + triangle.toString());
        System.out.println("Triangle area = " + triangle.area());


        // Using Shape reference for polymorphism
        shape = circle;
        System.out.println("\n---Using shape superclass reference for a circle " + shape.toString());
        System.out.println("Circle area = " + shape.area());

        shape = rectangle;
        System.out.println("\n---Using shape superclass reference for a rectangle " + shape.toString());
        System.out.println("Rectangle area = " + shape.area());

        shape = cylinder;
        System.out.println("\n---Using shape superclass reference for a cylinder " + shape.toString());
        System.out.println("Cylinder area = " + shape.area());

        threeDShape = cylinder;
        System.out.println("\n---Using threeDShape superclass reference for a cylinder " + threeDShape.toString());
        System.out.println("Cylinder area = " + threeDShape.area());
        System.out.println("Cylinder volume = " + threeDShape.volume());

        shape = sphere;
        System.out.println("\n---Using shape superclass reference for a sphere " + shape.toString());        
        System.out.println("Sphere area = " + shape.area());

        threeDShape = sphere;
        System.out.println("\n---Using threeDShape superclass reference for a sphere " + threeDShape.toString());
        System.out.println("Sphere area = " + threeDShape.area());
        System.out.println("Sphere volume = " + threeDShape.volume());

        // NEW: Using shape superclass ref for triangle
        shape = triangle;
        System.out.println("\n---Using shape superclass reference for a triangle " + shape.toString());
        System.out.println("Triangle area = " + shape.area());
    }
}