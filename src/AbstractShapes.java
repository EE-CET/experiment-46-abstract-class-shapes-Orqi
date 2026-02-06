abstract class Shape {
    abstract void numberOfSide();
    // TODO: Abstract method numberOfSides()
   
}
class Rectangle extends Shape{
    void numberOfSide(){
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape{
    void numberOfSide(){
        System.out.println("Triangle has 3 sides");
    }
}
class Hexagon extends Shape{
    void numberOfSide(){
        System.out.println("Hexagon has 6 sides");
    }
}


// TODO: Create class Rectangle extends Shape
// Implement numberOfSides() to print "Rectangle has 4 sides"

// TODO: Create class Triangle extends Shape
// Implement numberOfSides() to print "Triangle has 3 sides"

// TODO: Create class Hexagon extends Shape
// Implement numberOfSides() to print "Hexagon has 6 sides"

public class AbstractShapes {
    public static void main(String args[]){
            Shape s1 = new Rectangle();
            Shape s2 = new Triangle();
            Shape s3 = new Hexagon();
            s1.numberOfSide();
            s2.numberOfSide();
            s3.numberOfSide();

    }
        // TODO: Create objects for Rectangle, Triangle, and Hexagon
        // TODO: Call numberOfSides() for each object in the order: Rectangle, Triangle, Hexagon
    
}
