class student {
    int id;

    student() {
        System.out.println(id);
    }

    student(int id) {
        System.out.print(id);
        this.id = id;
    }

    student(int a, int b) {
        id = a + b;
    }
}

class constructor_chain {
    public static void main(String[] args) {
        student s1 = new student(21);
    }
}