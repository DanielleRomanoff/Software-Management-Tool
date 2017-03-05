package softwaremanagementtool.agile;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class UserStory extends BacklogEntry {
   
  private final StringProperty userStory;
  private final StringProperty acceptanceCriteria;
  private final ObjectProperty<LocalDate> dateCreated;
   
  /**
   *  History - Initials, Date, Description
   * 
   */
  public UserStory() {
    //setting default data to some attributes
    this.userStory= new SimpleStringProperty("user requirment");
    this.acceptanceCriteria = new SimpleStringProperty("some acceptance test");
    this.dateCreated = new SimpleObjectProperty<LocalDate>(LocalDate.now());
  }
  
  public String getType() {
  	return "UserStory";
  }
  
  public String getUserStory() {
    return userStory.get();
  }
  
  public void setUserStory(String inUserStory) {
    this.userStory.set(inUserStory);
  }
  
  public StringProperty userStoryProperty() {
    return userStory;
  }

  //Acceptance criteria setter and getter method
  public String getAcceptanceCriteria() {
    return acceptanceCriteria.get();
  }
  
  public void setAcceptanceCriteria(String inAcceptanceCriteria) {
    this.acceptanceCriteria.set(inAcceptanceCriteria);
  }
    
  public StringProperty acceptanceCriteriaProperty() {
    return acceptanceCriteria;
  }

  //date setter and getter method
  public LocalDate getDateCreated() {
    return dateCreated.get();
  }
  
  public void setDateCreated(LocalDate inDateCreated) {
    this.dateCreated.set(inDateCreated);
  }
    
  public ObjectProperty<LocalDate> dateCreatedProperty() {
    return dateCreated;
  }
}