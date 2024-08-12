public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public void aproved(){
        if (finalGrade() >= 60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.printf("FALTARAM %.2f PONTOS", 60.0 - finalGrade());
        }
    }
}
