package ch23;

class CommonPerson {
    protected String name;
    protected int age;

    public CommonPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public boolean equals(Object obj) {
        String name = ((CommonPerson) obj).name;
        int age = ((CommonPerson) obj).age;

        return this.name.equals(name) && this.age == age;
    }


}
