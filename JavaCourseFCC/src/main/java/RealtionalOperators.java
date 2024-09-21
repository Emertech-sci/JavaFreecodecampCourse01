public class RealtionalOperators {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 15;

        // is equal to.
        System.out.printf("El numero %d es igual al numero %d: \n", number1, number2);
        System.out.println(number1 == number2);

        // is not equal to.
        System.out.printf("El numero %d es distinto al numero %d: \n", number1, number2);
        System.out.println(number1 != number2);

        // is greater than.
        System.out.printf("El numero %d es mayor al numero %d: \n", number1, number2);
        System.out.println(number1 > number2);

        // is less than.
        System.out.printf("El numero %d es menor al numero %d: \n", number1, number2);
        System.out.println(number1 < number2);

        // greater than or equal to.
        System.out.printf("El numero %d es mayor o igual al numero %d: \n", number1, number2);
        System.out.println(number1 >= number2);

        // less than or equl to.
        System.out.printf("El numero %d es menor o igual al numero %d: \n", number1, number2);
        System.out.println(number1 <= number2);

        // and operator
        int age = 31;
        if (age >= 18 && age <= 40){
            System.out.println("Eres una persona de mediana edad.");
        }else{
            System.out.println("Eres menor de edad o un adulto.");
        }
        // Permite hacer comparaciones.

        // or operator.
        boolean isStudent = false;
        boolean isEmployee = true;
        if(isEmployee || isStudent){
            System.out.println("Es empleado o estudiante.");
        }else{
            System.out.println("No es empelado ni estudiante.");
        }

        // reverse boolean.
        boolean isGraduate = !isStudent;
        System.out.println("¿El estudiante se ha graduad?");
        System.out.println(isGraduate);

        //increase values 1+.
        System.out.println("el numero vale: " + number1);
        number1 ++; // No sirve directamente en un System.out.println(number1++);
        System.out.println("El numero +1 vale: " + number1);
        System.out.println(number1++); // esta linea imprimira 13 aunque guarda la operacion en memoria.
        System.out.println(number1); // esta linea opera el incremento 13 +1 de la linea anterior que estaba en memoria.

        // increase the value direct to a System.out.println();
        System.out.println(++number1); //si se queire hacer directamente la operacion ++ debe ir previo a la variable a incrementar.
    }
}
