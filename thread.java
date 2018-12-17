 
class CurrentThreadDemo {

 public static void main(String args[]) {
 Thread t = Thread.currentThread();
 System.out.println("Current thread: " + t);

 
 t.setName("My Thread");
 System.out.println("After name change: " + t);
 
 try {
  for(int n = 5; n > 0; n--) {
   System.out.println(n);
   Thread.sleep(1000);
   }
  } catch (InterruptedException e) {
    System.out.println("Main thread interrupted");
    }
}
}
------------------------------------------------------------------------------------------
class Thread3 implements Runnable {
String name; // name of thread
Thread t;
Thread3(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}

// This is the entry point for thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name + ": " + i);
Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
System.out.println(name + " exiting.");
 }
}


class MultiThreadDemo {
public static void main(String args[]) {
new Thread1("One"); // start threads
new Thread2("Two");
new Thread3("Three");

try {
// wait for other threads to end
Thread.sleep(2000);
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
 }
System.out.println("Main thread exiting.");
 }
}
-------------------------------------------------------------------------------------------
// Create multiple threads.
class Thread1 implements Runnable {
String name; // name of thread
Thread t;
Thread1(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}

// This is the entry point for thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
System.out.println(name + " exiting.");
 }
}


class MultiThreadDemo1 {
public static void main(String args[]) {
new Thread1("One"); // start threads
new Thread1("Two");
new Thread1("Three");

try {
// wait for other threads to end
Thread.sleep(2000);
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
 }
System.out.println("Main thread exiting.");
 }
}

-------------------------------------------------------------------------------------------
class NewThread implements Runnable {
Thread t;

NewThread() {
t= new Thread(this,"demo Thrread");
System.out.println("Child thread: " +t);
t.start();
}

public void run() {
try {
for (int i=5; i>0;i--) {
System.out.println("Child thread:" +i);
Thread.sleep(1000);
}
}catch(InterruptedException e) {
System.out.println("child thread interrupted.");
}
System.out.println("Exiting child thread.");
 }
}

class ThreadDemo {
public static void main(String args[]) {
  new NewThread();
try {
for (int i=5; i>0;i--) {
System.out.println("Main thread: " +i);
Thread.sleep(3000);
  }
}catch(InterruptedException e) {
System.out.println("main thread interrupted.");
}
System.out.println("Exiting main thread.");
 }
}
---------------------------------------------------------------------------------------------
class NewThread extends Thread {

 NewThread() {
 super("demo thread");
 System.out.println("Child thread- " +this);
 start();
}


public void run() {
  try {
     for (int i=5; i>0;i--) {
     System.out.println("Child thread:" +i);
     Thread.sleep(500);
     }
   }catch(InterruptedException e) {
    System.out.println("child interrupted.");
     }
  System.out.println("Exciting child thread.");
   }
}


 class ExtendThread {
 
  public static void main(String args[]) {
     new NewThread();

try {
     for (int i=5; i>0;i--) {
     System.out.println("Main thread: " +i);
     Thread.sleep(2000);
    }
   }catch(InterruptedException e) {
    System.out.println("main thread interrupted.");
    }
  System.out.println(" main thread Exciting.");
  }
  ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
  
  class NewThread extends Thread {

 NewThread() {
 super("demo thread");
 System.out.println("Child thread- " +this);
 //start();
}


public void run() {
  try {
     for (int i=5; i>0;i--) {
     System.out.println("Child thread:" +i);
     Thread.sleep(500);
     }
   }catch(InterruptedException e) {
    System.out.println("child interrupted.");
     }
  System.out.println("Exciting child thread.");
   }
}


 class ExtendThread1 {
 
  public static void main(String args[]) {
   NewThread a=  new NewThread();
   a.start();

try {
     for (int i=5; i>0;i--) {
     System.out.println("Main thread: " +i);
     Thread.sleep(2000);
    }
   }catch(InterruptedException e) {
    System.out.println("main thread interrupted.");
    }
  System.out.println(" main thread Exciting.");
  }
}
