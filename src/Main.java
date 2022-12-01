public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int myInt = 78;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        byte myByte = 43;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        short myShort = 167;
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        long myLong = 17539L;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        float myFloat = 134.0974F;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        double myDouble = 9873.097;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        //task 2
        double firstValue = 27.12;
        long secondValue = 987678965549L;
        float thirdValue = 2.786F;
        boolean fourthValue = false;
        short fifthValue = 569;
        short sixthValue = -159;
        int seventhValue = 27897;
        byte eighthValue = 67;

        //task 3
        System.out.println("Task 3");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paperTotal = 480;
        int totalSchoolChildren = firstTeacher + secondTeacher + thirdTeacher;
        int paperCountPerSchoolChildren = paperTotal / totalSchoolChildren;
        System.out.println("На каждого ученика рассчитано " + paperCountPerSchoolChildren + " листов бумаги");

        //task 4
        System.out.println("Task 4");
        int bottles = 16;
        int minute = 2;
        int bottlesPerMinute = bottles / minute;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerTwentyMinutes + " штук");
        int bottlesPerDay = bottlesPerMinute * 1440; //60 минут * 24 = 1440
        System.out.println("За сутки машина произвела бутылок " + bottlesPerDay + " штук");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottlesPerThreeDays + " штук");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук");

        //task 5
        System.out.println("Task 5");
        int cansPaintTotal = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int paintCansSum = whitePaintPerClass + brownPaintPerClass;
        int classesTotal = cansPaintTotal / paintCansSum;
        int whitePaintTotal = classesTotal * whitePaintPerClass;
        int brownPaintTotal = classesTotal * brownPaintPerClass;
        System.out.println("В школе, где " + classesTotal + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");

        //task 6
        System.out.println("Task 6");
        int bananasCount = 5;
        int weightOfOneBanana = 80;
        int bananaWeightTotal = bananasCount * weightOfOneBanana;
        int totalMilkWeight = 105 * 2;
        int iceCreamBriquetteCount = 2;
        int weightOfOneIceCreamBriquette = 100;
        int iceCreamWeightTotal = iceCreamBriquetteCount * weightOfOneIceCreamBriquette;
        int eggsCount = 4;
        int weightOfOneEgg = 70;
        int eggsWeightTotal = eggsCount * weightOfOneEgg;
        int breakfastWeightInGrams = bananaWeightTotal + totalMilkWeight + iceCreamWeightTotal + eggsWeightTotal;
        System.out.println("Вес спорт-завтрака в граммах равен " + breakfastWeightInGrams);
        double breakfastWeightInKilograms = breakfastWeightInGrams * 0.001;
        System.out.println("Вес спорт-завтрака в килограммах равен " + breakfastWeightInKilograms);

        //task 7
        System.out.println("Task 7");
        int overweightInKilograms = 7;
        int numberOfGramsInAKilogram = 1000;
        int mustBeDroppedInGrams = overweightInKilograms * numberOfGramsInAKilogram;
        int ifEveryDayLoses250Grams = mustBeDroppedInGrams / 250;
        System.out.println("Количество дней на похудение, если спортсмен будет терять каждый день по 250 грамм, равно " + ifEveryDayLoses250Grams);
        int ifEveryDayLoses500Grams = mustBeDroppedInGrams / 500;
        System.out.println("Количество дней на похудение, если спортсмен будет терять каждый день по 500 грамм, равно " + ifEveryDayLoses500Grams);

        //task 8
        System.out.println("Task 8");
        int employeeMasha = 67760;
        int employeeDenis = 83690;
        int employeeKristina = 76230;
        int monthsInAYear = 12;
        int employeeMashaGetInAYear = employeeMasha * monthsInAYear;
        int employeeDenisGetInAYear = employeeDenis * monthsInAYear;
        int employeeKristinaGetInAYear = employeeKristina * monthsInAYear;
        double tenPercent = 0.1;
        double employeeMashaGetInAYearPlusTenPercent = employeeMashaGetInAYear + (tenPercent * employeeMashaGetInAYear);
        double employeeDenisGetInAYearPlusTenPercent = employeeDenisGetInAYear + (tenPercent * employeeDenisGetInAYear);
        double employeeKristinaGetInAYearPlusTenPercent = employeeKristinaGetInAYear + (tenPercent * employeeKristinaGetInAYear);
        double employeeMashaDifference = employeeMashaGetInAYearPlusTenPercent - employeeMashaGetInAYear;
        System.out.println("Маша теперь получает " + employeeMashaGetInAYearPlusTenPercent + " рублей. Годовой доход вырос на " + employeeMashaDifference + " рублей");
        double employeeDenisDifference = employeeDenisGetInAYearPlusTenPercent - employeeDenisGetInAYear;
        System.out.println("Денис теперь получает " + employeeDenisGetInAYearPlusTenPercent + " рублей. Годовой доход вырос на " + employeeDenisDifference + " рублей");
        double employeeKristinaDifference = employeeKristinaGetInAYearPlusTenPercent - employeeKristinaGetInAYear;
        System.out.println("Кристина теперь получает " + employeeKristinaGetInAYearPlusTenPercent + " рублей. Годовой доход вырос на " + employeeKristinaDifference + " рублей");
    }
}