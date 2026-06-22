public class Day14 {
    static class Student {
        String name;
        String age;
        String regNo;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
        }

        static class Builder {
            private String name;
            private String age;
            private String regNo;


            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder age(String ageValue) {
                this.age = ageValue;
                return this;
            }

            public Builder regNo(String regNoValue) {
                this.regNo = regNoValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }
    static void main() {
        Student student = new Student.Builder()
                .name("Pravinza")
                .age("18")
                .regNo("2526K0689")
                .build();
        System.out.println(student.name);
    }
}
