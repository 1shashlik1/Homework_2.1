public class Main {
    public static void main(String[] args) {
        //Задача№1
        byte a = 127;
        System.out.print("Значение переменной (а) с типом byte равно " + a + ".");
        short b = 32767;
        System.out.print("Значение переменной (b) с типом short равно " + b + ".");
        int c = 2147483647;
        System.out.print("Значение переменной (c) с типом int равно " + c + ".");
        long d = 922372036854775807L;
        System.out.print("Значение переменной (d) с типом long равно " + d + ".");
        float s = 3.4E+38f;
        System.out.print("Значение переменной (s) с типом float равно " + s + ".");
        double j = 1.7E+308;
        System.out.print("Значение переменной (а) с типом double равно " + j + ".");
        //Задача№2
        byte v = 67;
        System.out.print(v);
        short h = -159;
        System.out.print(h);
        char f = 569;
        System.out.print(f);
        int k = 27897;
        System.out.print(k);
        long l = 987678965549L;
        System.out.print(l);
        float p = 27.12f;
        System.out.print(p);
        double o = 2.786;
        System.out.print(o);
        //Задача№3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short list = 480;
        int allClass = lP + aS + eA;
        int sheetPerPerson = list / allClass;
        System.out.print("На каждого ученика рассчитано " + sheetPerPerson + " листов бумаги.");
        //Задание№4
        byte bottlesProduced = 16;
        byte productionTime = 2;
        int performance = bottlesProduced / productionTime;
        System.out.print("За одну минуту изготавливается " + performance + " бутылок.");
        int twentyMinutes = performance * 20;
        System.out.print("За двадцать минут изготавливается " + twentyMinutes + " бутылок.");
        int day = performance * ( 60 * 24 );
        System.out.print("За сутки изготавливается " + day + " бутылок.");
        int threeDays = performance * ( 60 * ( 24 * 3 ) );
        System.out.print("За 3 сутот изготавливается " + threeDays + " бутылок.");
        int month = performance * ( 60* ( 24 * 30 ) );
        System.out.print("За месяц изготавливается " + month + " бутылок.");
        //Задача№5
        byte totalPaint = 120;
        byte yOneClass = 4;
        byte cOneClass = 2;
        int allClasses = totalPaint / (yOneClass + cOneClass);
        int allYPaint = allClasses * yOneClass;
        int allCPaint = allClasses * cOneClass;
        System.out.print("В школе, где " + allClasses + " классов, нужно " + allYPaint + " банок белой краски и " + allCPaint + " банок коричневой краски.");
        //Задача№6
        byte Banana = 5;
        byte grOneBanana = 80;
        short milk = 200;
        byte grOneMilk = 105;// на сто милилитров молока
        byte iceCream = 2;
        byte grOneCream = 100;
        byte egg = 4;
        byte grOneEgg = 70;
        int allGr = ( Banana * grOneBanana ) + ( ( milk * grOneMilk ) / 100 ) + (iceCream * grOneCream ) + ( egg * grOneEgg );
        System.out.print("Всего " + allGr + "gr еды.");
        int kgEat = allGr / 1000;
        System.out.print("Всего " + kgEat + " килограмм.");//Получается 1.0 когда должно быть 1.09(Непонимаю)
        //Задание№7
        byte kgResetWeight = 7;
        short grMinReset = 250;
        short grMaxReset = 500;
        int grResetWeight = kgResetWeight * 1000;
        int minTimeReset = grResetWeight / grMinReset;
        int maxTimeReset = grResetWeight / grMaxReset;
        int TimeReset = ( minTimeReset + maxTimeReset ) / 2;
        System.out.print("В среднем спортсмен будет сбрасывать вес " + TimeReset + " День.");
        //Задача№8
        int mashaZp = 67760;
        int denZp = 83690;
        int crisZp = 76230;
        int yearMaZp = 67760 * 12;
        int yearDenZp = 83690 * 12;
        int yearCrZp = 76230 * 12;
        float mUpZp = ( mashaZp * ( 1 + 0.10f ) );
        float yearUpMaZp = ( mUpZp * 12 ) - yearMaZp;
        System.out.print("Маша в этом месяце получит " + mUpZp + " рублей. А годовой доход вырос на " + yearUpMaZp + " рублей.");
        float dUpZp = ( denZp * ( 1 + 0.10f ) );
        float yearUpDenZp = ( dUpZp * 12 ) - yearDenZp;
        System.out.print("Денис в этом месяце получит " + dUpZp + " рублей. А годовой доход вырос на " + yearUpDenZp + " рублей.");
        float cUpZp = ( crisZp * ( 1 + 0.10f ) );
        float yearUpCrZp = ( cUpZp * 12 ) - yearCrZp;
        System.out.print("Кристина в этом месяце получит " + cUpZp + " рублей. А годовой доход вырос на " + yearUpCrZp + " рублей.");
        //Опять же, непонятно почему в консоли не групируются выводы.
        //Домашка.
        //Я пока не стал менять строчки System.out.print на Systen.out.println но в следующий раз учту.
    }
}