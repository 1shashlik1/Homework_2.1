public class Main {
    public static void main(String[] args) {
        //Задача№1
        byte a = 127;
        System.out.println("Значение переменной (а) с типом byte равно " + a + ".");
        short b = 32767;
        System.out.println("Значение переменной (b) с типом short равно " + b + ".");
        int c = 2147483647;
        System.out.println("Значение переменной (c) с типом int равно " + c + ".");
        long d = 922372036854775807L;
        System.out.println("Значение переменной (d) с типом long равно " + d + ".");
        float s = 3.4E+38f;
        System.out.println("Значение переменной (s) с типом float равно " + s + ".");
        double j = 1.7E+308;
        System.out.println("Значение переменной (а) с типом double равно " + j + ".");
        //Задача№2
        byte v = 67;
        System.out.println(v);
        short h = -159;
        System.out.println(h);
        char f = 569;
        System.out.println(f);
        int k = 27897;
        System.out.println(k);
        long l = 987678965549L;
        System.out.println(l);
        float p = 27.12f;
        System.out.println(p);
        double o = 2.786;
        System.out.println(o);
        //Задача№3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short list = 480;
        int allClass = lP + aS + eA;
        int sheetPerPerson = list / allClass;
        System.out.println("На каждого ученика рассчитано " + sheetPerPerson + " листов бумаги.");
        //Задание№4
        byte bottlesProduced = 16;
        byte productionTime = 2;
        int performance = bottlesProduced / productionTime;
        System.out.println("За одну минуту изготавливается " + performance + " бутылок.");
        int twentyMinutes = performance * 20;
        System.out.println("За двадцать минут изготавливается " + twentyMinutes + " бутылок.");
        int day = performance * ( 60 * 24 );
        System.out.println("За сутки изготавливается " + day + " бутылок.");
        int threeDays = day * 3;
        System.out.println("За 3 сутот изготавливается " + threeDays + " бутылок.");
        int month = day * 30;
        System.out.println("За месяц изготавливается " + month + " бутылок.");
        //Задача№5
        byte totalPaint = 120;
        byte yOneClass = 4;
        byte cOneClass = 2;
        int allClasses = totalPaint / (yOneClass + cOneClass);
        int allYPaint = allClasses * yOneClass;
        int allCPaint = allClasses * cOneClass;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allYPaint + " банок белой краски и " + allCPaint + " банок коричневой краски.");
        //Задача№6
        byte banana = 5;
        byte grOneBanana = 80;
        short milk = 200;
        byte grOneMilk = 105;// на сто милилитров молока
        byte iceCream = 2;
        byte grOneCream = 100;
        byte egg = 4;
        byte grOneEgg = 70;
        int allGr = ( banana * grOneBanana ) + ( ( milk * grOneMilk ) / 100 ) + (iceCream * grOneCream ) + ( egg * grOneEgg );
        System.out.println("Всего " + allGr + "gr еды.");
        int kgEat = allGr / 1000;
        System.out.println("Всего " + kgEat + " килограмм.");//Получается 1.0 когда должно быть 1.09(Непонимаю)
        //Задание№7
        byte kgResetWeight = 7;
        short grMinReset = 250;
        short grMaxReset = 500;
        int grResetWeight = kgResetWeight * 1000;
        int minTimeReset = grResetWeight / grMinReset;
        int maxTimeReset = grResetWeight / grMaxReset;
        int timeReset = ( minTimeReset + maxTimeReset ) / 2;
        System.out.println("В среднем спортсмен будет сбрасывать вес " + timeReset + " День.");
        //Задача№8
        int mashaZp = 67760;
        int denZp = 83690;
        int crisZp = 76230;
        byte monthTwo = 12;
        float tenPercent = 1 + 0.10f;
        int yearMaZp = 67760 * monthTwo;
        int yearDenZp = 83690 * monthTwo;
        int yearCrZp = 76230 * monthTwo;
        float mUpZp = mashaZp * tenPercent;
        float yearUpMaZp = ( mUpZp * monthTwo ) - yearMaZp;
        System.out.println("Маша в этом месяце получит " + mUpZp + " рублей. А годовой доход вырос на " + yearUpMaZp + " рублей.");
        float dUpZp = denZp * tenPercent;
        float yearUpDenZp = ( dUpZp * month ) - yearDenZp;
        System.out.println("Денис в этом месяце получит " + dUpZp + " рублей. А годовой доход вырос на " + yearUpDenZp + " рублей.");
        float cUpZp = crisZp * tenPercent;
        float yearUpCrZp = ( cUpZp * monthTwo ) - yearCrZp;
        System.out.println("Кристина в этом месяце получит " + cUpZp + " рублей. А годовой доход вырос на " + yearUpCrZp + " рублей.");
        //Опять же, непонятно почему в консоли не групируются выводы.
        //Домашка.
        //Я пока не стал менять строчки System.out.print на Systen.out.println но в следующий раз учту.
    }
}