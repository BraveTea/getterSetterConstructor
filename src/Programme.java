public class Programme {

    public static void main(String[] args){
        Student student1 = new Student("Hank", "mcCoy", 616);
        System.out.println(student1.getName());

        Student student2 = new Student();
        System.out.println(student2.getName());
    }
}

