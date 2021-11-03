package de4.webtech.web.api;

public class Person {

    private long id;
    private String firstname;
    private String lastname;
    private boolean vaccinated;
    /**
     * @param id
     * @param firstname
     * @param lastname
     * @param vaccinated
     */
    public Person(long id, String firstname, String lastname, boolean vaccinated) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vaccinated = vaccinated;
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     * @return the vaccinated
     */
    public boolean isVaccinated() {
        return vaccinated;
    }
    /**
     * @param vaccinated the vaccinated to set
     */
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    
}
