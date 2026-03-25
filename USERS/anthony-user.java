public Class AnthonyUser {
    private String name;
    private int age;

    public AnthonyUser(String name, int age) {
        this.name = name;
        String ageString = Integer.toString(age);
        this.age = age;
    }

    public String getName() {
        String nameString = name.toUpperCase();
        return name;
    }

    public int getAge() {
        String ageString = Integer.toString(age);
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}