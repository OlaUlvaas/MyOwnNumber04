package se.lexicon.ex03;

import java.util.Arrays;

public class SystemDeveloper extends Employee {
    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(){
        certificates = new String[0];
        languages = new String[0];
    }

    @Override
    public void calculateSalary(){
        int baseSalary = 25000;
        int extraPerCert = 1000;
        int extraPerLanguage = 1500;
        double salary = baseSalary + (extraPerCert * certificates.length) +
                (extraPerLanguage * languages.length);
        this.setSalary(salary);
    }
    public void addLanguange(String programmingLanguage){
        String[] languageArray = Arrays.copyOf(languages, languages.length + 1);
        languageArray[languageArray.length - 1] = programmingLanguage;
        this.setLanguages(languageArray);

    }
    public void addCertificate(String certificate){
        String[] certificateArray = Arrays.copyOf(certificates, certificates.length + 1);
        certificateArray[certificateArray.length - 1] = certificate;
        this.setCertificates(certificateArray);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SystemDeveloper that = (SystemDeveloper) o;
        return Arrays.equals(certificates, that.certificates) && Arrays.equals(languages, that.languages);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(certificates);
        result = 31 * result + Arrays.hashCode(languages);
        return result;
    }

    @Override
    public String toString() {
        return "Worker: " + nextId() +
                "\nFirstName: " + getFirstName() +
                "\nLastName: " + getLastName() +
                "\nAge: " + getAge() +
                "\nSalary: " + getSalary() +
                "\nDateHired: " + getDateHired() +
                "\nCertificates: " + Arrays.toString(certificates) +
                "\nLanguages: " + Arrays.toString(languages);
    }
}
