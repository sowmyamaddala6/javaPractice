// public class Demo {
// public static void main(String[] args) {
// int x = 7;
// int y = 4;

// boolean result x < y;

// System.out.println(result);

// }
// }
// public class Demo {
// public static void main(String[] args) {
// int a = 7;
// int b = 5;
// int x = 5;
// int y = 9;

// boolean result = a < b ^ x < y ^ a > 1;
// System.out.println(!result);

// }
// }
// *public class Demo {
// public static void main(String[] args) {
// int x = 28;
// if (x > 10 && x <= 20)
// System.out.println("Hello");
// else
// System.out.println("Bye");
// }
// }

/*
 * public class Demo {
 * public static void main(String[] args) {
 * int x = 6;
 * int y = 8;
 * int z = 4;
 * if (x > y && x > z)
 * System.out.println("Hello");
 * else if (y > x && y > z)
 * System.out.println("Bye");
 * else
 * System.out.println("Hai");
 * }
 * }
 */

/*
 * public class Demo {
 * public static void main(String[] args) {
 * int n = 5;
 * int result = 0;
 * // if (n % 2 == 0)
 * // result = 10;
 * // else
 * // result = 20;
 * result = n % 2 == 0 ? 10 : 20;
 * System.out.println(result);
 * 
 * }
 * }
 */

/*
 * public class Demo {
 * public static void main(String[] args) {
 * int n = 8;
 * 
 * switch (n) {
 * case 1:
 * System.out.println("monday");
 * break;
 * case 2:
 * System.out.println("tuesday");
 * break;
 * case 3:
 * System.out.println("wednesday");
 * break;
 * case 4:
 * System.out.println("thursday");
 * break;
 * case 5:
 * System.out.println("friday");
 * break;
 * case 6:
 * System.out.println("saturday");
 * break;
 * case 7:
 * System.out.println("sunday");
 * break;
 * default:
 * System.out.println("Enter a valid number");
 * }
 * }
 * }
 */

/*public class Demo {
    public static void main(String[] args) {
        {
            for (int i = 1; i <= 5; i++)
                System.out.println("DAY" + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println("    " + (j + 8) + " -" + (j + 9));
            }
        }

    }
}*/

/*class Calculator {
    int a;

    public int add(int n1, int n2) {
        return n1 + n2;

    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}*/

class Computer {
    public void playMusic() {
        System.out.println("Music Playing..");

    }

    public String getMeAPen(int cost) {
        return "Pen";
    }

}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
    }
}