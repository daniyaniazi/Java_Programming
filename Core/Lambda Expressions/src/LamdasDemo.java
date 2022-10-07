public class LamdasDemo {
    public void print(String message){}
    public  static  void show(){
        String localVar ="_";
        greet(new ConsolePrinter());

        // Anonymous inner class inside a method
        // this refrences to current instance of anonymous inner class
        // can have state
        greet(new IPrinter() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        // lambda expression
        //can access local vars , instance field
        // this reference to enclosing obj
        // no state it's just an anonymous func
        greet(message-> System.out.println(localVar+message));
        greet(System.out::println); //class/object::method


        LamdasDemo demo = new LamdasDemo();
        greet(demo::print);
    }

    public  static  void greet(IPrinter printer){
        printer.print("Hello Message");
    }
}
