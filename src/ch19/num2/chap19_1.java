package ch19.num2;

class Business implements Cloneable {
    private String company; // 회사
    private String work; // 업무

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo() {
        System.out.println("회사 : " + company);
        System.out.println("업무 : " + work);
    }

    @Override
    public Business clone() throws CloneNotSupportedException {
        return (Business) super.clone();
    }
}

class PersonalInfo implements Cloneable {
    private String name;
    private int age;
    private Business bz;

    public PersonalInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        bz = new Business(company, work);
    }

    public void showPersonalInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        bz.showBusinessInfo();
    }

    @Override
    public PersonalInfo clone() throws CloneNotSupportedException {
       return (PersonalInfo)super.clone();
    }
}

public class chap19_1 {
    public static void main(String[] args) {
        PersonalInfo org = new PersonalInfo("한상희", 24, "영남이공대학교", "학생");
        PersonalInfo cpy;

        try {
            cpy = org.clone();
            org.showPersonalInfo();

            System.out.println();
            cpy.showPersonalInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
