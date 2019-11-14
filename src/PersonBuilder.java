public final class PersonBuilder {
    private int age;
    private String name;
    private String job;
    private String lastname;
    private String firstname;

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withJob(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public PersonBuilder withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public Person build() {
        return new Person(age, name, job, lastname, firstname);
    }
}
