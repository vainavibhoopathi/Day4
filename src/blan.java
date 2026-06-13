 static class student {
        String Name;
        int RegNo;
        String Department;
        int mathsMark;
        int PhysicsMark;
        int CSEMark;

        void StudentInfo(String Name, int RegNo) {
            this.Name = Name;
            this.RegNo = RegNo;
        }

        void information(String Name, int RegNo, String Department) {
            this.Department = Department;
        }

        void setMathsMark(int mathsMark) {
            this.mathsMark = mathsMark;
        }

        void setPhysicsMark(int PhysicsMarks) {
            this.PhysicsMark = PhysicsMark;
        }

        void setCSEMark(int CSEMark) {
            this.CSEMark = CSEMark;

        }

        int StudentMark(int MathsMarks) {
            System.out.println("Updating MathsMarks" + MathsMarks);
            return mathsMark;
        }

        int StudentMark(int PhysicsMark, int CSEMark) {
            System.out.println("Updating PhysicsMark" + PhysicsMark + "\tUpdating CSEMarks" + CSEMark);
            return StudentMark(PhysicsMark);
        }

        void Updatedmarks(int mathsMark) {
            this.mathsMark = mathsMark;
        }

        int Updatedmarks(int MathsMark, int PhysicsMark) {
            this.PhysicsMark = PhysicsMark;
            return PhysicsMark;
        }

        int Updatedmarks(int MathsMark, int PhysicsMark, int CSEMark) {
            this.CSEMark = CSEMark;
            return CSEMark;
        }

        void display() {
            System.out.println("Name:" + Name);
            System.out.println("RegNO:" + RegNo);
            System.out.println("Department:" + Department);
            System.out.println("MathsMark" + mathsMark);
            System.out.println("PhysicsMark:" + PhysicsMark);
            System.out.println("CSEMark:" + CSEMark);
        }

        public static void main(String[] args) {
            student m = new student();
            m.StudentInfo("Pravena", 2526105);
            m.information("Vainz", 2526106, "CT");
            m.setMathsMark(85);
            m.setPhysicsMark(90);
            m.setCSEMark(100);
            m.StudentMark(100);
            m.StudentMark(100, 58);
            m.Updatedmarks(50);
            m.Updatedmarks(50, 50);
            m.Updatedmarks(50, 100, 50);
            m.display();
        }
    }
    public static void main(String[] args) {
        student m = new student();
        m.StudentInfo("Pravena", 2526105);
        m.information("Vainz", 2526106, "CT");
        m.setMathsMark(85);
        m.setPhysicsMark(90);
        m.setCSEMark(100);
        m.StudentMark(100);
        m.StudentMark(50, 58);
        m.Updatedmarks(50, 50);
        m.Updatedmarks(0, 100, 50);
        m.display();
    }
