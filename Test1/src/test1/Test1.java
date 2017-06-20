/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Fedotov
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class Test1 {

    //1. Выбрать максимальное число
    public static void maxOf3(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        } else {
            System.out.println("Какие-то числа равны!)");
        }

    }

    //2. Вывести длину строки
    public static void dlinaStroki(String string) {

        System.out.println("Длина строки - " + string.length());

    }

    //3. Вывести четные элементы массива
    public static void chetnye(int myArray[]) {
        int n = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                n = myArray[i];
                System.out.println("Четные элементы массива - " + n);
            }
        }
    }

    //4. Перевести число в символ
    public static void perevod(int a) {
        System.out.println((char) a);
    }

    /*4.1. Разбивка числа по цифрам. 
    Символьные значения числа XYZ, тоесть 'X' 'Y' 'Z'*/
    public static void perevodVSimvoly(int a) {
        String b=Integer.toString(a);
        for (int i = 0; i < b.length(); i++) {
            System.out.println("Символ №"+(i+1)+" введенного Вами числа - "+b.charAt(i));
        }
    }

    //5. Добавить в коллекцию n элементов и вывести их в консоль
    public static void aList(ArrayList<String> myCollect, int n) {
        for (int i = 0; i < n; i++) {
            myCollect.add("item" + i);
        }

        for (int i = 0; i < myCollect.size(); i++) {
            System.out.println("item " + i + " " + myCollect.get(i));
        }
    }

    //6. Вывести максимальный элемент массива
    public static void maxValue(int myArray[]) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Макс значение - " + max);

    }

    //7. Скачать картинку из интеренета
    public static void jpgDownload(URL url) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(url);
        } catch (IOException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (image != null) {
            try {
                ImageIO.write(image, "jpg", new File("C:\\Users\\GIP\\Documents\\forTest\\1.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Картинка сохранена!");
        }
    }

    /*8. Загрузить 3 потока с интервалами в 1с. Поток 1: 0-20 секунд. 
Поток 2: 0-10 секунд. Поток 3: 0-30 секунд.*/
    public static void countThread1() {
        for (int i = 1; i < 21; i++) {
            System.out.println("Поток 1, его секунды - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Что-то пошло не так 1");
            }
        }
    }

    public static void countThread2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Что-то пошло не так 2");
        }
        for (int i = 1; i < 11; i++) {
            System.out.println("Поток 2, его секунды - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Что-то пошло не так 3");
            }
        }
    }

    public static void countThread3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Что-то пошло не так 4");
        }
        for (int i = 1; i < 31; i++) {
            System.out.println("Поток 3, его секунды - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Что-то пошло не так 5");
            }
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        //1
        maxOf3(0, 2, 30);

        //2
        dlinaStroki("Word!");

        //3
        chetnye(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});

        //4
        perevod(148);
        
        //4.1
        perevodVSimvoly(1234567864);

        //5
        ArrayList<String> myCollect = new ArrayList<String>();
        aList(myCollect, 5);

        //6
        maxValue(new int[]{-100, -1, -20, 3050, -10490, -5, -6, -7, -800, 0});

        //7
        URL url = new URL("http://cchunterbooks.com/blog/wp-content/uploads/2016/06/Beach.jpg");
        jpgDownload(url);

        //8
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                countThread1();
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                countThread2();
            }
        };
        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                countThread3();
            }
        };
        Thread t1 = new Thread(runnable1);
        t1.start();
        Thread t2 = new Thread(runnable2);
        t2.start();
        Thread t3 = new Thread(runnable3);
        t3.start();
        
         /*9. Реализовать интерфейс Animal, классами: Dog, Cat, Human
         void sayHello();*/
         Dog doberman = new Dog();
         doberman.sayHello();
         new Cat().sayHello();
         Human vasiliyVakulenko = new Human();
         vasiliyVakulenko.sayHello();
    }
}
