package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder subject() {

        List<String> subs = new ArrayList<>(
                List.of(
                        "C/C++ Programming",
                        "Basic Physic",
                        "Arduino"
                )
        );
        this.subs = subs;
        return this;
    }
}
