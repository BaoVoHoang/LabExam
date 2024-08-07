package Student;

public class StudentFactory {

    // Modify this method signature as needed.
    public Student getIsfullTime(boolean isfullTime){
        //TODO
        if(isfullTime = true) throw NotFoundException{ 
            return new FulltimeStudent();
        }
        elseif(isfullTime = false){
            return new partTimeStudent();
        }throw new NotFoundException("incorrect");
        
        }
    }


