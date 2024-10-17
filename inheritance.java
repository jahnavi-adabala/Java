class Marks
{
    int id=101;
    float javaMarks=45.5;
    float cMarks=67.75;
    float cppMarks=72.25;
    setMarks();
    displayMarks();
}
class Result extends Marks
{
    float total=185.5;
    float avg=61.833332;
    compute()
    {
    System.out.println("Id : "+id);
    System.out.println("Java marks : "javamarks);
    System.out.println("C marks : "+cmarks);
    System.out.println("cpp marks : "+cppmarks);
    System.out.println("Total : "total);
    System.out.println("Avg : "+avg);
    }
    result()
    {
        compute();
    }
}
class SingleInheritanceDemo
{
   public static void main(String args[]) 
   {
    main m = new main();
    m.setMarks();
    m.displayMarks();
    m.compute();
    m.result();
   }
}