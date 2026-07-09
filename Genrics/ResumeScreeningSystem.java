import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String candidateName;
    public JobRole(String candidateName) { this.candidateName = candidateName; }
    public String getCandidateName() { return candidateName; }
    public abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) { super(name); }
    @Override public String getRoleName() { return "Software Engineer"; }
}
class DataScientist extends JobRole {
    public DataScientist(String name) { super(name); }
    @Override public String getRoleName() { return "Data Scientist"; }
}
class ProductManager extends JobRole {
    public ProductManager(String name) { super(name); }
    @Override public String getRoleName() { return "Product Manager"; }
}

class Resume<T extends JobRole> {
    private T roleProfile;
    public Resume(T roleProfile) { this.roleProfile = roleProfile; }
    public T getRoleProfile() { return roleProfile; }
}

public class ResumeScreeningSystem {
    public static void screenCandidates(List<? extends JobRole> candidates) {
        for (JobRole candidate : candidates) {
            System.out.println("Screening Candidate: " + candidate.getCandidateName() + " for Role: " + candidate.getRoleName());
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(seResume.getRoleProfile());
        pipeline.add(dsResume.getRoleProfile());
        pipeline.add(new ProductManager("Charlie"));

        System.out.println("--- Resume Screening Pipeline ---");
        screenCandidates(pipeline);
    }
}
