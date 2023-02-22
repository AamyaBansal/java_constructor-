public class studentt {
    private int prn;
    private String name;
    private String DOB;
    private double totalmarks;
    public Student(int prn, String name) {
        this.prn = prn;
        this.name = name;
    }
    //  private String DOB;
    // private double marks;
    Student(int prn, String nm, String d,double m)
    {
        this.prn=prn;
        name=nm;
        DOB=d;
        totalmarks=m;
    }
    public int getPrn()
    {
        return prn;
    }
    public void setPrn(int p)
    {
        prn=p;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public Student() {
    }
    public double getMarks() {
        return totalmarks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
}
