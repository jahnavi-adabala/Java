class Marks
{
    setMarks()
    {
    int id=101;
    double javaMarks=45.5;
    double cMarks=67.75;
    double cppMarks=72.25;
    }
    displayMarks()
    {
        setmarks();
    }
}
class Result extends Marks
{
    compute();
    {
    
    float total=185.5;
    float avg=61.833332;
    }
    showResult()
    {
        compute();
    }


}
class SingleInheritanceDemo
{
     public static void main(String args[]){
     Main main = new Main();
     main.displayMarks();
     main.showResult();
}
}