// Paso 1
interface Shape {
  void draw();
}

// Paso 2
class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Dibujando un círculo");
  }
}



class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Dibujando un rectángulo");
  }
}

class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("Dibujando un cuadrado");
  }
}

// Paso 3
class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker() {
    circle = new Circle();
    rectangle = new Rectangle();
    square = new Square();
  }

  public void drawCircle() {
    circle.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawSquare() {
    square.draw();
  }
}

// Paso 4
public class FacadeDemo {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();
    
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}