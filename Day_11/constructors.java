

class student {
    int age = 14, id = 143;

    student(int id, int age) {
        id = id;
        age = age;

        System.out.println("Age : " + age + " id : " + id);
    }
}

class constructors {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        student s1 = new student(101, 12);
    }
}