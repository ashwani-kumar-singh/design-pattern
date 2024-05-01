S -> Single Responsibility Principle
O -> Open/Close Principle
L -> Liskov Substitution Principle
I -> Interface Segregation Principle
D -> Dependency Inversion Principle

Advantage of SOLID Principles -
    1. Avoid Duplicate Code
    2. Code Readability
    3. High Cohesion and Low Coupling
        High cohesion means keeping parts of a code base that are related to each other in a single place.
        Low coupling means is about separating unrelated parts of the code base as much as possible.
    4. Reduce Complexity

SOLID principles of OOPS-
1. Single Responsibility - Class should have single responsibility i.e. class should have only single reason to change.

   Problem: class: Invoice {
                        calculateInvoice(){}
                        printInvoice(){}
                        saveToDB(){}
                   }
   We have 3 responsibility in single Invoice class so there are 3 reason to change the Invoice class.

   Solution: Break the Invoice class into 3 classes.
             classes: InvoiceCalculator { calculateInvoice(){} }
                      InvoicePrinter { printInvoice(){} }
                      InvoiceDAO { saveToDB(){} }

2. Open/Close Principle: Class should be open for extension but close for modification.

   Problem: class: InvoiceDAO { saveToDB(){} }
   Let's say we need to do enhancement add a new method to saveToFile() under modifying existing InvoiceDAO class which is risky when live.

   Solution: Create interface: InvoiceDAO { save(Invoice invoice){} } that implements two classes
             DatabaseInvoiceDAO implements InvoiceDAO {
                                                        save(Invoice invoice){}
                                                   }
             FileInvoiceDAO implements InvoiceDAO {
                                                    save(Invoice invoice){}
                                                  }

3. Liskov Substitution Principle: If Class B is subtype of class A, then we should be able to replace object of A with of object B
   without breaking the behaviour of the program.

   Problem: Subclass should extend the capability of parent class not narrow it down.

   interface Vehicle {
        turnOnEngine();
        turnOnBrake();
        accelerate();
        openDoor();
   }

   Bicycle implements Vehicle {
        turnOnEngine() { throw errors there is no engine }
        turnOnBrake(){}
        accelerate() {}
        openDoor() { throw errors there is no door }
   }

   Motorcycle implements Vehicle {
        turnOnEngine() {}
        turnOnBrake(){}
        accelerate() {}
        openDoor() { throw errors there is no door }
   }
   Car implements Vehicle {
        turnOnEngine() {}
        turnOnBrake(){}
        accelerate() {}
        openDoor() {}
   }

   Solution: Break the Vehicle interface into 3 more interface (VeloMobile, TwoWheeler, FourWheeler) i.e. Interface Segregation principle.


4. Interface Segregation Principle: Interface should be such, that the client should not implement unnecessary functions they do not implement.

    Solution: Break the Vehicle interface into 3 more interface (VeloMobile, TwoWheeler, FourWheeler) i.e. Interface Segregation principle.

    interface VeloMobile {
        turnOnPaddle();
        accelerate();
        turnOnBrake();
      }

    interface TwoWheeler {
        turnOnEngine();
        accelerate();
        turnOnBrake();
    }

    interface FourWheeler {
        turnOnEngine();
        accelerate();
        turnOnBrake();
        openDoor();
    }

    Bicycle implements VeloMobile {
         turnOnPaddle(){}
         turnOnBrake(){}
         accelerate() {}
    }

    Motorcycle implements TwoWheeler {
         turnOnEngine() {}
         turnOnBrake(){}
         accelerate() {}
    }
    Car implements FourWheeler {
         turnOnEngine() {}
         turnOnBrake(){}
         accelerate() {}
         openDoor() {}
    }

5.Dependency Inversion Principle: Class should depend on interface rather than concrete class and both should be depending on abstract.
  Problem: 
  interface Computer {}
  interface Keyboard {}
  interface Mouse {}
  
  class Macbook implements Computer {}
  class WiredKeyBoard implements Keyboard {}
  class WiredMouse implements Mouse {}
  class WirelessKeyBoard implements Keyboard {}
  class WirelessMouse implements Mouse {}
  
  Now let's say we have Macbook class and is dependent on Concrete Class WiredKeyBoard and WiredMouse. Now if we want 
  to extend feature of macbook in future to support wireless keyboard & mouse that will not be supported.
  class Macbook implements Computer { 
                    Macbook(WiredKeyBoard, WiredMouse){}
                } 
  
  Solutions:  Macbook class is dependent on interface Keyboard and Mouse.
  Class Macbook implements Computer { 
                    Macbook(Keyboard, Mouse){}
                } 
  Now if we want to extend feature of Macbook to support wire/wireless keyboard and mouse, it will be easy to support functionality.


DRY stands for DON’T REPEAT YOURSELF
DRY principle is a basic principle of software development, aimed to reducing repetition of information. The DRY 
principle is stated as "Every piece of knowledge must have a single, unambiguous, representation within a system


KISS - KEEP IT SIMPLE STUPID 
To achieve, divide your system into pieces. Don’t write lengthy methods, divide logic into smaller reusable pieces as 
much as possible and try to use the existing piece in your method.

Keep your methods small, each method should never be more than 40-50 lines.

Each method should only solve one small problem, not many use cases. If you have a lot of conditions in 
the method, break these out into smaller methods. It will not only be easier to read and maintain but 
also can find bugs a lot faster.

YAGNI - You Aren't Gonna Need It

do not add any functionality until it's deemed necessary; in other words,  write the code which you need in the 
current situation. Don't add anything if you think will need it. Add your code logic for the present, 
don't think of what may be needed in the future.