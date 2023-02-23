package writingannotationprocessors.mytest;

public class MarkerTest {
    @Marker(id = 6, description = "my first description")
    public boolean f(){
        return true;
    }

    @Marker(id = 7, description = "Integer x")
    public Integer  x(){
        return 11;
    }
}
