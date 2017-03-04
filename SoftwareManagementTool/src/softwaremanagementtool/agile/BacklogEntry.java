package softwaremanagementtool.agile;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class BacklogEntry {

	private final IntegerProperty id;
	private final StringProperty title;
	private final IntegerProperty priority;
	private final IntegerProperty storyPoints;
	
	public BacklogEntry() {
  	//ID, title and owner data will be displayed in the user story view
  	this.id = new SimpleIntegerProperty(0);
    this.title = new SimpleStringProperty("New");
    this.priority = new SimpleIntegerProperty(5);
    this.storyPoints = new SimpleIntegerProperty(1);
  }
	
	public int getID() {
    return id.get();
  }
  public void setID(int ID) {
    this.id.set(ID);
  }
	public IntegerProperty IDProperty() {
    return id;
  }
	
	 //title setter and getter method
  public String getTitle() {
    return title.get();
  }
  public void setTitle(String Title) {
    this.title.set(Title);
  }
  public StringProperty TitleProperty() {
    return title;
  }
  
  public String getType() {
  	return "None";
  }
}
