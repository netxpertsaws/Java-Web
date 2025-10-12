public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
// Main method
public static void main(String[] args) {
myStaticMethod(); // Call the static method
// myPublicMethod(); This would compile an error
    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
(Sales Module Three)
