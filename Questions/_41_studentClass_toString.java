class StudentToString{
    String name;
    int age;
    String rollnumber;
    String house;

    public StudentToString(String name,int age,String rollnumber,String house){
        this.name=name;
        this.age=age;
        this.rollnumber=rollnumber;
        this.house=house;
    }

    @Override
    public String toString(){
        return "Student Details:{name:"+name+",age:"+age+",roll number:"+rollnumber+","+rollnumber+",house:"+house+"}";

    }

    public static void main(String[] args){
        StudentToString stu=new StudentToString("khushi",22,"22BCS1234","Red");
        System.out.println(stu);
        }


}