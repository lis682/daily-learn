package Exception;
public class Student {
    private String name;
    private  int age;
    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setage (int score){
        if(score<0)
        {
          //  NoScoreException nse=new NoScoreException("年龄不能为负数"+score);
           // throw nse;
            throw new NoScoreException("年龄不能为负数"+score);
        }
        this.age=score;
    }
}
