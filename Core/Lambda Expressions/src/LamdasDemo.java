public class LamdasDemo {
    public  static  void show(){
        greet(new ConsolePrinter());
    }

    public  static  void greet(IPrinter printer){
        printer.print("Hello Message");
    }
}
