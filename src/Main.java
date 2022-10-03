public class Main {
    public static void main(String[] args) {
// Домашка
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        // Задание 2
        String Super = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + Super);
        // Задание 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName1);
    }
}

public class HomeworkMethods {
    public static void main(String[] args) {
// Домашка
        // Задание 1
        checkLeapYear(2022);
        getDeviceLink(osType0, manufacturingYear2005);
        int deliveryDays = calculateDeliveryDays(deliveryDistance60);
        System.out.println("Потребуется дней:" + deliveryDays);
    }
    // Домашка
    // Задание 2
    public static void checkleapYear (int year){
        if (year %4 == 0 && year %100 != 0 || year % 400 == 0){
            System.out.println(year + "is leap year");
        } else {
            System.out.println (year + "is not leap year");
        }
    }
    // Домашка
    // Задание 3
    public static void getDeviceLink (int osType, int manufacturingYear){
        if (osType !=1 && osType !=0) {
            throw new IllegalArgumentExceptiin("Wrong os type");
        }
        intcurrentYear = LocalDate.now(). getYear();
        if (manufacturingYear > currentYear) {
            throw new IllegalArgumentException("Wront manufacturing year");
        }
        String osString = osYype == 0? "IOS": "Android";
        String versionString = manufacturingYear > 2015? "полную": "облегченную";
        System.out.println ("Установите % s версию  для % s по ссылке % n",VersionString, osString);
    }

    public static int calculateDeliveryDays (int deliveryDistance){
        if (deliveryDistance < 20) {
            return 1;
        } else{
            return (int) Math.round ((double) deliveryDistance/40) + 1;
        }
    }
}

