public class Instructor {
    //           -- firstName
    //           -- lastName
    //           -- brainWaveFrequency
    //        -- Also, keep a count of the total number of instructors

    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0; // Static so every time an instructor is created, the num will change (e.g. a counter)

    public Instructor(String first, String last){
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++; // Will increment each time an instructor is created (e.g. add to the count)

        System.out.printf("\t%s was just created!\n", firstName); // "\t" tabs string in terminal, thus making it easier to read!!
        System.out.printf("\tInstructor count: %d\n\n", numInstructors);
    }

    // Getter and Setter for First Name

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String first){
        this.firstName = first;
    }

    // Getter and Setter for Last Name

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String last){
        this.lastName = last;
    }

    // Getter and Setter for Brainwave Frequency

    public int getBrainWaveFrequency(){
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq){
        this.brainWaveFrequency = brainWaveFreq;
    }

    // Method to display Instructor Info

    public String displayStats(){
        return String.format("\t%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFrequency);
    }
}
