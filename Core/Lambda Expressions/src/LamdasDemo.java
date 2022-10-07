public class LamdasDemo {
    public  static  void show(){
        greet(new ConsolePrinter());

        // Anonymous inner class inside a method
        greet(new IPrinter() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }

    public  static  void greet(IPrinter printer){
        printer.print("Hello Message");
    }
}
