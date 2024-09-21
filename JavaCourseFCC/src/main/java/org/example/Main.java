
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Si no definimos un valor a la variable age dentro de la clase Main
    //se le asignara un valor predeterminado.
    //static int age = 31;
    public static void main(String[] arguments) {
        int age = 27;
        //age = 27;

        //Los strings se pueden escribir de varias maneras al concatenar una variable.
        System.out.println("I'm " + age + " years old");
        System.out.printf("I'm %d years old.\n", age);
    }
}