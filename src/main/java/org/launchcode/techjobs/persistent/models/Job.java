package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getEmployer() {
//        return employer;
//    }

//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }
// commented out everything I don't need so I can see the changes
//    public String getSkills() {
//        return skills;
//    }

//    public void setSkills(String skills) {
//        this.skills = skills;
//    }


}
