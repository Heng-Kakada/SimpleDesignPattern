package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder subject() {

        List<String> subs = new ArrayList<>(
                List.of(
                        "Micro Economics",
                        "Business",
                        "Management"
                )
        );

        this.subs = subs;
        return this;
    }
}
