package dz4;

import java.util.List;

public class Channel {
    private String name;
    private List<Program> programs;
    private int currentProgramIndex;

    public Channel(String name, List<Program> programs) {
        this.name = name;
        this.programs = programs;
        this.currentProgramIndex = 0;
    }

    public Channel(List<Program> programs) {
        this.programs = programs;
        this.currentProgramIndex = 0;
    }

    public String getName() {
        return name;
    }

    public Program getCurrentProgram(){
        return programs.get(currentProgramIndex);
    }

    public int getCurrentProgramIndex(){
        return currentProgramIndex;
    }

    public void nextProgram(){
        currentProgramIndex = (currentProgramIndex + 1) % programs.size();
    }

    public void previousProgram(){
        currentProgramIndex = (currentProgramIndex - 1 + programs.size()) % programs.size();
    }

    public List<Program> getPrograms() {
        return programs;
    }

}
