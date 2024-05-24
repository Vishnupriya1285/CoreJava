package stringexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Student
{
    private final int stuId;

    private final String stuName;
    private final int stuAge;
    private final List<Integer> stuMarks;
    private final String[] certifications;
    Student(int stuId, String stuName, int stuAge, List<Integer> stuMarks, String[] certifications) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuMarks = List.copyOf(stuMarks);
        //this.stuMarks= Collections.unmodifiableList(stuMarks);
        this.certifications = certifications.clone();
    }

    public int getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public List<Integer> getStuMarks() {
        return new ArrayList<>(this.stuMarks);
    }

    public String[] getCertifications() {

        return this.certifications.clone();
    }
    public void clonable() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This Object is not clonable!!!");
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        List<Integer> stuMarks= new ArrayList<>();
        stuMarks.add(95);
        stuMarks.add(90);
        stuMarks.add(85);
        stuMarks.add(100);
        String[] certifications={"AWS Cloud Practitioner","AWS Solutions Arctitect","Multi-Cloud Architect"};

        Student s1=new Student(101,"John",25, stuMarks, certifications);

        try {
            s1.clonable();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        List<Integer> copyStuMarks=s1.getStuMarks();
        copyStuMarks.add(90);
        String[] copyCertifications=s1.getCertifications();
        copyCertifications[2]="Java Certification";

        System.out.println(s1.getStuId());
        System.out.println(s1.getStuName());
        System.out.println(s1.getStuAge());
        System.out.println(s1.getStuMarks());
        System.out.println(Arrays.deepToString(s1.getCertifications()));
    }
}
