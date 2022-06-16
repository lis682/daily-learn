package Exception;

public class NoScoreExceptionStudentTest {
    public static void main(String[] args) {
        Student st =new Student();
        st.setAge(100);
        System.out.println(st.getAge());
        st.setage(-10);
        System.out.println(st.getAge());
    }
}
