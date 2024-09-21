public class Operators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2  = 6;

        //adittion.
        int sum = number1 + number2; // 18
        System.out.println(number1 + " + " + number2 + " = " + sum);
        sum = sum + 5; // esta operación se puede reducir con operadores cortos.
        System.out.println("añadimos 5 unidades a la suma, ahora vale: " + sum);
        sum += 4;
        System.out.println("añadimos 4 unidades a la suma, ahora vale: " + sum);
        // esta asignacion de operadores sirve para todos los tipos de operadores aritmeticos.

        // substraction.
        int subs = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subs);

        // multiplication.
        int multi = number1 * number2;
        System.out.println(number1 + " X " + number2 + " = " + multi);

        // division.
        int div = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + div); // para todos los decimales debemos operar doubles y asignarlos a una variable double

        // modulo.
        int mod = number1 % number2;
        System.out.println(number1 + " % " + number2 + " = " + mod);
    }
}
