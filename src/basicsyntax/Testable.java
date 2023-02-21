package basicsyntax;

import onjava.atunit.*;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }
    @Test
    void testExecute() { execute(); }
    @UseCase(id = 0)
    public int id(){
        return 4;
    }

    public static void main(String[] args) {
        System.out.println(new Testable().id());
    }
}