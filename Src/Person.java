public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Ковальчук", "Віталіна", "Нью Йорк", "+700314445555"));
        System.out.println(personInfo("Борушенко", "Остромир", "Сідней", "+560993245544"));
        System.out.println(personInfo("Рик", "Пилип", "Шепетівка", "+230556789901"));
    }
    private static String personInfo(String name, String surname, String city, String phoneNumber) {
        return String.valueOf("Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phoneNumber);
    }
}
