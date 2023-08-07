public class Main {
    public static void main(String[] args) {
        FullTimeEmployee Sample01 = new FullTimeEmployee("Sample01","00001",25000,7000);
        System.out.println(Sample01.calculateMonthlySalary());

        PartTimeEmployee Sample02 = new PartTimeEmployee("Sample02","00002",20,250);
        System.out.println(Sample02.calculateMonthlySalary());
    }
}