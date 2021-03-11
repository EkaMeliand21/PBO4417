class SimpleCircle{
      double radius;
      
      SimpleCircle() {

      }
  
      SimpleCircle(double newRadius) {
          radius = newRadius;
      }
  
      double getArea() {
          return radius * radius * Math.PI;
      }
      
      double getPerimeter() {
          return 2 * radius * Math.PI;
      }
      double getRadius(double newRadius) {
          return radius;
      }
}

  