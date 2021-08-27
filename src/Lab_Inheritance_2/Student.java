package Lab_Inheritance_2;

public abstract class Student implements CSEStudentType{

    @Override
    public void learnComputerScience() {
        System.out.println("Have to learn Computer Science");
    }
    @Override
    public void learnProgrammingLanguage(){
        System.out.println("Have to learn Programming Language");
    }
    @Override
    public void learnCoding(){
        System.out.println("Have to learn how to code");
    }

    public abstract void practice();
}

