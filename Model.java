package com.example.ujjawal_pc.symptomchecker;

public class Model {
    private String symptom, disease, drug, doctor;

    public void setDoctor(String doctor) {
        this.doctor = doctor;}
    public void setDrug(String drug)
    {
        this.drug=drug;
    }
    public void setFirstName(String symptom)
    {
        this.symptom = symptom;
    }
    public void setLastName(String disease)
    {
        this.disease = disease;
    }
    public String getFirstName()
    {
        return symptom;
    }

    public String getLastName()
    {
        return disease;
    }

    public String getDrug()
    {
        return drug;
    }

    public String getDoctor()
    {
        return doctor;
    }
    public Model(String symptom, String disease, String drug, String doctor) {
        this.symptom = symptom;
        this.disease = disease;
        this.drug = drug;
        this.doctor = doctor;
    }
}
