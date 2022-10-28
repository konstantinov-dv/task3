public class Main {
    public static void main(String[] args) {

        // Переменные. Часть 2

        // задача 1
        int a = 1000000;
        System.out.println(a);
        byte b = 100;
        System.out.println(b);
        short c = 10000;
        System.out.println(c);
        long d = 15000000;
        System.out.println(d);
        float i = 1.5f;
        System.out.println(i);
        double f = 25.5;
        System.out.println(f);

        // задача 2
        double ad = 27.12;
        System.out.println(ad);
        long apple = 987678965549L;
        System.out.println(apple);
        double box = 2.786;
        System.out.println(box);
        boolean af = false;
        System.out.println(af);
        short ag = 569;
        System.out.println(ag);
        short ah = -159;
        System.out.println(ah);
        short aj = 27897;
        System.out.println(aj);
        byte ak = 67;
        System.out.println(ak);

        // задача 3
        short z = 23; // учитель Людмила
        short x = 27; // учитель Анна
        short v = 30; // учитель Екатерина
        short n = 480; // количество закупленных листов
        int m = n / (z + x + v);
        System.out.println("На каждого ученика рассчитано " + m + " листов бумаги");

        // задача 4
        short efficiencyCarTwoMinute = 16; // производ. за 2 минуты
        short efficiencyCarOneMinute = 16 / 2;
        System.out.println(efficiencyCarOneMinute); // производ. за 1 минуты

        short twentyMinute = 20;
        short oneDay = 24 * 60; // 1 день равен 24 часа * 60 мин
        int threeDay = oneDay * 3;
        int oneMonth = oneDay * 30;

        int efficiencyCarTwentyMinute = efficiencyCarOneMinute * twentyMinute;
        System.out.println("За 20 минут машины произвела бутылок " + efficiencyCarTwentyMinute + " штук");
        int efficiencyCarOneDay = efficiencyCarOneMinute * oneDay;
        System.out.println("За один день машины произвела бутылок " + efficiencyCarOneDay + " штук");
        int efficiencyCarThreeDay = efficiencyCarOneMinute * threeDay;
        System.out.println("За три дня машины произвела бутылок " + efficiencyCarThreeDay + " штук");
        int efficiencyCarOneMonth = efficiencyCarOneMinute * oneMonth;
        System.out.println("За один месяц машины произвела бутылок " + efficiencyCarOneMonth + " штук");

        // задача 5
        short potWhite = 2;
        short potBrown = 4;
        int oneClass = potWhite + potBrown;
        int totalSumPot = 120;
        int allClass = totalSumPot / oneClass;
        int totalBrown = allClass * potBrown;
        int totalWhite = allClass * potWhite;
        System.out.println("В школе, где " + allClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски" );

        // задача 6

        short bananas = 5;
        short milk = 2;
        short iceCream = 2;
        short eggs = 4;

        int grOneBanan = 80;
        int grOneMilk = 105;
        int grOneIcecream = 100;
        int grOneEgg = 70;

        int allGrBananas = bananas * grOneBanan;
        int allGrMilk = milk * grOneMilk;
        int allGrIcecream = iceCream * grOneIcecream;
        int allGrEggs = eggs * grOneEgg;
        int allGr = allGrBananas + allGrMilk + allGrIcecream + allGrEggs;
        System.out.println("Общий вес продуктов " + allGr + " гр" );
        float kg = 100; // в одном кг 100 гр.
        float  allKg = allGr / kg;
        System.out.println("Общий вес продуктов " + allKg + " кг");

        // задача 7
        short oneKg = 1000; // в 1 кг 1000 гр
        short totalKg = 7; // всего сбросить
        short oneCase = 250;
        short twoCase = 500;
        int totalGr = oneKg * totalKg;
        int daysOneCase = totalGr / oneCase;
        System.out.println(daysOneCase);
        int daysTwoCase = totalGr / twoCase;
        System.out.println(daysTwoCase);
        int middle = (daysOneCase + daysTwoCase) / 2;
        System.out.println(middle);

        // задача 8
        int masha = 67760;
        int den = 83690;
        int kris = 76230;

        double percentMasha = masha * 0.1;
        double percentDen = den * 0.1;
        double percentKris = kris * 0.1;
        int daysInYear = 12;
        double moreMoneyMasha = (masha + percentMasha) * daysInYear;
        double moreMoneyDen = (den + percentDen) * daysInYear;
        double moreMoneykris = (kris + percentKris) * daysInYear;

        double lessMoneyMasha = masha * daysInYear;
        double lessMoneyDen = den * daysInYear;
        double lessMoneyKris = kris * daysInYear;

        double differenceYaerMasha = moreMoneyMasha - lessMoneyMasha;
        double differenceYaerDen = moreMoneyDen - lessMoneyDen;
        double differenceYaerKris = moreMoneykris - lessMoneyKris;

        System.out.println("Маша теперь получает " + moreMoneyMasha + " рублей. Годовой доход вырос на " + differenceYaerMasha + " рублей" );
        System.out.println("Маша теперь получает " + moreMoneyDen + " рублей. Годовой доход вырос на " + differenceYaerDen + " рублей" );
        System.out.println("Маша теперь получает " + moreMoneykris + " рублей. Годовой доход вырос на " + differenceYaerKris + " рублей" );























    }
}