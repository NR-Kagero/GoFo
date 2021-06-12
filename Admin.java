package com.company;

/**
 * This is class administrator
 * This class is responsible for playgrounds and player approval
 * This class can suspend any
 * @author Kerllose George Jack
 * @version 1.0
 * @since 10/6/2021
 */
public class Admin {
    private String administratorName;
    private String administratorUsername;
    private String administratorPassword;

    /***
     * This default constructor
     */
    public Admin() {
        this.administratorName = null;
        this.administratorUsername = null;
        this.administratorPassword =null;
    }

    /***
     * This constructor sets main information of class administrator
     * @param administratorName
     * @param administratorUsername
     * @param administratorPassword
     */
    public Admin(String administratorName, String administratorUsername, String administratorPassword) {
        this.administratorName = administratorName;
        this.administratorUsername = administratorUsername;
        this.administratorPassword = administratorPassword;
    }

    /**
     * Sets administrator name
     * @param administratorName
     */
    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    /***
     * Gets administrator name
     * @return administratorName
     */
    public String getAdministratorName() {
        return administratorName;
    }

    /***
     * Sets administrator username
     * @param administratorUsername
     */
    public void setAdministratorUsername(String administratorUsername) {
        this.administratorUsername = administratorUsername;
    }

    /***
     * Gets administrator username
     * @return administratorUsername
     */
    public String getAdministratorUsername() {
        return administratorUsername;
    }

    /***
     * Sets administrator password
     * @param administratorPassword
     */
    public void setAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword;
    }

    /**
     * Gets administrator password
     * @return administratorPassword
     */
    public String getAdministratorPassword() {
        return administratorPassword;
    }

    /***
     * This function suspends player
     * @param player_Suspend
     */
    public void SuspendPlayer(Player player_Suspend){
        player_Suspend.setStatePlayer("Suspended");
    }

    /***
     * This function suspends playground
     * @param playground_Suspend
     */
    public void SuspendPlayground(Playground playground_Suspend){
        playground_Suspend.setStatePlayground("Suspended");
    }

    /***
     * This function activates player
     * @param player_Activate
     */
    public void ActivatePlayer(Player player_Activate){
        player_Activate.setStatePlayer("Suspended");
    }

    /***
     * This function activates playground
     * @param playground_Activate
     */
    public void ActivatePlayground(Playground playground_Activate){
        playground_Activate.setStatePlayground("Suspended");
    }

    /***
     * This function delete playground
     * @param playground_Delete
     */
    //public void DeletePlayground(Playground playground_Delete){ }

    /***
     * This function delete player
     * @param player_Delete
     */
    //public void DeletePlayer(Player player_Delete){ }
}
