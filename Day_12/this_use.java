class student {
    int id;

    student(int id) {
        this.id = id;
        System.out.println(id); 
    }

}

class this_use {
    public static void main(String[] args) {
        student s1 = new student(21);
        System.out.println(s1);
    }
}